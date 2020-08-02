package com.mail.ingetion.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class OutLookReader_imaps {

	@Value("${spring.mail.username}")
	private String username = "pr330516@outlook.com";

	@Value("${spring.mail.password}")
	private String password = "Fzs_3422";

	@Autowired
	Folder inbox;

	private static final String CONNECT_SERVER = "outlook.office365.com";
	private static final int CONNECT_SERVER_PORT = 993;
//	private static final String SMTP_SERVER = "smtp.office365.com";
//	private static final int SMTP_PORT = 587;

	public OutLookReader_imaps() {
		System.out.println("Inside MailReader()...");
		try {
			final Session session = Session.getInstance(this.getEmailProperties(), new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			Store store = session.getStore("imaps");

			store.connect(CONNECT_SERVER, CONNECT_SERVER_PORT, username, password);
			inbox = store.getFolder("INBOX");
			// inbox.open(Folder.READ_ONLY);
			inbox.open(Folder.READ_WRITE);
			Message messages[] = inbox.search(new FlagTerm(new Flags(Flags.Flag.ANSWERED), false));
			// Message[] msgs = inbox.getMessages();

			System.out.println("No. of Unread Messages : " + inbox.getUnreadMessageCount());
			System.out.println("No. of Messages : " + inbox.getMessageCount());
			System.out.println("No. of Deleted Messages : " + inbox.getMode());

			FetchProfile fp = new FetchProfile();
			fp.add(FetchProfile.Item.ENVELOPE);

			inbox.fetch(messages, fp);

			try {

				printAllMessages(messages);

				inbox.close(true);
				store.close();

			} catch (Exception ex) {
				System.out.println("Exception arise at the time of read mail");
				ex.printStackTrace();
			}

		} catch (MessagingException e) {
			System.out.println("Exception while connecting to server: " + e.getLocalizedMessage());
			e.printStackTrace();
			System.exit(2);
		}

	}

	public void printAllMessages(Message[] msgs) throws Exception {
		for (int i = 0; i < msgs.length; i++) {
			System.out.println("MESSAGE #" + (i + 1) + ":");
			printEnvelope(msgs[i]);
		}
	}

	public void printEnvelope(Message message) throws Exception {
		System.out.println("#######Start ###########");
		System.out.println("Message : " + message.getDescription());
		System.out.println("#######End ###########");
//		createMessage(message);

		Address[] a;

		if ((a = message.getFrom()) != null) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Email From : " + a[j].toString());
			}
		}

		String subject = message.getSubject();

		Date receivedDate = message.getReceivedDate();
		Date sentDate = message.getSentDate();

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Email Subject : " + subject);
		System.out.println("Email From : " + message.getFrom());
		System.out.println("Email To : " + message.getAllRecipients());
		System.out.println("Size: " + message.getSize());
		System.out.println("Flags: " + message.getFlags());
		System.out.println("ContentType: " + message.getContentType());

		if (receivedDate != null) {
			System.out.println("Received Date: " + df.format(receivedDate));
		}

		System.out.println("Sent Date : " + df.format(sentDate));
	}

	public static void main(String args[]) {
		new OutLookReader_imaps();
	}

	public Properties getEmailProperties() {
		final Properties config = new Properties();
		config.put("mail.smtp.auth", "true");
		config.put("mail.smtp.starttls.enable", "true");
//		config.put("mail.smtp.host", SMTP_SERVER);
//		config.put("mail.smtp.port", SMTP_PORT);
		return config;
	}

	public void createMessage(Message message) throws MessagingException {
		String subject = message.getSubject();
		try {

			// store file
			String filename = "c:/tmp/" + subject + ".msg";
			message.writeTo(new FileOutputStream(new File(filename)));
		} catch (MessagingException ex) {
			System.out.println(" MSG Exp " + ex);
		} catch (IOException ex) {
			System.out.println(" MSG IOException " + ex);
		}
	}

}

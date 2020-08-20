package com.ingestion.mail.platform;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONObject;

import com.microsoft.graph.auth.confidentialClient.AuthorizationCodeProvider;
import com.microsoft.graph.auth.enums.NationalCloud;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import com.microsoft.graph.requests.extensions.IMessageCollectionPage;
@SpringBootApplication
public class GraphtutorialApplication {

	
	@Value("${app.id}")
	private String appId = "e172026f-f7c9-4272-a20f-a7f4040c73ea";
	
	@Value("${app.scopes}")
	private String scopes="Mail.Read, User.Read.All, Calendars.Read";
	
	
//	public static void main(String[] args) {
////		SpringApplication.run(GraphtutorialApplication.class, args);
//	}
	
	
	public static void main(String[] args) throws Exception {
		
		getUserInfoFromGraph(null);
		/*
		 * System.out.println("Java Graph Tutorial"); System.out.println(new
		 * GraphtutorialApplication().scopes);
		 * 
		 * // final String appId = "e172026f-f7c9-4272-a20f-a7f4040c73ea"; final
		 * String[] appScopes = new GraphtutorialApplication().scopes.split(",");
		 * 
		 * Authentication.initialize(new GraphtutorialApplication().appId); final String
		 * accessToken = Authentication.getUserAccessToken(appScopes);
		 * 
		 * // Greet the user User user = Graph.getUser(accessToken);
		 * System.out.println("Welcome " + user.displayName); System.out.println();
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * int choice = -1;
		 * 
		 * while (choice != 0) {
		 * System.out.println("Please choose one of the following options:");
		 * System.out.println("0. Exit"); System.out.println("1. Display access token");
		 * System.out.println("2. List calendar events");
		 * System.out.println("3. List Messages "); System.out.println("4. Get User ");
		 * 
		 * try { choice = input.nextInt(); } catch (InputMismatchException ex) { // Skip
		 * over non-integer input input.nextLine(); }
		 * 
		 * // Process user choice switch(choice) { case 0: // Exit the program
		 * System.out.println("Goodbye..."); break; case 1: // Display access token
		 * System.out.println("Access token: " + accessToken); break; case 2: // List
		 * the calendar listCalendarEvents(accessToken); break; case 3:
		 * Graph.getListMailFolders(accessToken); case 4:
		 * com.microsoft.graph.models.extensions.User user2 =
		 * Graph.getUser(accessToken); break; default:
		 * System.out.println("Invalid choice"); } }
		 * 
		 * input.close();
		 */}

	    // <FormatDateSnippet>
	    private static String formatDateTimeTimeZone(DateTimeTimeZone date) {
	        LocalDateTime dateTime = LocalDateTime.parse(date.dateTime);

	        return dateTime.format(
	            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)) +
	            " (" + date.timeZone + ")";
	    }
	    // </FormatDateSnippet>

	    // <ListEventsSnippet>
	    private static void listCalendarEvents(String accessToken) {
	        // Get the user's events
	        List<Event> events = Graph.getEvents(accessToken);

	        System.out.println("Events:");

	        for (Event event : events) {
	            System.out.println("Subject: " + event.subject);
	            System.out.println("  Organizer: " + event.organizer.emailAddress.name);
	            System.out.println("  Start: " + formatDateTimeTimeZone(event.start));
	            System.out.println("  End: " + formatDateTimeTimeZone(event.end));
	        }

	        System.out.println();
	    }
	    // </ListEventsSnippet>
	
	    
//	 public static void getMessages(String authorizationCode) {
//		 
////		 AuthorizationCodeProvider authProvider = new AuthorizationCodeProvider(CLIENT_ID, SCOPES, , 
////		 REDIRECT_URL, NATIONAL_CLOUD, TENANT, CLIENT_SECRET);		 
//		 AuthorizationCodeProvider authProvider = new AuthorizationCodeProvider("e172026f-f7c9-4272-a20f-a7f4040c73ea", 
//					Arrays.asList("https://graph.microsoft.com/user.read.all",
//							"https://graph.microsoft.com/Mail.ReadWrite",
//							"https://graph.microsoft.com/Mail.ReadWrite",
//							"https://graph.microsoft.com/Mail.ReadWrite",
//							"https://graph.microsoft.com/Mail.ReadWrite",
//							"https://graph.microsoft.com/Mail.ReadBasic"), 
//					authorizationCode,
//					"http://localhost/myapp/", 
//					NationalCloud.Global, 
//					"common", 
//					authorizationCode);
//		 
//		 
//		 
//		 IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();
//
//		 IMessageCollectionPage messages = graphClient.me().messages()
//		 	.buildRequest()
//		 	.get();
//	 }
	    
	    
	    private static String getUserInfoFromGraph(String accessToken) throws Exception {
	    	
	    	accessToken = "EwBwA8l6BAAUO9chh8cJscQLmU+LSWpbnr0vmwwAAeGpnWqR+if9VpDdZudHbJxOxBqDjYTCR7Ml01gDbuQwUxdfGc3FXkMHGNGx6hKBHQAbZaeifSVSUC3ZFMLpzDdPMTj/32B0IeIZ9WfwiO8O36W/mT/NBJuJI5jtnfNoe/QzXTeYwCPAwxG3ycSgyEPg/XPjrQYxr0UHD91yBevX0JYao0rpO3K5VUzWwURQewblyiq0JwvqeIWxWcVhm107eOO5HmEtPMH73hQWvdhyfFzsEVp2KlvaFK55cea5NuJeBFlII2kMlE01VpM3vhOrm5zCWgGVVnjNK4TurerbRYvyzzQlDqyvALmGTXUmuN5URO5FUvMmaBIah3HyWFsDZgAACCz2GgKAn5q+QAJfgK5jUs8K0C6j2e9yjy6XyQB9PgNubnAF2bje5LCefP0pjLHtDfdkyxRFhI9JHYe+liJkDhsgrOsOD0+qzZXOhB4mfE7MdGi/ppfBDwRkFSoZB9+tfN3kMy2I/oAG7IC4MNsVUCQO/jOwwA0hSD1Q5m0FJ+rFqoLSiMA9I2uZY0ESXFylqSJJYRPWqOf1g5U388JZvzM1szQWJ5eZMBkL8byETOQ0p8ddlUIAXdaeA6Ctr1Ini+KNzTGZrjR3yL7Ku1tGiYJjGaSkUE801bagiz9ptR2Mqb/DtLG+2JsXRMVXOiIyLLCtKEOQxwj6CfyoWDNntavWWTiCXxMp6mYvyhRGpWY96ePWCXSx7jntlX3gVWxu4bgr1T5gOpaLpJx6dXefOjwrSJ66UrVlbqpG/Vikksm4712G8BblYZeSo7RMBEF2SQnRAAjkkR3K5t98QXYDAGYTLrfOYmSVEXABqXCULgGlgbEkIzhkpEurzpumzSsFTiY+EcbAInW2q3BvJnY8NfpzqLawMAmscOg77Sw6foSdFhMA7RahqKMF+Z3B9T4CGxrprYSFDUKn2DQxI0Vw7QNZLjqTmilsOSJ64wC1Qs9nXsAIAtIWMAXrwtYARgn1Lo1vetlas4WIQNOGtPkwxsyEgu9ucSa4wicQJ89G51oy5JRyKdKXPfZVZ+4nzP5whjk8oFZVPTNlvf71ATr4sDnKMUjFE7B0zunDTCwXu4xM9/wj6kU46iTFNPnCirWAXPQ6MQTEQCg1+iaCAg==";
	    	
	        // Microsoft Graph user endpoint
//	        URL url = new URL("https://graph.microsoft.com/v1.0/me/messages");
	    	URL url = new URL("http://192.168.225.160:8083/messages");

	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	        // Set the appropriate header fields in the request header.
//	        conn.setRequestProperty("Authorization", "Bearer " + accessToken);
//	        conn.setRequestProperty("Accept", "application/json");

	        String response = HttpClientHelper.getResponseStringFromConn(conn);
	        
	        System.out.println(" Response : "+response);

	        int responseCode = conn.getResponseCode();
	        if(responseCode != HttpURLConnection.HTTP_OK) {
	            throw new IOException(response);
	        }

	        JSONObject responseObject = HttpClientHelper.processResponse(responseCode, response);
	        return responseObject.toString();
	    }


}

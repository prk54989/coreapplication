package com.codebase.event.message.producer.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Value
{
	@JsonProperty("@odata.etag")
    private String odataEtag;
	
	@JsonProperty("@odata.type")
    private String odataType;
	
	@JsonProperty("@odata.mediaContentType")
    private String mediaContentType;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("contentType")
	private String contentType;
	
	@JsonProperty("size")
	private int size;
	
	@JsonProperty("isInline")
	private boolean isInline;

	@JsonProperty("contentId")
	private String contentId;

	@JsonProperty("contentLocation")
	private String contentLocation;

	@JsonProperty("contentBytes")
	private String contentBytes;

	@JsonProperty("id")
	private String id;

	@JsonProperty("createdDateTime")
	private String createdDateTime;

	@JsonProperty("lastModifiedDateTime")
	private String lastModifiedDateTime;

	@JsonProperty("changeKey")
	private String changeKey;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("receivedDateTime")
	private String receivedDateTime;

	@JsonProperty("sentDateTime")
	private String sentDateTime;

	@JsonProperty("hasAttachments")
	private boolean hasAttachments;

	@JsonProperty("internetMessageId")
	private String internetMessageId;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("bodyPreview")
	private String bodyPreview;

	@JsonProperty("importance")
	private String importance;

	@JsonProperty("parentFolderId")
	private String parentFolderId;

	@JsonProperty("conversationId")
	private String conversationId;

	@JsonProperty("conversationIndex")
	private String conversationIndex;

	@JsonProperty("isDeliveryReceiptRequested")
	private String isDeliveryReceiptRequested;

	@JsonProperty("isReadReceiptRequested")
	private boolean isReadReceiptRequested;

	@JsonProperty("isRead")
	private boolean isRead;

	@JsonProperty("isDraft")
	private boolean isDraft;

	@JsonProperty("webLink")
	private String webLink;

	@JsonProperty("inferenceClassification")
	private String inferenceClassification;

	@JsonProperty("body")
	private Body body;

	@JsonProperty("sender")
	private Sender sender;

	@JsonProperty("from")
	private From from;

	@JsonProperty("toRecipients")
	private List<ToRecipients> toRecipients;

	@JsonProperty("ccRecipients")
	private List<String> ccRecipients;

	@JsonProperty("bccRecipients")
	private List<String> bccRecipients;

	@JsonProperty("replyTo")
	private List<String> replyTo;

	@JsonProperty("flag")
	private Flag flag;

	public String getOdataEtag() {
		return odataEtag;
	}

	public void setOdataEtag(String odataEtag) {
		this.odataEtag = odataEtag;
	}

	public String getOdataType() {
		return odataType;
	}

	public void setOdataType(String odataType) {
		this.odataType = odataType;
	}

	public String getMediaContentType() {
		return mediaContentType;
	}

	public void setMediaContentType(String mediaContentType) {
		this.mediaContentType = mediaContentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isInline() {
		return isInline;
	}

	public void setInline(boolean isInline) {
		this.isInline = isInline;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getContentLocation() {
		return contentLocation;
	}

	public void setContentLocation(String contentLocation) {
		this.contentLocation = contentLocation;
	}

	public String getContentBytes() {
		return contentBytes;
	}

	public void setContentBytes(String contentBytes) {
		this.contentBytes = contentBytes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getChangeKey() {
		return changeKey;
	}

	public void setChangeKey(String changeKey) {
		this.changeKey = changeKey;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getReceivedDateTime() {
		return receivedDateTime;
	}

	public void setReceivedDateTime(String receivedDateTime) {
		this.receivedDateTime = receivedDateTime;
	}

	public String getSentDateTime() {
		return sentDateTime;
	}

	public void setSentDateTime(String sentDateTime) {
		this.sentDateTime = sentDateTime;
	}

	public boolean isHasAttachments() {
		return hasAttachments;
	}

	public void setHasAttachments(boolean hasAttachments) {
		this.hasAttachments = hasAttachments;
	}

	public String getInternetMessageId() {
		return internetMessageId;
	}

	public void setInternetMessageId(String internetMessageId) {
		this.internetMessageId = internetMessageId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyPreview() {
		return bodyPreview;
	}

	public void setBodyPreview(String bodyPreview) {
		this.bodyPreview = bodyPreview;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getParentFolderId() {
		return parentFolderId;
	}

	public void setParentFolderId(String parentFolderId) {
		this.parentFolderId = parentFolderId;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getConversationIndex() {
		return conversationIndex;
	}

	public void setConversationIndex(String conversationIndex) {
		this.conversationIndex = conversationIndex;
	}

	public String getIsDeliveryReceiptRequested() {
		return isDeliveryReceiptRequested;
	}

	public void setIsDeliveryReceiptRequested(String isDeliveryReceiptRequested) {
		this.isDeliveryReceiptRequested = isDeliveryReceiptRequested;
	}

	public boolean isReadReceiptRequested() {
		return isReadReceiptRequested;
	}

	public void setReadReceiptRequested(boolean isReadReceiptRequested) {
		this.isReadReceiptRequested = isReadReceiptRequested;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	public boolean isDraft() {
		return isDraft;
	}

	public void setDraft(boolean isDraft) {
		this.isDraft = isDraft;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getInferenceClassification() {
		return inferenceClassification;
	}

	public void setInferenceClassification(String inferenceClassification) {
		this.inferenceClassification = inferenceClassification;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public List<ToRecipients> getToRecipients() {
		return toRecipients;
	}

	public void setToRecipients(List<ToRecipients> toRecipients) {
		this.toRecipients = toRecipients;
	}

	public List<String> getCcRecipients() {
		return ccRecipients;
	}

	public void setCcRecipients(List<String> ccRecipients) {
		this.ccRecipients = ccRecipients;
	}

	public List<String> getBccRecipients() {
		return bccRecipients;
	}

	public void setBccRecipients(List<String> bccRecipients) {
		this.bccRecipients = bccRecipients;
	}

	public List<String> getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(List<String> replyTo) {
		this.replyTo = replyTo;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}
}

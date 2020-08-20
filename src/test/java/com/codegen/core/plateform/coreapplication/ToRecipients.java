package com.codebase.event.message.producer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToRecipients
{
	@JsonProperty("emailAddress")
	private EmailAddress emailAddress;

    public void setEmailAddress(EmailAddress emailAddress){
        this.emailAddress = emailAddress;
    }
    public EmailAddress getEmailAddress(){
        return this.emailAddress;
    }
}

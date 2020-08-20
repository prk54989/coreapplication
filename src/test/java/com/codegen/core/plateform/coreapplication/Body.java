package com.codebase.event.message.producer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Body
{
	@JsonProperty("contentType")
    private String contentType;

	@JsonProperty("content")
	private String content;

    public void setContentType(String contentType){
        this.contentType = contentType;
    }
    public String getContentType(){
        return this.contentType;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
}

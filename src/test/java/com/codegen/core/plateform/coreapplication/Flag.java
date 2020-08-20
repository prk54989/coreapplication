package com.codebase.event.message.producer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flag
{
	@JsonProperty("flagStatus")
	private String flagStatus;

    public void setFlagStatus(String flagStatus){
        this.flagStatus = flagStatus;
    }
    public String getFlagStatus(){
        return this.flagStatus;
    }
}
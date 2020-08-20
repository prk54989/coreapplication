package com.codebase.event.message.producer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailAddress
{
	@JsonProperty("name")
	private String name;

	@JsonProperty("address")
	private String address;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
}

package com.codebase.event.message.producer.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Root
{
	@JsonProperty("@odata.context")
	private String odataContext;

	@JsonProperty("@odata.nextLink")
	private String odataNextLink;

	@JsonProperty("value")
    private List<Value> value;

	public String getOdataContext() {
		return odataContext;
	}

	public void setOdataContext(String odataContext) {
		this.odataContext = odataContext;
	}

	public String getOdataNextLink() {
		return odataNextLink;
	}

	public void setOdataNextLink(String odataNextLink) {
		this.odataNextLink = odataNextLink;
	}

	public List<Value> getValue() {
		return value;
	}

	public void setValue(List<Value> value) {
		this.value = value;
	}


}

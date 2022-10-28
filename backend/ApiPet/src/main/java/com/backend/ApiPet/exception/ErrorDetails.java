package com.backend.ApiPet.exception;

import java.util.Date;

public class ErrorDetails {
	
	private Date data;
	private String message;
	private String details;
	
	public ErrorDetails() {
		
	}

	public ErrorDetails(Date data, String message, String details) {
		super();
		this.data = data;
		this.message = message;
		this.details = details;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}

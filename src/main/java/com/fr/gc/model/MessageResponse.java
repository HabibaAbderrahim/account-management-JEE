package com.fr.gc.model;

import java.io.Serializable;

public class MessageResponse implements Serializable {

	private boolean success;
	private String message;

	public MessageResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public MessageResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

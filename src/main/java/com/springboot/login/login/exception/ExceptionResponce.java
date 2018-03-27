package com.springboot.login.login.exception;

import java.util.Date;

public class ExceptionResponce {
	
	private Date timestrap;
	private String message;
	private String details;
	public ExceptionResponce(Date timestrap, String message, String details) {
		super();
		this.timestrap = timestrap;
		this.message = message;
		this.details = details;
	}
	public Date getTimestrap() {
		return timestrap;
	}
	public void setTimestrap(Date timestrap) {
		this.timestrap = timestrap;
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

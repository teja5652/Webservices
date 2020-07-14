package com.mypackage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Success {
	
	String Message;

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	

}

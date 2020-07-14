package com.mypackage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotFound {

	int no ; 
	String errormessage;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	} 
}


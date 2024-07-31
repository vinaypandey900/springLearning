package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotatioBean {
    private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public annotatioBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "annotatioBean [subject=" + subject + "]";
	}
	@PostConstruct
    public void start() {
    	System.out.println("Starting method");
    }
	@PreDestroy
    public void stop() {
    	System.out.println("End method");
    }
}

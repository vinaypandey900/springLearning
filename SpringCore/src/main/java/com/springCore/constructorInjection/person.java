package com.springCore.constructorInjection;

import java.security.cert.Certificate;

public class person {
    private String name;
    private int id;
    private Certi cer;
   
    public person(String name, int id, Certi cer) {
    	this.name=name;
    	this.id=id;
    	this.cer=cer;
    }
	@Override
	public String toString() {
		return this.name+": "+this.id+": "+this.cer.name;
	}
    
 }

package com.springCore.constructorInjection;

import java.lang.invoke.StringConcatFactory;

public class Certi {
     String name;
     public Certi() {
    	 
     }

	public Certi(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
    
}

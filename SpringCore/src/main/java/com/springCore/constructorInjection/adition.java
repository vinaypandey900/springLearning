package com.springCore.constructorInjection;

public class adition {
  private int a,b ;
  
  public adition(int a, int b) {
	  this.a=a;
	  this.b=b;
	  System.out.println("Constructor: int, int");
  }
  public adition(String a, String b) {
	  this.a=Integer.parseInt(a);
	  this.b=Integer.parseInt(b);
	  System.out.println("Constructor: String, String");
  }
  
  public void doSum() {
	  System.out.println("a= "+this.a);
	  System.out.println("b= "+this.b);
	  System.out.println("Sum is"+(this.a+this.b));
  }
}

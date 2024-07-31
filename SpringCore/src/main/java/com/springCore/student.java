package com.springCore;

public class student {
   private int studentId;
   private String studentName;
   private String studentAddress;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	//by adding sout confirms that we used setter injection
	System.out.println("Setting student id");
	this.studentId = studentId;
}
public String getStudentName() {
	
	return studentName;
}
public void setStudentName(String studentName) {
	System.out.println("Setting student  name");
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	System.out.println("Setting student  Address");
	this.studentAddress = studentAddress;
}
public student(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}
   
   
}

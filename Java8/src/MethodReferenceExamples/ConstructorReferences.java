package MethodReferenceExamples;

import java.util.function.Function;

//3..Using Constructor References 
class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
public class ConstructorReferences {
	public static void main(String[] args) {
		Function<String, Student>student=Student::new;
		System.out.println(student.apply("Vinay"));
	}
}

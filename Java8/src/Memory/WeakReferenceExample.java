package Memory;

import java.lang.ref.WeakReference;

class Student implements AutoCloseable{
	String name;
	Student(String name){
		this.name=name;
	}
	@Override
	public void close() throws Exception {
	  System.out.println(this.name+" resources are being released");
	}
}

public class WeakReferenceExample{
	public static void main(String[] args) throws Exception {
		
		try(Student student=new Student("John")) {
			WeakReference<Student>refernce=new WeakReference<Student>(student);
			System.out.println("Before nulling Strong reference "+refernce.get().name);
		}
		//System.gc();
		
		System.out.println("After GC: The object has been garbage collected if weak reference is null.");
    
	}
}
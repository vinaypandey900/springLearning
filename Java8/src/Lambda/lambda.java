package Lambda;

    //interface with one abstract method
@FunctionalInterface
	interface shape{
			void draw();
		}
	
	public class lambda {
	    public static void main(String [] args) {
	    	
	    	shape rectangle=()->{
	    		System.out.println("This is a rectangle shape");
	    	};
	    	
	    	shape triangle=()->{
	    		System.out.println("This is a triangle shape");
	    	};
	    	print(rectangle);
	    	//or we can write it as 
	    	print(()->System.out.println("This is rectangle inside print method"));
	    	print(triangle);
	    	//or we can write it as 
	    	print(()->System.out.println("This is Triangle inside print method"));
	    }
	    public static void print(shape sh) {
	    	sh.draw();
	    }
	}
	
	

package ParallelStreamRealLifeExample;

public class Customer {
	private String name;
	private int id;
	private String email;
	private double salary;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Customer(String name, int id, String email, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.salary = salary;
	}
	
	
}

package in.sp.beans;

public class Employee {
	private String name;
	private int id;
	private String email;
	private double salary;
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
	public void show()
	{
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		System.out.println("email:"+email);
		System.out.println("salary:"+salary);
	}
	

}

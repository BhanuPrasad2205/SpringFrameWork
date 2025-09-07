package in.sp.bean;

public class Student {
    private String name;
    private int age;
    private Address address;   // HAS-A relationship

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    

	public void display() {
		// TODO Auto-generated method stub

    	System.out.println("name"+name);
    	System.out.println("age"+age);
    	System.out.println("address"+address);
		
	}
}

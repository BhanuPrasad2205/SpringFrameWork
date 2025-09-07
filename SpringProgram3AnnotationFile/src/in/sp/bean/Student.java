package in.sp.bean;

import org.springframework.stereotype.Component;

@Component("student")  
public class Student {

    private String name;
    private int age;
    private float marks;

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

    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Marks: " + marks);
    }
}

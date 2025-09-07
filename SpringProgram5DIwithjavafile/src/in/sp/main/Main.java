package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.resources.SpringConfigFile;
import in.sp.bean.Student;

public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std11 = context.getBean(Student.class);
        std11.display();

         
    }
}

package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.Stu;
import in.sp.resources.SpringConfigFile;   
public class Main2 {
    public static void main(String[] args) {
        // Load Spring config class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        // Fetch bean
        Stu std = (Stu) context.getBean("stdId");  // Bean name must match method name in config
        std.display();
        System.out.println("-----------------------");
        Stu std2= (Stu) context.getBean("stdId1");
        std2.display();
    }	
}

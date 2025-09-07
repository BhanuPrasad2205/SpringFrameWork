package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
public class Main {
	public static void main(String[] args)
	{
		//String config_loc="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext("in/sp/resources/applicationContext.xml");
		Student std1=(Student) context.getBean("stdId1");
		std1.display();
		System.out.println("--------------------");
		Student std2=(Student) context.getBean("stdId2");
		std2.display();
	}
}

//spring-beans-xxx.jar
//spring-core-xxx.jar
//spring-context-xxx.jar
//common-logging-xxx.jar
//spring-expression-xxx.jar

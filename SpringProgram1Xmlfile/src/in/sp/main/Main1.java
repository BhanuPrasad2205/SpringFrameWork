package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;
public class Main1{
	public static void main(String[] args)
	{
		//String config_loc="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext("in/sp/resources/applicationContext1.xml");
		Employee emp1=(Employee) context.getBean("empid1");
		emp1.show();
		System.out.println("---------------------------");
		Employee emp2=(Employee) context.getBean("empid2");
		emp2.show();
	}
}

//spring-beans-xxx.jar
//spring-core-xxx.jar
//spring-context-xxx.jar
//common-logging-xxx.jar
//spring-expression-xxx.jar

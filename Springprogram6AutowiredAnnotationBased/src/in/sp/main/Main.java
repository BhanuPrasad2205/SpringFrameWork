package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import in.sp.bean.*;
import in.sp.resource.*;
public class Main {
	public static void main(String[] a)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std1=context.getBean(Student.class);
		std1.display();
	}

}

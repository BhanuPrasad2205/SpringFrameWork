package in.sp.resources;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import in.sp.bean.Address;
import in.sp.bean.Student;
@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddObj()
	{
		Address addr=new Address();
		addr.setHouseno(101);
		addr.setCity("hyd");
		addr.setPincode(123456);
		return addr;
	}
	@Bean
	public Student createStdObj()
	{
		Student std=new Student();
		std.setAge(101);
		std.setName("banu");
		std.setAddress(createAddObj());
		return std;
	}
	
	

}

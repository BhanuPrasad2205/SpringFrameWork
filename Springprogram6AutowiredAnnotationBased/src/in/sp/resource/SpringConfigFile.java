package in.sp.resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.bean.*;
@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj()
	{
		Address addr=new Address();
		addr.setHouseno(100);
		addr.setCity("INDIA");
		addr.setPincode(1423553);
		return addr;
	}
	@Bean
	public Address createAddrObj1()
	{
		Address addr=new Address();
		addr.setHouseno(100);
		addr.setCity("INDIA");
		addr.setPincode(1423553);
		return addr;
	}
	@Bean
	public Student createStdObj()
	{
		Student std=new Student();
		//std.setAddress(createAddrObj()); //munally D.I
		std.setName("chintu");
		std.setRollno(1246);
		return std;
		
	}

}

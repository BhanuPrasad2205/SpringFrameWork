package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.bean.Stu;

@Configuration
public class SpringConfigFile {
    
    @Bean
    public Stu stdId() {
        Stu std = new Stu();
     
        
        std.setName("rajesh");
        std.setRollno(191);
        std.setEmail("ajkbfaku@gmail.com"); // fixed typo in email
        return std;
        // ✅ must return the bean
    }
    @Bean
    public Stu stdId1() {
       
        Stu std1=new Stu();
        std1.setName("MOTHER");
        std1.setEmail("mother@gmail.com");
        std1.setRollno(23);
        ; // fixed typo in email
        return std1;
    
    }

    	
}
    


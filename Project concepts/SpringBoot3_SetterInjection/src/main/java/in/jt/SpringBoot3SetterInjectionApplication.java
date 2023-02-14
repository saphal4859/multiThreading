package in.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3SetterInjectionApplication {

	public static void main(String[] args) {
		//move the cursor end of line and entyer [cntrl+1+enter button]
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot3SetterInjectionApplication.class, args);
	
		Address address = container.getBean(Address.class);
			address.setCityName("Bangalore");
			address.setStateName("Karnataka");
		System.out.println(address);
		
		Student student = container.getBean(Student.class);
		System.out.println(student);
		
		student.setSid(123456);
		student.setSname("Swathi");
		
		System.out.println(student);
		
		
	}

}

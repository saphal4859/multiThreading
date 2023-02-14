package in.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3SetterInjectionApplication {

	public static void main(String[] args) {
		//move the cursor end of line and entyer [cntrl+1+enter button]
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot3SetterInjectionApplication.class, args);
	
		Student std = container.getBean(Student.class);
		std.getDateTimeObject();
		System.out.println(std);
		
		Employee employee = container.getBean(Employee.class);
		System.out.println(employee);
	}

}

package in.jt;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBoot3SetterInjectionApplication {

	public static void main(String[] args) {
		//move the cursor end of line and entyer [cntrl+1+enter button]
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot3SetterInjectionApplication.class, args);
		Student std = container.getBean(Student.class);
		System.out.println(std);
		
		
	}

}

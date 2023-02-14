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
		
		Address address = container.getBean("permanent",Address.class);
		System.out.println(address);
		
		
		
		Student std1 = (Student)container.getBean("stdObj");
		System.out.println(std1);
		
		System.err.println("*********************************************************");
		System.out.println("Number of beans in project: "+container.getBeanDefinitionCount());
		System.err.println("*********************************************************");
		String[] beanDefinitionNames = container.getBeanDefinitionNames();
		for(String aliasNames : beanDefinitionNames) {
			System.out.println(aliasNames);
		}
		System.err.println("*********************************************************");
		Map<String, Object> alias_Object = container.getBeansWithAnnotation(Component.class);
		Set<Map.Entry<String,Object>> set = alias_Object.entrySet();
		//set.forEach(x->System.out.println(x));
		set.forEach(x->System.out.println(x.getKey()+"_____________________"+x.getValue()));
	}

}

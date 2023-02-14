package in.jt;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
	
	@Autowired
	private LocalDateTime doj;

	public Employee() {
		System.err.println("\t Employee-ZeroArg :: Constructor");
	}

	@Override
	public String toString() {
		return "Employee [doj=" + doj + "]";
	}
	
}

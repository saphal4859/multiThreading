package in.jt;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Student {
	
	//@Autowired
	private LocalDateTime doj;

	public LocalDateTime getDateTimeObject() {
		LocalDateTime ldt = LocalDateTime.now();
		doj = ldt;
		return ldt;
	}
	public Student() {
		System.err.println("\t Student-ZeroArg :: Constructor");
	}
	@Override
	public String toString() {
		return "Student [doj=" + doj + "]";
	}
	
	
	
}

package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stdObj")
public class Student {
	
	@Autowired
		private Address address;
	
	
	
	public Student() {
		System.err.println("\t Student-ZeroArg :: Constructor");
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}

package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stdObj")
public class Student {
	
	@Autowired
	@Qualifier("temporary")
	private Address temporaryAddress;
	
	@Autowired
	@Qualifier("permanent")
	private Address permanentAddress;
	
	public Student() {
		System.err.println("\t Student-ZeroArg :: Constructor");
	}

	
	public Address getTemporaryAddress() {
		return temporaryAddress;
	}


	public Address getPermanentAddress() {
		return permanentAddress;
	}


	@Override
	public String toString() {
		return "Student [temporaryAddress=" + temporaryAddress + ", permanentAddress=" + permanentAddress + "]";
	}

	
	
}

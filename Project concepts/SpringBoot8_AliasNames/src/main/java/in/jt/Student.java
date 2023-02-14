package in.jt;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Address address;
	
	@Bean
	public Address permanentAddress() {
		Address addr = new Address("Bangalore","Karnataka");
		address = addr;
		return addr;
	}
	@Bean
	public Address temporaryAddress() {
		Address addr = new Address("Hyderbad","Telangana");
		address = addr;
		return addr;
	}
	
	
	
	public Student() {
		System.err.println("\t Student-ZeroArg :: Constructor");
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}

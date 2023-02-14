package in.jt;

import org.springframework.stereotype.Repository;

@Repository
public class Employee {
	public Employee() {
		System.err.println("\t Employee :: Constructor");
	}
}

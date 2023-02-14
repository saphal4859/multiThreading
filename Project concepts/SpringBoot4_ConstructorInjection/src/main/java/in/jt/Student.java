package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Integer sid;
	private String sname;
	private Address address;
	
	public Student() {
		System.out.println("\t Student-ZeroArg :: Constructor");
	}
	@Autowired
	public Student(Address address) {
		System.out.println("\t Student-Arg :: Constructor");
		this.address = address;
	}
	
	public void setAddress(Address address) {
		System.out.println("SETTER METHOD EXECUTED...");
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
}

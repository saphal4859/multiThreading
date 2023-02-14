package in.jt;

public class Student {
	private int sid;
	private String sname;
	
	private Address address;
	
	
	public Student() {
		super();
		System.out.println("ZEO_ARGUMENT STUDENT CONSTRUCTOR");
	}


	public Student(Address address) {
		System.out.println("ARGUMENT STUDENT CONSTRUCTOR");
		this.address = address;
	}
	
	
	public Address getAddress() {
		return this.address;
		
	}
	public int getSid() {
		return this.sid;
	}
	public void setSid(int sid) {
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

package in.jt;

public class Main {
	public static void main(String[] args) {
		Student std = new Student();
		System.out.println("STD: "+std);

		std.setSid(101);
		std.setSname("vikram");
		
		System.out.println("STD: "+std);
		System.out.println("-----------------------");
		Address addr = new Address();
		addr.setCityName("Hyderabad");
		addr.setStateName("Telangana");
		
		System.out.println("addr: "+addr);
		
		System.out.println("STD: "+std);
		
		//setter method injection
		std.setAddress(addr);
		
		System.out.println("STD: "+std);
		System.out.println("cityname: "+std.getAddress().getCityName());
		System.out.println("statename: "+std.getAddress().getStateName());
	}
}


/**
 *  in.jt.Student@15db9742
*/

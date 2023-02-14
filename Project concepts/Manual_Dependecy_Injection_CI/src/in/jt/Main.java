package in.jt;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		Address addr = new Address();
		addr.setCityName("Hyderabad");
		addr.setStateName("Telangana");
		
		System.out.println("addr: "+addr);
		
		System.out.println("***************************");
		
		//Constructor Injection
		//Student std = new Student(addr);
		Student std = new Student();
		System.out.println("STD: "+std);

		std.setSid(101);
		std.setSname("vikram");
		
		System.out.println("STD: "+std);
		System.out.println("-----------------------");
		
		
		Optional<Address> o1 = Optional.ofNullable(std.getAddress());
		System.out.println(o1);
		if(o1.isPresent()) {
			System.out.println(o1.get().getCityName());
			System.out.println(o1.get().getStateName());
		}
		else {
			System.out.println("Sorry...! There is no address object");
		}
	
	}
}

/**
 *  in.jt.Student@15db9742
*/


/*
 * package in.jt;
 * 
 * public class Main { public static void main(String[] args) { Address addr =
 * new Address(); addr.setCityName("Hyderabad"); addr.setStateName("Telangana");
 * 
 * System.out.println("addr: "+addr);
 * 
 * System.out.println("***************************");
 * 
 * //Constructor Injection Student std = new Student(addr);
 * System.out.println("STD: "+std);
 * 
 * std.setSid(101); std.setSname("vikram");
 * 
 * System.out.println("STD: "+std);
 * System.out.println("-----------------------");
 * 
 * 
 * 
 * 
 * System.out.println("cityname: "+std.getAddress().getCityName());
 * System.out.println("statename: "+std.getAddress().getStateName()); } }
 * 
 *//**
	 * in.jt.Student@15db9742
	 *//*
		*/
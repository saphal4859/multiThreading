package in.jt;

import java.util.Optional;

public class Main1 {
	public static void main(String[] args) {
		String[] s = new String[5];
		
		s[2]="sbms";
		System.out.println(s[2].toUpperCase());
		
		Optional<String> o1 = Optional.ofNullable(s[2]);
		System.out.println(o1);
		if(o1.isPresent()) {
			System.out.println(o1.get().toUpperCase());
		}
		else {
			System.out.println("Data is not available");
		}
		
		Optional<String> o2= Optional.ofNullable(s[3]);
		System.out.println(o2);
		if(o2.isPresent()) {
			System.out.println(o2.get().toUpperCase());
		}
		else {
			System.out.println("Data is not available");
		}
	}
}

/*package in.jt;

public class Main1 {
	public static void main(String[] args) {
		String[] s = new String[5];
		
		s[2]="sbms";
		System.out.println(s[2].toUpperCase());
		
		System.out.println(s[3].charAt(2));
	}
}
*/
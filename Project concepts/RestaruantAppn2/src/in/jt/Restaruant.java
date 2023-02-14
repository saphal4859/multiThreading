package in.jt;

import java.util.Scanner;

public interface Restaruant {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your amount");
		double amt = scan.nextDouble();
		
		System.out.println("Enter your card name");
		String cardname = scan.next();
		
		Class<Card> cls = (Class<Card>) Class.forName("in.jt."+cardname);
		Card card = cls.newInstance();
		
		boolean flag = PaymentProcessorFactory.payment(card, amt);
		if(flag) {
			System.out.println("Your transaction has been succeded");
			
		}
		else
			System.out.println("You transaction has failed");
	}
}

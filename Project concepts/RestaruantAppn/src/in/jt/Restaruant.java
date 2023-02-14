package in.jt;

import java.util.Scanner;

public interface Restaruant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your card name");
		String cardname = scan.next();
		System.out.println("enter your amount");
		double amt = scan.nextDouble();
		
		boolean flag = PaymentProcessorFactory.payment(cardname, amt);
		if(flag) {
			System.out.println("Your transaction has been succeded");
			
		}
		else
			System.out.println("You transaction has failed");
	}
}

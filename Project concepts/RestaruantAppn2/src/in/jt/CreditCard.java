package in.jt;

public class CreditCard implements Card{
	public boolean payment(double amt) {
		System.out.println("PAYMENT PROCESSED THROUGH CREDITCARD: "+amt);
		return true;
	}
}

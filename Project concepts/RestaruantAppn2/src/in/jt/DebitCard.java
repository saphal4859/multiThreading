package in.jt;

public class DebitCard implements Card{
	public boolean payment(double amt) {
		System.out.println("PAYMENT PROCESSED THROUGH DEBITCARD: "+amt);
		return true;
	}
}

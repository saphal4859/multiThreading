package in.jt;

public class AmexCard implements Card {
	public boolean payment(double amt) {
		System.out.println("PAYMENT PROCESSED THROUGH AMEXCARD: "+amt);
		return true;
	}
}

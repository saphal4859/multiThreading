package in.jt;

public class ZetaCard implements Card{
	public boolean payment(double amt) {
		System.out.println("PAYMENT PROCESSED THROUGH ZETACARD: "+amt);
		return true;
	}
}

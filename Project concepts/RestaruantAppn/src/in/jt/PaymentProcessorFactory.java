package in.jt;

public class PaymentProcessorFactory {
	public static boolean payment(String cardName,Double amount) {
		if("DEBITCARD".equalsIgnoreCase(cardName)) {
			DebitCard dc = new DebitCard();
			return dc.payment(amount);
		}
		else if("CREDITCARD".equalsIgnoreCase(cardName)) {
			CreditCard cc = new CreditCard();
			return cc.payment(amount);
		}
		else	if("ZETACARD".equalsIgnoreCase(cardName)) {
			ZetaCard zc = new ZetaCard();
			return zc.payment(amount);
		}

		else	if("AMEXCARD".equalsIgnoreCase(cardName)) {

			AmexCard zc = new AmexCard();
			return zc.payment(amount);
		}
		return false;

	}
}
//in the above example, we are directly writing class names, it will comes under hard coding that means 
//paymentprocessorfactory class strictly/tight coupling with DebitCard, ZetaCard, CreaditCard classes

//number if... else conditional statements increases

//whenever we add new code, existed code modified

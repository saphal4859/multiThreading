package in.jt;

public class PaymentProcessorFactory {
	public static boolean payment(Card cardObj,Double amount) {
		return cardObj.payment(amount);

	}
}

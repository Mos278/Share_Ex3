public class PaymentController  {

	private IPay paymentMethod;
	
	public void setPaymentMethod(IPay paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		paymentMethod.pay();
	}
}

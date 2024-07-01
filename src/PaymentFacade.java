public class PaymentFacade {
    private PaymentManager paymentManager;

    public PaymentFacade() {
        this.paymentManager = PaymentManager.getInstance();
    }

    public void processCreditCardPayment(double amount) {
        paymentManager.processPayment(amount, "creditCard");
    }

    public void processPayPalPayment(double amount) {
        paymentManager.processPayment(amount, "paypal");
    }

    public void processPayPix(double amount) {
        paymentManager.processPayment(amount, "pix");
    }
}

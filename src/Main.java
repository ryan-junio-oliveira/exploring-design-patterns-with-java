public class Main {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        double amount = 100.0;

        paymentFacade.processCreditCardPayment(amount);

        paymentFacade.processPayPalPayment(amount);

        paymentFacade.processPayPix(amount);
    }
}

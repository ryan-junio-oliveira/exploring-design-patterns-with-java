public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentStrategy(String paymentMethod) {
        switch (paymentMethod) {
            case "creditCard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "pix":
                return new PixPayment();
            default:
                return null;
        }
    }
}

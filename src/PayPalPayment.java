public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado com PayPal.");
    }
}

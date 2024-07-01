public class PaymentManager {
    private static PaymentManager instance;

    private PaymentManager() {}

    public static synchronized PaymentManager getInstance() {
        if (instance == null) {
            instance = new PaymentManager();
        }
        return instance;
    }

    public void processPayment(double amount, String paymentMethod) {
        PaymentStrategy strategy = PaymentStrategyFactory.getPaymentStrategy(paymentMethod);
        if (strategy == null) {
            System.out.println("Método de pagamento não suportado: " + paymentMethod);
            return;
        }
        strategy.pay(amount);
    }
}

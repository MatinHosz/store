package paymanet.methods;

public interface PaymentStrategy {
        void pay(double amount);
        String getPaymentDetails();
}

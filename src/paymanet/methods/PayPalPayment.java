package paymanet.methods;

public class PayPalPayment implements PaymentStrategy{
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + " Amount: " + amount + "\n");
    }

    @Override
    public String getPaymentDetails() {
        return "Email: " + email;
    }
}
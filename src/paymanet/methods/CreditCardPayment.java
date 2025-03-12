package paymanet.methods;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + " Amount: " + amount + "\n");
    }

    @Override
    public String getPaymentDetails() {
        return "Card holder name: " + cardHolderName + " Card number: " + cardNumber;
    }
}
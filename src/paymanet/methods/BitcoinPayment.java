package paymanet.methods;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + " Amount: " + amount + "\n");
    }

    @Override
    public String getPaymentDetails() {
        return " Wallet address: " + walletAddress;
    }
}
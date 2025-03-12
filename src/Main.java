import paymanet.custormes.*;
import paymanet.methods.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomer1 = new RegularCustomer("Matin");
        RegularCustomer regularCustomer2 = new RegularCustomer("Arman");
        PremiumCustomer premiumCustomer = new PremiumCustomer("Ayla");

        CreditCardPayment creditCard = new CreditCardPayment("60379975", "Matin");
        PayPalPayment payPal = new PayPalPayment("matin.hosseinzadeh06@gmail.com");
        BitcoinPayment bitcoin = new BitcoinPayment("02354631356");

        regularCustomer1.displayCustomerInfo();
        regularCustomer2.displayCustomerInfo();
        premiumCustomer.displayCustomerInfo();
        System.out.println();

        regularCustomer1.makePayment(bitcoin, 1);
        regularCustomer1.makePayment(payPal, 50000);
        regularCustomer2.makePayment(creditCard, 34000);
        regularCustomer2.makePayment(payPal, 110000);
        premiumCustomer.makePayment(bitcoin, 0.5);
        premiumCustomer.makePayment(bitcoin, 2);
        System.out.println();
        System.out.println();

        regularCustomer1.showPaymentHistory();
        regularCustomer2.showPaymentHistory();
        premiumCustomer.showPaymentHistory();
    }
}
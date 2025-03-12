package paymanet.custormes;

import paymanet.methods.PaymentStrategy;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();
    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + "\nAmount" + amount);
    }
    public void showPaymentHistory() {
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
        System.out.println();
    }
}

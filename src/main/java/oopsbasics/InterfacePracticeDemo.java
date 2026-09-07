package oopsbasics;

interface Paytm {
    void checkBalance(double x);  // abstract method

    void debited(double amount, double a);  //abstract method
}

interface CreditCard {
    void payBill(double y);  //abstract method
}

class Payment implements Paytm, CreditCard {
    @Override
    public void checkBalance(double x) {
        System.out.println("Total Balance: " + x);
    }

    @Override
    public void debited(double amount, double a) {
        System.out.println("Current amount: " + (amount - a));
    }

    @Override
    public void payBill(double y) {
        System.out.println("Bill paid: " + y);
    }
}

interface Check extends Paytm, CreditCard {

}

public class InterfacePracticeDemo {
    public static void main(String[] args) {
        Paytm obj = new Payment();
        obj.checkBalance(2300);
        obj.debited(40000, 250);

        CreditCard obj1 = new Payment();
        obj1.payBill(15000);
    }
}

package oopsbasics;

import java.util.Scanner;

class Bank {
    void location() {
        System.out.println("---IN BANK---");
    }

    public void getInterestRate(int x, int y, int z) {
        System.out.println("oopsbasics.Interest Rate=" + (x * y * z));
    }
}

class Interest extends Bank {
    void locality() {
        System.out.println("---NEAR STATE BANK---");
    }

    @Override
    public void getInterestRate(int x, int y, int z) {
        System.out.println("oopsbasics.Interest=" + (x * y * z));
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal p:");
        p = sc.nextInt();
        int r;
        System.out.println("Enter rate:");
        r = sc.nextInt();
        int t;
        System.out.println("Enter time:");
        t = sc.nextInt();

        //method overriding
        Interest obj = new Interest();  // oopsbasics.Interest -> reference and actual object
        obj.getInterestRate(p, r, t);

        obj.location(); // Inheritance
    }
}

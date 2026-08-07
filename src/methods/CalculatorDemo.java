package methods;

import java.util.Scanner;

public class CalculatorDemo {
    void add(int x, int y) {
        System.out.println("Addition of " + x + " and " + y + " is " + (x + y));
    }

    void subtraction(int x, int y) {
        System.out.println("Subtraction of " + x + " and " + y + " is " + (x - y));
    }

    void multiplication(int x, int y) {
        System.out.println("Multiplication of " + x + " and " + y + " is " + (x * y));
    }

    void division(int x, int y) {
        System.out.println("Division of " + x + " and " + y + " is " + (x / y));
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a = sc.nextInt();
        int b;
        System.out.println("Enter 2nd number:");
        b = sc.nextInt();
        CalculatorDemo obj = new CalculatorDemo();
        obj.add(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
    }
}

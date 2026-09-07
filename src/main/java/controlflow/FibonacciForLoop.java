package controlflow;

import java.util.Scanner;

public class FibonacciForLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        if (n == 0) {
            System.out.println("Fibonacci series of 0 is 0");
            System.out.println("Fibonacci value of 0 is 0");
        } else if (n == 1) {
            System.out.println("Fibonacci series of 1 is 0 1");
            System.out.println("Fibonacci value of 1 is 1");
        } else {
            System.out.print("Fibonacci series till index " + n + " is 0 1 ");
            for (int i = 2; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
                System.out.print(next + " ");
            }
            System.out.println("\nFibonacci value of " + n + " is " + second);
        }
        sc.close();
    }
}

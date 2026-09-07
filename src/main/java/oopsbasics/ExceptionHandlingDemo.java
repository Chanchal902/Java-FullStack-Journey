package oopsbasics;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        a = sc.nextInt();
        int b;
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        int result;
        int n;
        System.out.println("Enter total number of elements of an array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int user_index;
        System.out.println("Enter your desired index:");
        user_index = sc.nextInt();
        boolean flag = false;
        while (!flag) {
            try {
                arr[user_index] = 12;
                try {
                    result = a / b;            // nested try-catch
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("---EXCEPTION DETECTED!---");
                    System.out.println("Arithmetic Exception occurred!");
                    flag = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("---INVALID ARRAY INDEX , PROVIDE VALID INDEX---");
                flag = true;
                System.exit(1); //finally block will not be executed if program exits
            } finally {
                System.out.println("The program execution ended!");
            }
        }
    }
}

package oopsbasics;

import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class ExceptionsDemo {
    public static void CustomException(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("Age should not be less than 18!");
        }

        System.out.println("You are an Adult with age = " + age);
    }


    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();

        try {
            CustomException(age);
        } catch (AgeException e) {
            System.out.println("Not an adult!");
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

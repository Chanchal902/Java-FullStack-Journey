package oopsbasics;
import java.util.Scanner;
class MyException extends Exception{
    MyException(String message){   //calls the parent class (Exception) constructor
        super(message);  // passes the message to the parent class constructor
    }
}
public class CustomExceptionClassDemo {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number:");
        a=sc.nextInt();
        int b;
        System.out.println("Enter your second number:");
        b=sc.nextInt();
        int result;
        try{
            if(b==0){
                throw new MyException("Denominator cannot be zero!");
            }
            result=a/b;
            System.out.println("Result: " +result);
        }
        catch(MyException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        sc.close();
    }
}

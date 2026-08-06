package userinput;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
//        int age;
//        System.out.println("Enter your age:");
//        Scanner sc=new Scanner(System.in);
//        age=sc.nextInt();
//        System.out.println(age + " age is just a number");

//        String name;
//        System.out.println("Enter your name:");
//        Scanner sc=new Scanner(System.in);
//        name=sc.nextLine();  //for strings we use nextLine
//        System.out.println("Your name " + name + " is sassy");

        char ch;
        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println("Your choosen character is " +ch);
        sc.close();
    }
}

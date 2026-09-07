package oopsbasics;

import java.util.Scanner;

class Employee {

    void getDetails() {
        System.out.println("---oopsbasics.Employee details loading---");

    }

    void viewDetails(String s, int No, int sal) {  // s , No , sal = PARAMETERS
        System.out.println("viewing employee details:");
        System.out.println("Name:" + s + " , ID:" + No + " , Salary:" + sal);
        s = "Chanchal Rani";
        No = 26;
        sal = 15000;
        System.out.println("viewing new details:");
        System.out.println("Changed name:" + s);
        System.out.println("Changed ID:" + No);
        System.out.println("Changed Salary:" + sal);
    }
}

public class CustomClassDemo {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        int ID;
        System.out.println("Enter ID:");
        ID = sc.nextInt();
        int salary;
        System.out.println("Enter salary:");
        salary = sc.nextInt();

        Employee obj = new Employee(); // object instantiation
        obj.getDetails();
        obj.viewDetails(name, ID, salary); //name , ID , salary = ARGUMENTS

    }
}

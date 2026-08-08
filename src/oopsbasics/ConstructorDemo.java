package oopsbasics;

import java.util.Scanner;

// custom class
class Student {
    String name = "Chanchal Rani";  // name , roll , marks = ATTRIBUTES
    int roll = 478;
    int marks = 98;

    Student() {   // Default constructor
        System.out.println("---Students Details---");
    }

    Student(String s, int roll_no, int m) {   // Parameterized constructor
        s = name;
        roll_no = roll;
        //m=marks;
        System.out.println("Name of the oopsbasics.Student:" + s);
        System.out.println("Roll number:" + roll_no);
        System.out.println("Marks obtained:" + m);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        String s_name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        s_name = sc.nextLine();
        int s_roll;
        System.out.println("Enter student roll:");
        s_roll = sc.nextInt();
        int s_marks;
        System.out.println("Enter student marks:");
        s_marks = sc.nextInt();

        Student obj = new Student(); //object instantiation (Default constructor call)
        Student obj1 = new Student(s_name, s_roll, s_marks);  //object instantiation of "oopsbasics.Student" class (parameterized constructor call)

    }
}

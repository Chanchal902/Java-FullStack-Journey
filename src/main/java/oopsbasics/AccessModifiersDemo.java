package oopsbasics;

import java.util.Scanner;

class Modifiers {
    // variables declare
    public int number;
    private String name;
    char section;
    protected int info;

//    public void details(String name , int number , char section , int info){
//        this.name=name;  // this keyword refers to the current object
//        System.out.println(name);
//        this.number=number;
//        System.out.println(number);
//        this.section=section;
//        System.out.println(section);
//        this.info=info;
//        System.out.println(info);
//    }

    protected void details(String name, int number, char section, int info) {
        this.name = name;  // this keyword refers to the current object
        System.out.println(name);
        this.number = number;
        System.out.println(number);
        this.section = section;
        System.out.println(section);
        this.info = info;
        System.out.println(info);
    }

//    void details(String name , int number , char section , int info){
//        this.name=name;  // this keyword refers to the current object
//        System.out.println(name);
//        this.number=number;
//        System.out.println(number);
//        this.section=section;
//        System.out.println(section);
//        this.info=info;
//        System.out.println(info);
//    }

}

class Implication extends Modifiers {
    public void knowledge(String name, int info, int number) {
        //this.name=name; name has private access in base class Modifier
        this.info = info;
        this.number = number;
        //System.out.println(name);
        System.out.println(info);
        System.out.println(number);
    }
//protected void knowledge(String name , int info , int number){
//    //this.name=name;  name has private access in base class Modifier
//    this.info=info;
//    this.number=number;
//    //System.out.println(name);
//    System.out.println(info);
//    System.out.println(number);
//}

}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a , b:");
        a = sc.nextInt();
        b = sc.nextInt();
        char c;
        System.out.println("Enter c:");
        c = sc.next().charAt(0);
        sc.nextLine();
        String d;
        System.out.println("Enter your string:");
        d = sc.nextLine();

        Modifiers obj = new Modifiers();
        obj.details(d, b, c, a);

        Implication obj1 = new Implication();
        obj1.knowledge(d, a, b);
        sc.close();
    }
}

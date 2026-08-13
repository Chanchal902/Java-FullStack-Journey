package oopsbasics;

import java.util.Scanner;

class Capsule {
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String s;
        System.out.println("Enter your string:");
        s = sc.nextLine();

        Capsule obj = new Capsule();
        obj.setNum(n);
        System.out.println("Number:" + obj.getNum());
        obj.setName(s);
        System.out.println("Name:" + obj.getName());

        sc.close();
    }
}

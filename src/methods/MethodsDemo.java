package methods;

import java.util.Scanner;

public class MethodsDemo {
    //method inside the same class as main()
    int choice(int x, int y) {  //static int choice(int x,int y){ -> no need to create object to call the method
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = y - x;
        }
        return z;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        int b;
        System.out.println("Enter second number:");
        b = sc.nextInt();
        MethodsDemo obj = new MethodsDemo();
        int c = obj.choice(a, b);
        //int c=choice(a,b); -> without static
        System.out.println(c);
    }
}
//if we modify the values a and b inside the method, the values in the main method will not change
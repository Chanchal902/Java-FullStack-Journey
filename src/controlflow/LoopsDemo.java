package controlflow;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
//        int i=1;
//        System.out.println("Enter numbers:-");
//        while(i<=10){
//            System.out.println(i);
//            i++;

        //do-while
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n = sc.nextInt();
        int i;
        System.out.println("Enter value of i:");
        i = sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        sc.close();
    }
}

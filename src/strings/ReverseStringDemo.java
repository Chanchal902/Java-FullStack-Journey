package strings;

import java.util.Scanner;
public class ReverseStringDemo {
    public static void main(String[] args){
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string:");
        name=sc.nextLine();
        //System.out.println("Hello! " + name + " ...How are you?");
        System.out.println("Reversing the given name:");
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

//        String names="Mr.Preshan";
//        System.out.println(names);

        sc.close();
    }
}

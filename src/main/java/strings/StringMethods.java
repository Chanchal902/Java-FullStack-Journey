package strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(4));
        System.out.println(name.substring(2, 4));
        System.out.println(name.replace('r', 'n'));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ni"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("sh"));
        System.out.println(name.indexOf("sh", 5));
        System.out.println(name.lastIndexOf('n'));
        System.out.println(name.lastIndexOf("r", 7));
        System.out.println(name.equals("rani"));
        System.out.println(name.equalsIgnoreCase("rani"));
        System.out.println("name\\class");
        sc.close();
    }
}

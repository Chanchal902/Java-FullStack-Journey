import java.util.Scanner;
public class ConditionalsDemo {
    public static void main(String[] args){
//        int number;
//        System.out.println("Enter your number:");
//        Scanner sc=new Scanner(System.in);
//        number=sc.nextInt();
//        if(number % 2==0){
//            System.out.println(number + " is even");
//        }
//        else {
//            System.out.println(number + " is odd");
//        }

        int age=46;
        boolean result=(age>=25) ? true : false;  //ternary operator
        System.out.println(result);

        int marks;
        System.out.println("Enter your marks:");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        switch(marks){
            case 23:
                System.out.println("Below Average");
                break;
            case 50:
                System.out.println("Average");
                break;
            case 80:
                System.out.println("GOOD");
                break;
            default:
                System.out.println("Enjoy your day!");
        }
    }
}

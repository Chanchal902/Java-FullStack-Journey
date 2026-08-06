package arrays;

import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args){
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and n:");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] array=new int[m][n];
        System.out.println("Enter array elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j]= sc.nextInt();

            }
        }
        System.out.println("Displaying array elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j] + " ");
            }
        }
        sc.close();
    }
}

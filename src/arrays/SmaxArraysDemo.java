package arrays;

import java.util.Scanner;
public class SmaxArraysDemo {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        if(n<2){
            System.out.println("Second maximum does not exist!");
            return;
        }
        int max=array[0],smax=array[0];
        if(array[0]>array[1]){
            max=array[0];
            smax=array[1];
        }
        else{
            max=array[1];
            smax=array[0];
        }
        for(int i=2;i<n;i++){
            if(array[i]>max){
                smax=max;
                max=array[i];
            }
            else if(array[i]!=max && array[i]>smax){
                smax=array[i];
            }
        }
        System.out.println("Second max element:" +smax);
        //for each loop
//        for(int element:array){
//            System.out.print(" " + element + " ");
//        }
        sc.close();
    }
}

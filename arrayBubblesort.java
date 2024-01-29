//Write a program to input 10 integer elements in an array and sort them in descending order using the bubble sort technique

import java.util.Scanner;

public class arrayBubblesort {
    public static void main (String[] arges) 
    { 
        int a []= new int[10];
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter 10 integers");
        for (int i =0;i < 9 ;i++) 
            a[i] = scan.nextInt() ;
        int t =0;
        for ( int i =1; i <= 9;i++) 
        {
            for (int j =0; j<=8;j ++) 
            {
                 if (a[j] < a[j+1]) 
                 {
                     t= a[j];
                     a[j] =a [j + 1];
                     a[j+1] =t ;
                 }
            }
        }
        System.out.println("sorted element are:");
        for (int k=0; k < 9; k++)
             System.out.println(a[k]);
    }
}

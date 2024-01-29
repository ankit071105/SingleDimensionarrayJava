//Write a program to create a single dimensional array of 20 integers. Print array element in a single line with one space between each element. Also print sum of elements present at even indexes and sum of elements present at odd indexes in array.

import java.util.Scanner;

public class arrayEvenandOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter The Element of an Array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int sumeven=0,sumodd=0;
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
              sumeven +=a[i];
            }else{
                sumodd +=a[i];  
            }
        }
        System.out.println("The Sum of Even Element is "+sumeven);
        System.out.println("The Sum of Odd Element is "+sumodd);
    }
}

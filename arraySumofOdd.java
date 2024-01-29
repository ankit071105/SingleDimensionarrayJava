//Write a program that creates integer array of 10 elements, accepts values of arrays and Find sum of all odd numbers

import java.util.Scanner;

public class arraySumofOdd {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter the Element of array");
    int sum=0;
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
        if(i%2 != 0){
         sum +=a[i];
        }
    }
    System.out.println("Find sum of all odd numbers "+sum);
}


    
}

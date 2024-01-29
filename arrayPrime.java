//Write a program to take in 10 values and print only those nos which are prime.

import java.util.Scanner;

public class arrayPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
      System.out.println("Enter the element of array ");
      for (int i = 0; i < a.length; i++) {
        a[i]= sc.nextInt();
      }
   
      System.out.println("The Prime Number Are");
      for (int i = 0; i < a.length; i++) {
        int j = 2;
        int p = 1;
       while (j < a[i]){
       if(a[i] % j ==0){
        p=0;
        break;
       }
       j++;

       }
       if(p==1){
        System.out.print(a[i]+" ");
       }
    }
    }
}

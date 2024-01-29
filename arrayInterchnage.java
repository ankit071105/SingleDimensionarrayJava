// Write a java program to enter two array and interchange both the array

import java.util.Scanner;

public class arrayInterchnage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.println("Enter the element of First array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();

                }
                System.out.println("Enter the element of Second array");
                for (int i = 0; i < b.length; i++) {
                    b[i]=sc.nextInt();
        
            }    System.out.println();
            System.out.println("Original Array Display :- ");

            System.out.println();
            System.out.println("Array a :");
            for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
    
        }
        System.out.println();
        System.out.println("Array b : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");

    }
    System.out.println();
    System.out.println();  
System.out.println("After Interchanging the Array :- ");
    for (int i = 0; i < b.length; i++) {
    
        int temp=a[i];
        a[i]=b[i];
        b[i]=temp;
        }
        System.out.println();
        System.out.println("Array a :");
        for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");

    }
    System.out.println();
    System.out.println("Array b : ");
    for (int i = 0; i < b.length; i++) {
        System.out.print(b[i]+" ");

}



    }
}

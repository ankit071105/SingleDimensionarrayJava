//Write a program which takes in 10 values and creates another array which has cubes of the values (or factorial) and prints it.

import java.util.Scanner;

public class arrayCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the element of Array ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        for (int i = 0; i < a.length; i++) {
       System.out.print(a[i]+" ");
        }
System.out.println();
int b[]=new int[10];


for (int i = 0; i < b.length; i++) {
b[i]=a[i]*a[i]*a[i];
     }
     System.out.println("The Element cube is : ");
for (int i = 0; i < b.length; i++) {
    System.out.print(b[i]+" ");
     }
    }
}

//Write a program to initialize a single dimensional array of 8 integers. Print array elements along with the indexes of each element and square of each element in three columns.

import java.util.Scanner;

public class arrayIndexSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int A[]=new int[10];
System.out.println("Enter the Element of Array");
for (int x =0; x<A.length; x++)  {
    A[x]=sc.nextInt();
}
    System.out.println("Index number \t Element at index \t Square of element");
    for (int x =0; x<A.length; x++) 
        System.out.println("\t" + x + "\t\t"+ A[ x]+ "\t\t\t" +(A[x]*A[x]));
}
}
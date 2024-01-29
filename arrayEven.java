// Write a program that creates integer array of 10 elements, accepts values of arrays and Print only even numbers in the array.
import java.util.Scanner;

public class arrayEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
       System.out.println("Enter the element of Array");
       for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();

       }
       for (int i = 0; i < a.length; i++) {
    if(i%2==0){
        System.out.print(a[i]+" ");
    }   
    }
    }
}

// Write a java program to find the Reverse array with using third variable.

import java.util.Scanner;
public class arrayReverse {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int [] rev = new int[5];
        System.out.println("Enter the element of array");
        int l=rev.length;
        for(int i = 0 ;i<l; i++ ) {
            rev[i]=ob.nextInt();
                }
      

        for(int i = 0 ;i<l/2; i++ )
        {
           int temp = rev [i];
           rev [i] =  rev [l-i-1];
           rev [l-i-1]= temp;
        }
        System.out.println("After reversing the array");
    for(int i = 0 ;i<l; i++ )
        {
            System.out.print(rev[i]+" ");

        }

    }
}

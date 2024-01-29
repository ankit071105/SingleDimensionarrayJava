// Initialize a one dimension array with first nine natural numbers and then display then in the following format.
// 1       2       3
// 4       5       6
// 7       8       9

import java.util.Scanner;

public class arrayDisplaying {
    public static void main (String[] args )
    {
        Scanner sc=new Scanner(System.in);
       int a[]=new int[9];
       System.out.println("Enter the Element of array");
       for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
       }
        int k =0 ;
        System.out.println("Displaying in Matrix Form ");
        for (int i =1;i<=3;i++)
        {
            for (int j=k;j<=k+2;j++) 
            System.out.print(a[j] +" ");
            System.out.println ( );
            k=k+3;
        }
    }
}

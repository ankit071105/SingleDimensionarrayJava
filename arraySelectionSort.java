//Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

import java.util.Scanner;

public class arraySelectionSort {
    
    static int weight[] = new int[ 10 ];
    public static void main(String args[ ])
    {
       Scanner buf = new Scanner (System.in );
       int n= 10;
       int i,j, place, big, temp;
       System.out.println("Input weight of ten people in the array: ");
       for( i = 0; i<n; i++)
       {
          System.out.print("Enter the weight: ");
          weight[i] = buf. nextInt( );
      }
      System.out.println("Output:");
      for(i = 0; i <n-1; i++)
      {
         big = weight[ i ];
         place = i;
         for(j= i+1;j<n; j++)
         {
            if( weight[j]> big )
            {
               big = weight[j];
               place= j;
            }
         }
         temp = weight[ i];
         weight[ i]= weight[ place ];
         weight[ place ] = temp;
      }
      System.out.println("\nWeights in descending order are:");
      for( i=0; i<n; i++)
      {
          System.out.print(weight[ i ]+" ");
      }
   }
}

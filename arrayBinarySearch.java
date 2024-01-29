//Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
// {1982, 1987 ,1993, 1996 ,1999, 2003, 2006 ,2007 ,2009, 2010,}

import java.util.Scanner;

public class arrayBinarySearch {
     public static void main (String [] arg) 
   {
      Scanner scan =new Scanner(System.in);
      long a[]=new long[10];
      System.out.println("Enter the Element of an array ");
     for (int i = 0; i < a.length; i++) {
        a[i]=scan.nextLong();
     }
      System.out.println("Please enter a year of graduation to search:");
      int year = scan.nextInt();
      int flag =0,mid,lb =0, ub =a.length -1;
      do 
      {
         mid =(lb +ub ) /2;
         if (a[mid]== year) 
         {
            System.out.println("Record exists");
            flag =1 ;
            break;
         } 
         else if (a[mid]<year)
            lb =mid +1; 
         else 
            ub =mid-1;
      }
      while (lb <= ub);
         if (flag == 0)
            System.out.println ("Record does not exist");
   }
}

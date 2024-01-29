//Write a program that creates integer array of 10 elements, accepts values of arrays and Search for a number in an array of 10

import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, j=0, flag=0, x;
        System.out.println("Enter 10 array elements");
        int a[] = new int[10]; 
        for( i = 0; i < a.length; i++) {
           a[i] = sc.nextInt(); 
          }  
          System.out.println("Enter the element you want to find:: ");
           x = sc.nextInt();
           for( j = 0; j < a.length; j++)
           {
              if(a[j] == x)
              {
                  flag = 1;
                  break;
              }
              else
              {
                  flag = 0;
              }
           }
           if(flag == 1)
           {
               System.out.println("Element found at position: "+(j + 1));
           }
           else
           {
               System.out.println("Element not found");
           }
        }
    }


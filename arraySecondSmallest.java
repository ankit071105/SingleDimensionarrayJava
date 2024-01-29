// Write a java program to find the second smallest element in an array of n elements.

import java.util.Scanner;
public class arraySecondSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[] =new int[5];
       System.out.println("Enter the element of array");
       for (int i = 0; i < arr.length; i++){
        arr[i]=sc.nextInt();
       }
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
          System.out.println("Indicate the absence of a second largest element"); 
        }else{
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
System.out.println("Second Largest Element in the array is "+secondLargest);
    }
}
}

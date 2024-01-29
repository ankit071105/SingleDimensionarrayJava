// Write a java program to find the sum and average of element of array.
import java.util.Scanner;
public class arraySum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
       
        for(int i=0;i<arr.length;i++)
        {
          sum += arr[i];
        }
       int  avg =sum/n;
        System.out.println("The array elements are: ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
       }
       System.out.println("Sum= "+sum);
       System.out.println("Average= "+(double)avg);
    }
    
}
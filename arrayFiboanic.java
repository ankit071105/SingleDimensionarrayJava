//write a program to generate and store the 20 term of Fibonacci series in an array.
// fibArr [20]: 0,1,1,2,3,5,8,13,21,34,…
// Finally print the sum of all element contained in fibArr [20]
public class arrayFiboanic {
    public static void main ( String [] arge)
    {
       int fibArr []=new int [20];
       int a =5,b=8; 
       int sum =0,c=0 ;
       fibArr[0]=a;
       fibArr[1] =b ;
       for(int i= 2; i <20; i++) 
       {
          c=a+b;
          fibArr[i]=c;
          a=b;
          b=c;
       }
       for(int i=0; i < 20; i ++)
       {
           System .out. print (fibArr[i]+",");
           sum =sum + fibArr [i];
       } 
       System.out.println("");
       System.out.println ("sum of Fibonacci series =" +sum);
    }
}

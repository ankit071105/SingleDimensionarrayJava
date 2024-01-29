//Write a program which generates 30 terms of Fibonacci no in an array and then prints it.



public class arrayFibaonic {
    public static void main(String[] args) 
    {
       long[] fibonacci = new long[30];
       fibonacci[0] = 1;
       fibonacci[1] = 1;
       for(int i=2; i < fibonacci.length; i++){
           fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
       }
       System.out.println("Fibonacci Series upto 30 ");
       for (int i = 0; i < fibonacci.length; i++) {
           System.out.println(fibonacci[i] + " ");
       }
    }
}

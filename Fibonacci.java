import java.util.*;
public class Fibonacci {     
    public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      System.out.print("How many numbers you want in fibonacci: ");
      int maxNumbers=sc.nextInt();
      System.out.print("Fibonacci Series of first "+maxNumbers+" numbers:");
      for(int i=maxNumbers-1;i>=0;i--)
        System.out.print(" "+fibonacci(i));
    }       
    public static int fibonacci(int n)//Using Recursion
    {
      if(n==0 || n==1)
      return n;
      else 
      return (fibonacci(n-1)+fibonacci(n-2));
       
    }                              
}
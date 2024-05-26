/*
Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.
 */
import java.util.*;
class a1  
{
        public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number -: ");
      int n = sc.nextInt();
      try
      {
        if(n < 0 )
        {
            throw new NumberFormatException("Negative number");
        }
        System.out.println("your lucky number is "+n);
      }
      catch ( NumberFormatException e)
      {
        System.out.println(e);
      }
    }
}
/*
sample run (1)
enter a number -:
-4
java.lang.NumberFormatException: Negative number

sample run (2)
enter a number -: 
4
your lucky number is 4
 */

/* 
Write a java method using Generics to count the occurrence of an element in an array of
any type. The signature of count method is given below.
public static <T> int count(T[] array, T item)

*/ 
import java.util.*;
class q6
{
    public static void main(String[] args) 
    {
       Scanner sc  = new Scanner(System.in);
       Integer arrint[] = new Integer[5];
       System.out.println("enter integer data ");
       for(int i = 0;i < arrint.length; i++)
       {
        arrint[i] = sc.nextInt();
       }
       int n = 4;
       System.out.println(n+" occurs "+count(arrint, n)+" times");
       
    }


     public static <T> int count(T[] array, T item)
       {
        int c = 0;
 
         for(int  i = 0 ; i < array.length;i++)
         {
          
            if(item == array[i])
            {
                c++;
            }
         }
         return c;
       }
}
/*
enter integer data
1
4
4
3
4
4 occurs 3 times
 */ 

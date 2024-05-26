/*
Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
public static < E > void printArray( E[] inputArray) 
*/ 
import java.util.*;
class q5
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
       System.out.println("int array data are");
       printArray(arrint);

       String arrstring[] = new String[5];
       System.out.println("enter String data ");
       for(int i = 0; i < arrstring.length; i++)
       {
        arrstring[i] = sc.nextLine();
        
       }
       System.out.println("String array data are");
       printArray(arrstring);
    }


       public static < E > void printArray( E[] inputArray)
       {
         for(int  i = 0 ; i < inputArray.length;i++)
         {
            System.out.println(inputArray[i]);
         }
       }
}

/*
enter integer data 
10
120
340
56
654
int array data are
10
120
340
56
654
enter String data
guru
raj
sai
smruti
 */
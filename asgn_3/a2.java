/*
Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.
 */
class a2 
{
    public static void main(String[] args) 
    {
       String color[] = {"RED","BLUE","GREEN","BLACK"};

       try
       {
          Integer.parseInt(color[0]);
       }
       catch(NumberFormatException e)
       {
        System.out.println(e);
       }
       try
       {
          color[4] = "WHITE";
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println(e);
       }   
       for(int i = 0 ; i < color.length ; i++)
       {
        System.out.println(color[i]);
       }
    }
}
/*
Sample run -

java.lang.NumberFormatException: For input string: "RED"
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
RED
BLUE
GREEN
BLACK

 */
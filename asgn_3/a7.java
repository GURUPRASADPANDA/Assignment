//Write a recursive method in Java that computes the factorial of a given integer.
class a7 
{
    public static void main(String[] args) 
    {
      int n = 3;    
      System.out.println("Factorial of "+n+" is equals "+factorial(n));
    }
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
            return n*factorial(n-1);
    }
}

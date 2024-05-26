//Write a recursive method in Java which, given an integer n, print it with its digits reversed.For example , given 4735, it prints 5374
class a9 
{
    public static void main(String[] args) 
    {
        reverse(4735);
    }
    public static void reverse(int n)
    {
        if(n<10)
        {
            System.out.print(n);
            return;
        }
        else
            System.out.print(n%10);
        reverse(n/10);
      
    }

}
//5374
/*/**
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the n
th Fibonacci number.
 */
class a10 
{
    public static void main(String[] args) 
    {
        int n = 7;
        System.out.println(FibonaciAt(7));
    }
    
    public static int FibonaciAt(int n)
    {
        if(n<=1)
        return n;
        else
        
            return (FibonaciAt(n-1)+ FibonaciAt(n-2));
        
    }

}
//13
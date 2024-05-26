//Write a recursive method in Java which, given real value x and a positive integer n, returnsthe value of x^n

class a8 
{
 public static void main(String[] args) 
 {
    System.out.println(findPower(4, 2));
    
 }  
 
 public static int findPower(int x,int n)
 {
   if(n==0)
   {
    return 1;
   }
   else
   {
    return x*findPower(x,n-1);
   }
 }

}
//16
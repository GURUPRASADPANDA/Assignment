import java.util.*;
public class StackDemo1 
{
    public static final int max = 10;
    public static int push(int S[],int top)
    {
        Scanner s = new Scanner(System.in);
        if(top == max-1)
        {
            System.out.println("stack over flowed");
        }
        else
        {
            top++;
            System.out.print("enter the data you want to push");
            int ele = s.nextInt();
            S[top] = ele;
            System.out.println("element "+ ele +" is insserted");
        }
        return top;
    }
    public static int pop(int s[],int top)
    {
        if(top == -1)
        {
            System.out.println("stack is underflowed or no element"); 
        }
        else
        {
            top = top - 1;
        }
        return top;
    }
    public static void disp(int s[],int top)
    {
      if(top == -1)
      {
        System.out.println("no elements to display");
      }
      System.out.println("elements are ");
      for(int i = top ; i >=0 ; i--)
        {
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         int stack[]=new int[max];
         int top=-1;
          while(true)
          {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
            case 0 : System.exit(0);
            case 1 : top = push(stack,top);break;
            case 2 : top = pop(stack,top);break;
            case 3 : disp(stack,top);break;
            default:System.out.println("Invalid choice");
            }
        } 
    }
}
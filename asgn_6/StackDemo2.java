import java.util.*;
class Node
{
    int info;
    Node next;
}
public class StackDemo2 
{
    public static Node push(Node top)
    {
      Scanner sc  =  new Scanner (System.in);
      Node newNode = new Node();
      System.out.println("enter data you want to push");
      newNode.info = sc.nextInt();

      newNode.next = top;
      return newNode;
    }
    public static Node pop(Node top)
    {
        if(top == null){
            System.out.println("no element to pop");
        }else if(top.next == null){
            System.out.println(top.info+" poped");
            top=null;
        }else{
            System.out.println(top.info+" poped");
            top = top.next;
        }
        return top;
        
    }
    public static void disp(Node top)
    {
        if(top == null)
        {
            System.out.println(" no elements");
        }else{
            System.out.println("elements are -");
            while(top!=null)
            {
                System.out.println(top.info);
                top = top.next;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Node top;
        top=null;
        while(true)
        {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0 : System.exit(0);
                case 1 : top=push(top);break;
                case 2 : top=pop(top);break;
                case 3 : disp(top);

                default : System.out.println("Wrong choice");
             }
        }
    }
}

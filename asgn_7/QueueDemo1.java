import java.util.Scanner; 
public class QueueDemo1
{ 
    public static final int MAX=10; 
    public static int front=-1; 
    public static int rear=-1; 
    public static void insert(int Q[]) 
    { 
        if(is_full(Q)){
        System.out.println("insufficent space");
        return;
      }else
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data you want to insert ");
        if(is_empty(Q)){
            front = 0;
        }
        rear++;
        Q[rear] = sc.nextInt();
        System.out.println(Q[rear]+" inserted");
      }
    } 
    public static void delete(int Q[])
    {
     if(is_empty(Q)){
        System.out.println("no element");
        return;
     }
     System.out.println(Q[front]+" deleted");
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
        front++;
        }
    }
    public static boolean is_full(int Q[])
    {
      boolean flag = false;
      if(rear == MAX-1)
      flag = true;
      return flag;
    }
    public static boolean is_empty(int Q[])
    {
        boolean flag = false;
        if(front == -1)
        flag = true;
        return flag;
    }
    public static void disp(int Q[])
    {
        if(is_empty(Q)){
            System.out.println("no element");
            return;
        }
        System.out.println("elements are :");
        int i = front;
        while(i!=rear)
        {
            System.out.println(Q[i]);
            i++;
        }
        System.out.println(Q[i]);    
    }
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        int queue[]=new int[MAX]; 
     
        while(true) 
        { 
          System.out.println("***MENU***"); 
          System.out.println("0: Exit"); 
          System.out.println("1: Insert"); 
          System.out.println("2: Delete"); 
          System.out.println("3: Display"); 
          System.out.println("Enter your choice"); 
          int choice=sc.nextInt(); 
          switch(choice) 
          { 
            case 0:System.exit(0); 
            case 1:insert(queue);break; 
            case 2:delete(queue);break;
            case 3:disp(queue);break;
            default:System.out.println("Invalid choice"); 
          } 
        } 
    } 
} 
 
 
 
 
 
 
 
 
 
 
 

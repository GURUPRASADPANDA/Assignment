import java.util.Scanner;
class Node 
{ 
    int info; 
    Node next; 
}
public class QueueDemo2 
{ 
    public static Node rear, front;
    public static Node insert(Node rear, Node front) 
    { 
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node(); 
        System.out.println("enter the data you want to insert ");
        newNode.info = sc.nextInt();
        System.out.println("Element inserted.");
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
         QueueDemo2.rear = rear;
         QueueDemo2.front = front;
        return front;
    } 
    public static Node delete(Node rear, Node front) 
    { 
     if(front == null){
        System.out.println("no element to delete");return front;
     }
     System.out.println(front.info+" deleted");
     if(front == rear){
        front = null;
        rear = null;
     }else{
        front = front.next;
     }
     return front;
    } 
    public static void disp(Node front) 
    { 
     if(front == null){
        System.out.println("no element");return;
     }
     Node temp = front;
     System.out.println("elements are");
     while(temp!=null)
     {
       System.out.println(temp.info);
       temp=temp.next;
     }
    } 

    public static void main(String[] args) 
    { 
     Scanner sc=new Scanner(System.in); 
     while(true) 
     { 
        System.out.println("****MENU****"); 
        System.out.println("0:Exit"); 
        System.out.println("1:Insert"); 
        System.out.println("2:Delete"); 
        System.out.println("3:Display"); 
        System.out.println("Enter your choice"); 
        int choice=sc.nextInt(); 
        switch(choice) 
        { 
            case 0:System.exit(0); 
            case 1:front=insert(rear,front);break; 
            case 2:front=delete(rear,front);break; 
            case 3:disp(front);break;
            default:System.out.println("Wrong choice"); 
        } 
     } 
     
    } 
} 


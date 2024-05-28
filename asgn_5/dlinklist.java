import java.util.*;
class Node
{
 protected int regd_no;
 protected float mark;
 protected Node next;
 protected Node prev;
}

class dl
{
    static Node head=null;
    static Node end = null;
	static Scanner sc=new Scanner(System.in);
	public static Node create(Node head, Node end) 
    {
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();

        if (head == null) {
            head = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        System.out.print("Enter 0 to exit or any key to continue creation: ");
        int x = sc.nextInt();
        if (x != 0) {
            return create(head, end);
        }
        dl.head = head;
        return end;
    }
	
    public static Node InsBeg(Node head,Node end)
    {
        Node newNode = new Node();
        System.out.println("for insert at beginning ->");
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();

        if(head==null)
            {
               head=newNode;
               end = newNode;
               return head;
            }
        newNode.next = head;
        head.prev = newNode;
        dl.head = newNode;
        return head;
       }
    public static Node InsEnd(Node head,Node end)
    {
        Node newNode = new Node();
        System.out.println("for insert at end ->");
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next=null;
        return head;
    }
    public static Node InsAny(Node head,Node end)
    {
        Node newNode = new Node();
        System.out.println("for insert at any position ->");
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        if(head == null)
        {
            System.out.println("there is no data existed before the new data is inserted at 1st poition");
            head = newNode;
            end = newNode;
            return head;
        }
        System.out.println("enter the position you want to insert a new Node");
        int p = sc.nextInt();

        int c = 0;
        Node temp = head;
        while(temp!=null)
        {
          c++;
          if(c==p-1)
          {
            
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next=newNode;
            System.out.println("New data at "+c+1+" inserted");
            return head;
          }
          temp=temp.next;
        }
        if(c==0)
        {
            System.out.println("entered position is invalid");
        }
       return head;
    }
    public static Node DelBeg(Node head, Node end)
    {
        if(head == null)
        {
            System.out.println("no data to delete");
            return head;
        }
        dl.head = head.next;
        dl.head.prev = null;
        System.out.println("data at beginning deleted");
        return head;
    }
    public static Node DelEnd(Node head, Node end)
    {
        if(head == null)
        {
            System.out.println("no data to delete");
            return head;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
          temp=temp.next;
        }
        temp.next=null;
        System.out.println("data at end deleted");
        return head;
    }
    public static Node DelAny(Node head,Node end)
    {
        if(head==null)
        {
            System.out.println("no data to delete");
            return head;
        }
        System.out.println("enter the position you want to delete Node");
        int p = sc.nextInt();

        int c = 0;
        Node temp = head;
        while(temp!=null)
        {
          c++;
          if(c==p-1)
          {
            temp.next=temp.next.next;
            temp.next.prev = temp;
            System.out.println(" data at "+c+1+" deleted");
            return head;
          }
          temp=temp.next;
        }
        if(c==0)
        {
            System.out.println("entered position is invalid");
        }
       return head;
    }
    public static void search(Node head,Node end)
    {
      if(head==null)
      {
        System.out.println("no element to search");
        return;
      }
      Node temp = head;
      System.out.print("Enter registration number you want to update the mark: ");
      int reg = sc.nextInt();
      boolean valid = true;
      while(temp!=null)
      {
        if(reg == temp.regd_no)
        {
            System.out.println("enter the mark of student having reg no"+reg);
            temp.mark = sc.nextInt();
            System.out.println("new mark updated successfully");
            valid = false;
            return;
        }
        temp = temp.next;
      }
      if(valid)
      System.out.println("invalid registration number ");
      
    }

    public static void fdisp()
    {
        if(head == null)
        {
            System.out.println("no elements  ");     
        }
        System.out.println("elements are in forward ");
           Node  ptr=head;
            while(ptr!=null)
            {
                System.out.println("student reg no ="+ptr.regd_no);
                System.out.println("student mark ="+ptr.mark);
                ptr=ptr.next;
            }
    }
    public static void bdisp()
    {
        if(head==null)
        {
            System.out.println("no elements  ");
                
        }
        System.out.println("elements are in backward ");
           Node  ptr = head;
           Node temp = null;
           while(ptr != null)
           {
                temp=ptr;
                ptr=ptr.next;
           }
           while(temp!=null)
           {
            System.out.println("student reg no ="+temp.regd_no);
            System.out.println("student mark ="+temp.mark);
            temp=temp.prev;
           }
    }
    
}
class Test
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) 
        {
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Insert at beginning");
            System.out.println("3: Insert at end");
            System.out.println("4: Insert at any position");
            System.out.println("5: Delete from beginning");
            System.out.println("6: Delete from end");
            System.out.println("7: Delete from any position");
            System.out.println("8: Search and update mark");
              System.out.println("9: backward display");
              System.out.println("10: forward display");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> dl.create(dl.head,dl.end);
                case 2 -> dl.InsBeg (dl.head,dl.end);
                case 3 -> dl.InsEnd (dl.head,dl.end);
                case 4 -> dl.InsAny (dl.head,dl.end);
                case 5 -> dl.DelBeg (dl.head,dl.end);
                case 6 -> dl.DelEnd (dl.head,dl.end);
                case 7 -> dl.DelAny (dl.head,dl.end);
                case 8 -> dl.search (dl.head,dl.end);
                case 9 -> dl.bdisp();
                case 10 -> dl.fdisp();
                
                default -> System.out.println("Wrong choice");
            }
        }

    }
}
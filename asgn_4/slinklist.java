import java.util.*;
class Node
{
 protected int regd_no;
 protected float mark;
 protected Node next;



}

class sl
{
    static Node head=null;
	static Scanner sc=new Scanner(System.in);
	public static void create()
	{ 
		Node newnode=null;
		Node ptr=null;
		char ch='y';
		int c=0;
	    while(ch=='y')
	    {
	    	newnode=new Node();
	    	c++;
	    	System.out.print("Student "+c+" registration number ");
	    	newnode.regd_no=sc.nextInt();
            System.out.print("Student "+c+" mark ");
            newnode.mark=sc.nextFloat();
	    	if(head==null)
	    	{
	    		head=newnode;
	    	}
            else
            {
            	ptr.next=newnode;
            }
            ptr=newnode;
            System.out.println("Enter 'y' if you want to create new node:");
            ch=sc.next().charAt(0); 
	    }
	}
    public static Node InsBeg(Node head)
    {
        Node newNode = new Node();
        System.out.println("for insert at beginning ->");
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();

        newNode.next =head;
        head = newNode;
        sl.head = head;
        return head;
    }
    public static Node InsEnd(Node head)
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
        newNode.next=null;
        return head;
    }
    public static Node InsAny(Node head)
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
    public static Node DelBeg(Node start)
    {
        if(head == null)
        {
            System.out.println("no data to delete");
            return head;
        }
        head = head.next;
        System.out.println("data at beginning deleted");
        return head;
    }
    public static Node DelEnd(Node start)
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
    public static Node DelAny(Node start)
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
    public static void Delreg()
    {
      System.out.println("enter the resistration number of student you want to delete from database");
      int reg = sc.nextInt();
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }
        if (head.regd_no == reg) 
        {
            head = head.next;
            System.out.println("Deleted node with regd_no: " + reg);
            sl.head = head;
            return;
        }
      Node temp = head;
      int p = 0;
      boolean valid = true;
      while(temp!=null)
      {
        p++;
        if(reg == temp.next.regd_no)
        {
          temp.next=temp.next.next;
          System.out.println("student"+p+1+" having registration number"+reg+" is deleted");
          valid = false;
          return;
        }
        temp=temp.next;
      }
      if(valid)
      {
          System.out.println("entered registration number does't exist");
      }
    }
    public static void search(Node head)
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
    public static void sort(Node start)//////not done
    {
        Node temp = head;
        float max = temp.mark;
    }
    public static int count(Node head)
    {
        if(head==null)
        {
            return 0;
        }
        if(head.next == null)
        {
            return 1;
        }
        int c = 1;
        Node temp = head;
        while(temp.next!=null)
        {
            c++;
            temp = temp.next;
        }
        return c;
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        sl.head = head;
        return head;
    }
    public static void display()
    {
        Node temp = head;
        int c = 0;
        while(temp!=null)
        {   
            c++;
            System.out.println("student"+c+" registration number is "+temp.regd_no);
            System.out.println("student"+c+" mark is "+temp.mark);
            temp=temp.next;
        }
    }
    
}
class Test
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at beginning");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from beginning");
            System.out.println("7: Delete from end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Delete by registration number");
            System.out.println("10: Search and update mark");
            System.out.println("11: Sort");
            System.out.println("12: Count nodes");
            System.out.println("13: Reverse");
            System.out.println("----------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> sl.create();
                case 2 -> sl.display();
                case 3 -> sl.InsBeg(sl.head);
                case 4 -> sl.InsEnd(sl.head);
                case 5 -> sl.InsAny(sl.head);
                case 6 -> sl.DelBeg(sl.head);
                case 7 -> sl.DelEnd(sl.head);
                case 8 -> sl.DelAny(sl.head);
                case 9 -> sl.Delreg();
                case 10 -> sl.search(sl.head);
                case 11 -> sl.sort(sl.head);
                case 12 -> System.out.println("total number of students are in database "+sl.count(sl.head));
                case 13 -> sl.reverse(sl.head);
                default -> System.out.println("Wrong choice");
            }
        }

    }
}
     

      
    
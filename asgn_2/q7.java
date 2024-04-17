/*
Define an interface DetailInfo to declare methods display( ) & count( ). Another class
Person contains a static data member maxcount, instance member name & method
display( ) to display name of a person, count the no. of characters present in the name
of the person.
 */
interface DetailInfo
{
    void display( );//public abstract void display();
    void count();
}
class Person implements DetailInfo
{
    static int count = 0;
    String name;
    Person(String name)
    {
      this.name = name;
    }

    public void display()
    {
     count();
     System.out.println("there are total "+count+" no of charectors present");
    }
    public void count()
    {
      for(int i = 0; i < name.length(); i++)
          {    
            if(name.charAt(i) != ' ')    
             count++;    
          } 
    }
}

class q7 {
    public static void main(String[] args) {
        Person p1 = new Person("Guru");
        Person p2 = new Person("rereh rgr");
        p1.display();
        p2.display();
    }
}

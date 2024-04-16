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
    static int maxcount = 0;
    String name;
    Person(String name)
    {
      this.name = name;
      maxcount++;
    }

    public void display()
    {
     System.out.println("there are total "+maxcount+" no of persons present");
    }
    public void count()
    {
    }
}

class q7 {
    public static void main(String[] args) {
        Person p1 = new Person("Guru");
        Person p2 = new Person("rereh");
        Person p3 = new Person("gwet");
        Person p4 = new Person("gffg");
        Person p5 = new Person("gfewh");
        p1.display();
    }
}

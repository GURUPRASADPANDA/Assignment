class Person
{
    String name;
    int age;
    Person()
    {
    }
    Person (String name, int age)
    {
      this.name = name;
      this.age = age;
    }
} 
class Employee extends Person
{
    int Eid;
    double salary;
    Employee (String name, int age , int Eid, double salary)
    {
      super(name,age);
      this.Eid = Eid;
      this.salary = salary;
    }
    void empDisplay()
    {
      System.out.println("name is: "+name+"\nage is: "+age+"\nEid is: "+Eid+"\nsalary is: "+salary);
    }
}
 class q5 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee("Guru", 20, 6, 100000000);
        e1.empDisplay();
    }
}

/*
 1. Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person.
Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger.

 */
import java.util.*;
class person {
    String name ;
     int age;
     void setData(String name,int age){
     this.name=name;
     this.age=age; 
     }
     void displayData(){
        System.out.println("name is : "+name+"\nage is : "+age);
     }

}
class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person p1 = new person();
        p1.name = "Rohan";
        p1.age = 20;
        person p2 = new person();
        System.out.println("enter name of 2nd person and age");
        p2.setData(sc.nextLine(), sc.nextInt());
        p1.displayData();
        p2.displayData();
    }
}
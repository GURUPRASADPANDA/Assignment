/*
Create a class Student & enter mark, name of the student. If mark is more than 100, create
exception MarksOutOfBoundException & throw it using Java.
 */

import java.util.*;
class MarksOutOfBoundException extends Exception
{
    MarksOutOfBoundException(String message)
    {
        super(message);
    }
}
class Student
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter student name- ");
       String name  = sc.nextLine();
       System.out.print("enter mark of the student- "); 
       double mark = sc.nextDouble();
       try
       {
          if(mark > 100)
          {
            throw new MarksOutOfBoundException("mark can not exceed 100");
          }
          System.out.println(name+" has got "+mark);
       }
       catch(MarksOutOfBoundException e)
       {
        System.out.println(e);
       }
    }
}

/*
enter student name- Guru
enter mark of the student- 101
MarksOutOfBoundException: mark can not exceed 100
 */

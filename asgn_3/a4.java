/*Question 4 ->

Write a simple main class in java that contains an experiment that uses the generic Box<> class to build box
with different types and that this class wo0rks as advertised.
your experiment schould include the following :

(0)create a boxed String object and two variables that refers to that box . Change the contents of one and 
   determine the effect on the other. 
(0)create a boxed Integer object and two variables that refers to that box . Change the contents of one and 
   determine the effect on the other. 
(0)create a boxed Object object and two variables that refers to that box . Determine what happens if you put
   an integer in the box. 
   
*/
class Box<T>
{
    T p;
    Box()
    {
    }
    void setdata(T p)
    {
    this.p=p;
    }
    public T getdata()
    {
        return p;
    }
}

class Test
{
  public static void main(String[] args) 
  {
    Box<String> a1 = new Box<String>();
    a1.setdata("string object a1");
    Box<String> a2 =a1;
    System.out.println("String a1 -: "+a1.getdata());
    System.out.println("String a1 -: "+a2.getdata());
    a1.setdata("changed");
    System.out.println("String a1 -: "+a1.getdata());
    System.out.println("String a1 -: "+a2.getdata());

    Box<Integer> b1 = new Box<Integer>();
    b1.setdata(46);
    Box<Integer> b2 =b1;
    System.out.println("Integer b1 -: "+b1.getdata());
    System.out.println("Integer b2 -: "+b2.getdata());
    b1.setdata(64);
    System.out.println("Integer b1 -: "+b1.getdata());
    System.out.println("Integer b2 -: "+b2.getdata());

    Box<Object> c1 = new Box<Object>();
    c1.setdata(46);
    Box<Object> c2 =c1;
    System.out.println("Object c1 -: "+c1.getdata());
    System.out.println("Object c2 -: "+c2.getdata());
    c1.setdata("string");
    System.out.println("Object c1 -: "+c1.getdata());
    System.out.println("Object c2 -: "+c2.getdata());
      
  }
}
/* 
OUT PUT =>

String a1  -: string object a1
String a1  -: string object a1
String a1  -: changed
String a1  -: changed
Integer b1 -: 46
Integer b2 -: 46
Integer b1 -: 64
Integer b2 -: 64
Object c1  -: 46
Object c2  -: 46
Object c1  -: string
Object c2  -: string

*/

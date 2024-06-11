/*
 Define a class called Complex with instance variables real, imag and instance methods
 void setData(),
 void display(),
 public Complex add(Complex, Complex)
Write the main method in a separate class to implement the addition of two complex
number with the given method signature as above.
 */

class Complex
{
    int real;
    int img;
    Complex()
    {
    }
    void setData(int real,int img)
    {
    this.real = real;
    this.img = img;
    }
    void display()
    {
     System.out.println(real+" + "+img+"i");
    }
    public Complex add(Complex c1, Complex c2)
    {
    Complex c3 = new Complex();
    c3.real = c1.real + c2.real;
    c3.img = c1.img + c2.img;
    return c3;
    }
}
class q2
{
    public static void main(String[] args) 
   {
        Complex c1 = new Complex();
        c1.setData(4, 5);
        Complex c2 = new Complex();
        c2.setData(1, 6);
        c1.display();
        c2.display();
        c1.add(c1, c2).display();
    }
}

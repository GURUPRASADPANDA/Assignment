/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”∗*/
class Test
{
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    if(a+b==c||a==(b-c)||(a*b)==c )
    {
     System.out.println("yes they can be used in a correct arithmetic formula");
    }
    else
    System.out.println("no they can't be used in a correct arithmetic formula");
    }
}
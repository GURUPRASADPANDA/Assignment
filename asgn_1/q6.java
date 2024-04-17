/*
Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is 
as follows.
public static boolean isOdd(int n)
 */

import java.util.*;
public class q6 {
    public static boolean isOdd(int n){
        boolean flag = false;
        for(int i = 1; i <= n ; i++){
          flag = !flag;
        }
        return flag ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int no = sc.nextInt();
        System.out.println(isOdd(no));
    }
}


import java.util.*;
/*
Write a java method to calculate the sum of digits of a given number until the number is a single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
 */
public class q5 {
    public static int sum_Of_Digits(int n){
        int sum = 0;
        while(n!=0){
           sum = sum + n % 10;
           n/=10;
        }
        System.out.println(sum);
        if(sum > 10){
           return  sum_Of_Digits(sum);
        }
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();
        int finalsum = 0;
        finalsum = sum_Of_Digits(no);
        System.out.println("final sum is : "+finalsum);
    }
}

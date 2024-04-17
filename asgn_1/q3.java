/*
Write a java program to check whether a number is a spy number or not.
*/
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value on N to check spy number : ");
		int n = sc.nextInt();
	    int temp = n;
		int sum = 0;
		int product = 1;
		
		while(temp>0) {
			sum = sum + temp%10;
			product = product * temp%10;
			temp=temp/10;
		}
		if(product == sum) {
	 	System.out.println(n +" is a spy number.");
	    }
		else 
		System.out.println(n +" is a spy number.");
		
		

  }
}

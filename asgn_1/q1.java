/*
Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
*/
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int no = Integer.parseInt(args[0]);
      
      System.out.println("entered no is : "+no);
      int count = 0;
      while(no>2) {
    	  no=no/2;
    	  count++;
      }
      System.out.println(count);
	}

}


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

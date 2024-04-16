import java.util.*;
 class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns in of a 2d array: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int sum = 0;
        System.out.print("enter elements of array: ");
        int arr[][] =new  int [rows][columns];
        for(int i = 0 ; i < rows ; i++){
           for(int j = 0 ; j < columns ; j++){
            arr[i][j] = sc.nextInt();
           }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                sum = sum + arr[i][j];
             System.out.print(arr[i][j]+"\t");
              }System.out.println();
           }
           System.out.println("sum of all the elements are :"+sum);
         }
    }

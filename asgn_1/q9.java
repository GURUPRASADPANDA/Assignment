/*
Write a method that sums all the numbers in the major diagonal in an n * n matrix of doublevalues using the following header:
public static double sumMajorDiagonal(double[][] m)Write a java program that reads a 4-by-4 matrix and displays the sum of all 
its elements on the major diagonal.

Sample Run:

Enter a 4-by-4 matrix row by row:

1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16
Sum of the elements in the major diagonal is 34.5
 */
import java.util.*;
 class q9 {
    public static double sumMajorDiagonal(double[][] m){
         double sum = 0;
         int n = m.length;
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==j){
             sum = sum + m[i][j];
                }
            }
         }
         return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        double arr[][] =new  double [n][n];
        System.out.println("enter a 4 X 4 matrix: ");
        for(int i = 0 ; i < n ; i++){
           for(int j = 0 ; j < n ; j++){
            arr[i][j] = sc.nextDouble();
           }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
             System.out.print(arr[i][j]+"\t");
              }System.out.println();
           }
           System.out.println("sum of all the elements are :"+sumMajorDiagonal(arr));
         }
    }
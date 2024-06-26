/*The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
human body fat in populations. It is computed by taking the individual's weight (mass) in 
kilograms and dividing it by the square of their height in meters. i.e.
Metric: BMI =   𝑾𝒆𝒊𝒈𝒉𝒕 / 𝑯𝒆𝒊𝒈𝒉𝒕)^𝟐 
*/
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your weight in kg ");
          double weight = sc.nextDouble();
          System.out.println("Enter your height in metre ");
          double height = sc.nextDouble();
          double bmi = weight/(Math.pow(height,2));
          System.out.println("BMI:"+bmi);
		  if(bmi<18.5)
		  {
			 System.out.println(" Underweight "); 
		  }
		  else if(bmi >= 18.5 && bmi <= 24.9)
		  {
			  System.out.println(" Normal weight "); 
		  }
		  else if(bmi >= 25.0 && bmi <= 29.9)
		  {
			  System.out.println("Overweight ");
		  }
		  else if(bmi >= 30.0)
		  {
			  System.out.println("Obese ");
		  }
		  else
			  System.out.println("you have to input valid data");
	}
} 


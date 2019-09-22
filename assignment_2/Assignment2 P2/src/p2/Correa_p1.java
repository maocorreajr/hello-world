package p2;
import java.util.Scanner;

public class BMI_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double userWeight, userHeight, bmiMetric, bmiStandard;
		/*
		 * For the ability to choose which system in they want to use metric or standard
		 * set one equal to a variable and the other to another then do to if statements
		 * so that it uses the BMI calculator for those systems 
		 * */
		
		System.out.println("________BMI Categories__________");
		System.out.println("Underweight   |      <18.5     |");
		System.out.println("Normal weight |    18.5–24.9   |");
		System.out.println("Overweight    |     25–29.9    |");
		System.out.println("Obesity       |  30 or greater |\n");
		
		System.out.print("To calculate your BMI what system would you like to use?\n");
		System.out.print("      (a) Metric System or (b) Standard System\n");
		char userChoice = scanner.next().charAt(0);
		
		if (userChoice == 'a') {
			System.out.print("What is your weight in kilograms? ");
			userWeight = scanner.nextDouble();
			
			System.out.print("What is your height in meters? ");
			userHeight = scanner.nextDouble();
			
			System.out.println("Your weight is " + userWeight + " kilograms and your height is " + userHeight + " meters.\n");
			
			bmiMetric = (userWeight/(userHeight*userHeight));
			System.out.printf("Your BMI is: %.2f\n", bmiMetric);
			if (bmiMetric < 18.5) {
				System.out.println("You are Underweight.");
			}
			else if (bmiMetric >= 18.5 && bmiMetric <= 24.9) {
				System.out.println("You are Normal weight.");
			}
			else if (bmiMetric >= 25 && bmiMetric <= 29.9) {
				System.out.println("You are Overweight.");
			}
			else if (bmiMetric >= 30) {
				System.out.println("You are Obese.");
			}
			
		}
		
		else if (userChoice == 'b') {
			System.out.print("What is your weight in pounds? ");
			userWeight = scanner.nextDouble();
			
			System.out.print("What is your height in inches? ");
			userHeight = scanner.nextDouble();

			System.out.println("Your weight is " + userWeight + " pounds and your height is " + userHeight + " inches.\n");
			
			bmiStandard = ((703*userWeight)/(userHeight*userHeight));
			System.out.printf("Your BMI is: %.2f\n", bmiStandard);
			
			if (bmiStandard < 18.5) {
				System.out.println("You are Underweight.");
			}
			else if (bmiStandard >= 18.5 && bmiStandard <= 24.9) {
				System.out.println("You are Normal weight.");
			}
			else if (bmiStandard >= 25 && bmiStandard <= 29.9) {
				System.out.println("You are Overweight.");
			}
			else if (bmiStandard >= 30) {
				System.out.println("You are Obese.");
			}
		}
		
		scanner.close();
	}
}

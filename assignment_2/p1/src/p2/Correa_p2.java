package p2;

import java.util.Scanner;

public class Correa_p2 {

	public static void main(String[] args) {
		/*
		 * encrypt = replace each # by: ((# + 7)/10) -> then getting the remainder we
		 * have the encrypted values we need to swap 1 with 3 and 2 and 4 print the
		 * encrypted integer
		 * 
		 */
		Scanner value = new Scanner(System.in);
		
		Decrypt number1 = new Decrypt();
		Encrypt number2 = new Encrypt();
		
		System.out.println("Would you like to encrypt or decrypt an integer?\n");
		System.out.println("Type (a) to encrypt and (b) to decrypt\n");
		char userChoice = value.next().charAt(0);
		
		if (userChoice == 'a') {
			number2.encrypt();
		}
		if (userChoice == 'b') {
			number1.decryption();
		}
		value.close();
	}
}
	class Decrypt {
		public  void decryption() {
		Scanner value = new Scanner(System.in);

		double firstValue, secondValue, thirdValue, fourthValue;

		System.out.print("What are the integer values you would like to decrypt?\n");
		System.out.print("What is the first integer?\n");
		firstValue = value.nextInt();

		System.out.print("What is the second integer? ");
		secondValue = value.nextInt();

		System.out.print("What is the third integer? ");
		thirdValue = value.nextInt();

		System.out.print("What is the fourth integer? ");
		fourthValue = value.nextInt();

		// swap(firstValue,thirdValue);
		// swap(secondValue,fourthValue);
		double unswap1 = 0;;
		unswap1  = firstValue;
		firstValue = thirdValue;
		thirdValue = unswap1;
		
		double unswap2 = 0;
		unswap2  = secondValue;
		secondValue = fourthValue;
		fourthValue = unswap2;

		firstValue = ((firstValue + 3) %10);
		secondValue = ((secondValue + 3) %10);
		thirdValue = ((thirdValue + 3) %10);
		fourthValue = ((fourthValue + 3)%10);

		System.out.println("The decrypted values are value is\n");
		System.out.printf("%.0f%.0f%.0f%.0f", firstValue, secondValue, thirdValue, fourthValue);

		value.close();
	}
}
	class Encrypt{
		public  void encrypt() {
		Scanner value = new Scanner(System.in);

		double firstValue, secondValue, thirdValue, fourthValue;

		System.out.println("What are the 4 integer values you would like to encrypt? ");
		System.out.println("What is the first integer? ");
		firstValue = value.nextInt();

		System.out.println("What is the second integer? ");
		secondValue = value.nextInt();

		System.out.println("What is the third integer? ");
		thirdValue = value.nextInt();

		System.out.println("What is the fourth integer? ");
		fourthValue = value.nextInt();

		firstValue = ((firstValue + 7) % 10);
		secondValue = ((secondValue + 7) % 10);
		thirdValue = ((thirdValue + 7) % 10);
		fourthValue = ((fourthValue + 7) % 10);
		
		double swap1 = 0;;
		swap1  = firstValue;
		firstValue = thirdValue;
		thirdValue = swap1;
		
		double swap2 = 0;
		swap2  = secondValue;
		secondValue = fourthValue;
		fourthValue = swap2;
		
		System.out.println("The encrypted four-digit integer is\n");
		System.out.printf("%.0f%.0f%.0f%.0f",firstValue,secondValue,thirdValue,fourthValue);
		
		value.close();
	}
}


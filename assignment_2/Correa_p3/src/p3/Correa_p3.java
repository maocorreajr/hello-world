package p3;

import java.util.Scanner;

public class Correa_p3 {

	public static void main(String[] args) {
		/*
		 * pseudo code type a value from one to 10 to rate this topic 1 being least
		 * important and 10 being most important
		 * 
		 * Average rating: highest point total lowest point total
		 * 
		 */
		Scanner rating = new Scanner(System.in);

		String[] topics = { "Juventus", "FC Barcelona", "Real Madrid FC", "Liverpool FC", "Manchester City" };

		int[][] responses = new int[5][10];

		int numUsers, a, b, userRating;
		// int highestRatingTotal = 0, lowestRatingTotal = 0, highestRatingTopic, lowestRatingTopic;

		for (a = 0; a < responses.length; a++) {
			for (b = 1; b < 10; b++) {
				responses[a][b] = 0;
			}
		}

		System.out.println("What is the total number of people rating the following topics: ");
		numUsers = rating.nextInt();
		System.out.println("The total number of user inputing ratings is " + numUsers + "\n");

		for (a = 0; a < numUsers; a++) {
			System.out.println("Rate the following 5 teams from 1 - 10. (1 = worst team and 10 = best team)\n");
			for (b = 0; b < responses.length; b++) {
				System.out.print("Enter your rating for " + topics[b] + " : ");
				userRating = rating.nextInt();

				if (userRating > 1 && userRating > 10) {
					System.out.println("Please enter a rating that is between 1 and 10");
					System.out.print("Enter your rating for " + topics[b] + " : ");
					userRating = rating.nextInt();
				}
				responses[a][userRating - 1]++;
			}
		}
		
		System.out.println("\n");
		System.out.println(
				"Topics          |    1     |     2     |     3     |     4     |     5     |   6    |    7   |    8   |     9   |   10    | average rating");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------");
		for(int count = 0; count < responses.length; count++ ) {
			System.out.println(topics[count]);
		 }

		rating.close();
	}
}
	

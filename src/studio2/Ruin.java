package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("What is your lose limit?");
		int loseLimit = in.nextInt();
		System.out.println("What are the amount of simulations?");
		int totalSimulations = in.nextInt();
		int totalPlays = 0;
		
		
		
		while (startAmount < winLimit) {
			{
			if (Math.random() < winChance) {
					
						startAmount += 1 ;
						totalPlays += 1;
						totalSimulations += 1;
						System.out.println("Simulation " + totalPlays + ": " + startAmount);
					}
			else  {
						startAmount -= 1;
						totalPlays += 1;
						totalSimulations += 1;
						System.out.println("Simulation " + totalPlays + ": " + startAmount);
					}
			if (startAmount == winLimit) {
					
					System.out.println("Success");
					System.out.println(totalPlays);
			}
			if (startAmount == loseLimit) {
				
				System.out.println("Ruin");
				System.out.println(totalPlays);
				break;
			}
			}
			}
			}
		
			}
			

		



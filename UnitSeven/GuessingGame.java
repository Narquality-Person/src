package UnitSeven;

import java.util.Scanner;


import static java.lang.System.*;
import java.util.Random;

public class GuessingGame
{
	private int upperBound;
	String y = "yes";
	String n = "no";
	
	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing Game- How many numbers?");
		upperBound = keyboard.nextInt();
		int lowerBound = 1;
		int userGuess = 0;
		int guesses = 0;
		int secretNumber = 0;
		
		for (lowerBound = 1; lowerBound <= upperBound; lowerBound++)
		{
			Random thing = new Random();
			secretNumber = thing.nextInt(upperBound);
		}
		
		do {
			guesses = guesses+1;
			System.out.println("Enter a number between 1 and " + upperBound + ":");
			userGuess = keyboard.nextInt();
			if (userGuess == secretNumber)
			{
				System.out.println("It took you " + guesses + " to guess the number " + secretNumber + ".");
			}
			else if (userGuess >= upperBound)
			{
				System.out.println("Your guess is out of bounds.");
			}
				
		} while (userGuess != secretNumber);
		
	}

	public String toString()
	{
		Scanner keyboard = new Scanner(System.in);
		String output="Do you want to play again?";
		return output;
	}
}
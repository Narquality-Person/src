package UnitSeven;

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do{
		   System.out.print("Guessing Game - How many numbers? ");
			GuessingGame game = new GuessingGame(keyboard.nextInt());
			game.playGame();

		   System.out.print("Do you want to play again? ");
		   response = keyboard.next().charAt(0);
		}while(response=='Y'||response=='y');
		
	}
}

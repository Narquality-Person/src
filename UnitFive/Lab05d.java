package UnitFive;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		/*out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);*/
		
		char letter = 0;
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		
		test.setChar('A');
		test.chaDone();
		
		test.setChar('1');
		test.chaDone();
		
		test.setChar('7');
		test.chaDone();
		
		test.setChar('D');
		test.chaDone();
		
		test.setChar('2');
		test.chaDone();
		
		test.setChar('x');
		test.chaDone();
		
		test.setChar('z');
		test.chaDone();
		
		test.setChar('9');
		test.chaDone();
		
	}
}

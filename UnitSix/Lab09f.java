package UnitSix;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		
		test.setRemover("I am Sam I am", 'a');
		test.removeLetters();
		test.toString();
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		test.removeLetters();
		test.toString();
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		test.removeLetters();
		test.toString();
		
		test.setRemover("abababababa", 'b');
		test.removeLetters();
		test.toString();
		
		test.setRemover("abaababababa", 'x');
		test.removeLetters();
		test.toString();
	}
}
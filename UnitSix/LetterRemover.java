package UnitSix;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
 private String sentence;
 private char lookFor;

	public LetterRemover()
	{
		setRemover("default", 'A');
	}

	//add in second constructor
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		out.println(sentence);
		while (sentence.indexOf(lookFor) >= 0)
		{
			sentence = sentence.replace(lookFor, ' ');
		}
		String cleaned = sentence;
		out.println("Letter removed: " + lookFor + " \n" + cleaned + " \n");
		return cleaned;
	}

	public String toString()
	{
		return sentence;
	}
}
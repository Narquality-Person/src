package UnitFive;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	int ASCII;

	public CharacterAnalyzer(char c)
	{
		theChar = c;
		int ASCII = (int)c;
	}
	public void setChar(char c)
	{
		theChar = c;
		int ASCII = (int)c;
	}

	public char getChar()
	{
		return theChar;
	}
	
	public boolean isLower( )
	{
		if(theChar>=97 && theChar<=122) {
			out.println(theChar + " is an lowercase character. ASCII == " + (int)theChar);
			return true;
		}
		else
		return false;
	}

	public boolean isUpper( )
	{
		if(theChar>=65 && theChar<=90) {
			out.println(theChar + " is an uppercase character. ASCII == " + (int)theChar);
			return true;
		}
		else
		return false;
	}
	
	public boolean isNumber( )
	{
		if(theChar>=48 && theChar<=57) {
			out.println(theChar + " is an number. ASCII == " + (int)theChar);
			return true;
		}
		else
		return false;
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public void chaDone()
	{
		if (isUpper() == true)
		{
		}
		else if (isLower() == true)
		{
		}
		else isNumber();
	}
}

package UnitFourteen;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	private int sLength;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   sLength = s.length();
	   
	   mat = new char[sLength][sLength];
	   
	   for (int i = 0; i < sLength; i++)
	   {
		   char ch = s.charAt(i);
		   
		   mat[0][i] = ch;
		   mat[sLength - 1][i] = ch;
		   
		   mat[i][i] = ch;
		   mat[length - i - 1][i] = ch;
	   }
	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < sLength; i++)
		{
			for (int j = 0; j < sLength; j++)
			{
				output = output + mat[i][j];
			}
			output = output + "\n";
		}
		return output+"\n\n";
	}
}
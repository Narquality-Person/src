package UnitFive;


import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "ravens";
	}
	public StringOddOrEven(String s)
	{
		
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if(word.length()%2 == 0 )
 			return true;
 		else
		return false;
	}

 	public String toString()
 	{
 		String output="";





 		return output;
	}
}
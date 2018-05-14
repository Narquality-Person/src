package UnitTwelve;

import static java.lang.System.*;

public class WordVowels implements Comparable<WordVowels>
{
	private String word;

	public WordVowels ( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for(int i=0;i<word.length();i++)
		{
			for(int j=0;j<vowels.length();j++)
			{
				if(word.charAt(i)==vowels.charAt(j))
				{
					vowelCount++;
				}
			}
		}
		
		return vowelCount;
	}

	public int compareTo(WordVowels rhs)
	{
		if (numVowels() > rhs.numVowels())
		{
			return 1;
		}
		else if (numVowels() == rhs.numVowels())
		{
			if (word.charAt(0) > rhs.toString().length())
			{
				return 1;
			}
			else if (word.charAt(0) == rhs.toString().charAt(0))
			{
				if (word.charAt(1) > rhs.toString().charAt(1))
				{
					return 1;
				}
				else if (word.charAt(1) == rhs.toString().charAt(1))
				{
					return 0;
				}
				else
					return -1;
			}
			return -1;
		}
		return -1;
	}

	public String toString()
	{
		return word;
	}
}
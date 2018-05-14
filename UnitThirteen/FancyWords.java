package UnitThirteen;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		
		for (String word : wordRay)
		{
			max = Math.max(max, word.length());
		}

		List<String> fancyWordList = Arrays.asList(wordRay);
		Collections.reverse(fancyWordList);
		fancyWordList.toArray(wordRay);
		
		for (int i = 0; i < max; i++)
		{
			for (String word : wordRay)
			{
				int index = word.length() - i - 1;
				
				if (index >= 0 && index < word.length())
				{
					output = output + word.charAt(index);
				}
				
				else
				{
					output = output + " ";
				}
			}
			
			output = output + "\n";
		}
		
		return output + "\n\n";
	}
}

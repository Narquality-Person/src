package UnitTen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		
		for(int j = 0; j <values.length; j++){
			letters.add(values[j]);
		}
		
		for(int j = 0; j < values.length; j++){
			count.add(0);
		}
		
		fileName = fName;

		out.println("search letters = "+letters);
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		ArrayList<String> aList = new ArrayList<String>();
		
		Scanner file = new Scanner(new File(fileName));
		
		while(file.hasNext())
		{
			aList.add(file.next().trim());
		}
		
		for(int a = 0; a < aList.size(); a++)
		{
			for(int b = 0; b < aList.get(b).length(); b++)
			{
				for(int c = 0; c < letters.size(); c++)
				{
					if(aList.get(a).charAt(a) == (char)(letters.get(c)))
					{
						count.set(c, count.get(c)+1);
					}
				}
			}
		}
	}

	public char mostFrequent()
	{
		if((count.get(0) > count.get(1)) && (count.get(0) > count.get(2)))
		{
			return (char)letters.get(0);
		}
		
		if((count.get(1) > count.get(0)) && (count.get(1) > count.get(2)))
		{
			return (char)letters.get(1);
		}
		
		else
		{
			return (char)letters.get(2);
		}
	}

	public char leastFrequent()
	{
		if((count.get(0) < count.get(1)) && (count.get(0) < count.get(2)))
		{
			return (char)letters.get(0); 
		}
		
		if((count.get(1) < count.get(0)) && (count.get(1) < count.get(2)))
		{
			return (char)letters.get(1);
		}
	
		else
		{
			return (char)letters.get(2);
		}
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}

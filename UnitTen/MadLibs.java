package UnitTen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random;

public class MadLibs
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String madLibs;
	private Random ran;
	
	private void load()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		Random ran = new Random();
	}
	
	public MadLibs()
	{
		load();
	}

	public MadLibs(String fileName)
	{
		//load stuff?
		load();
		
		
		try
		{
			Scanner file = new Scanner(new File(fileName));
			
			madLibs = "";
			
			while(file.hasNext())
			{
				String mL = file.next();
				
				if (mL.equals("#"))
				{
					madLibs = madLibs + getRandomNoun();
				}
				
				else if (mL.equals("@"))
				{
					madLibs = madLibs + getRandomVerb();
				}
				
				else if (mL.equals("&"))
				{
					madLibs = madLibs + getRandomAdjective();
				}
				
				else
				{
					madLibs = madLibs + mL;
				}
				
				madLibs = madLibs + " ";
			}
		
		}
		
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner noun = new Scanner(new File("nouns.dat"));
			
			while(noun.hasNext())
			{
				nouns.add(noun.next());
			}
		}
		
		catch(Exception e)
		{
		
		}	
		
	}
	
	public void loadVerbs()
	{
		try
		{
			Scanner verb = new Scanner(new File("verb.dat"));
			
			while (verb.hasNext())
			{
				verbs.add(verb.next());
			}
		}
		
		catch(Exception e)
		{
			
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner adjective = new Scanner(new File("adjective.dat"));
			
			while (adjective.hasNext())
			{
				adjectives.add(adjective.next());
			}
		}
		
		catch(Exception e)
		{
			
		}
	}

	public String getRandomVerb()
	{
		Random ran = new Random();
		
		return nouns.get(ran.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		Random ran = new Random();
		
		return nouns.get(ran.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		Random ran = new Random();
		
		return adjectives.get(ran.nextInt(adjectives.size()));
	}		

	public String toString()
	{
	   return madLibs;
	}
}
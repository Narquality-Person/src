package UnitSeven;

import java.lang.StringBuffer;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public void TriangleThrees(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle(String let, int sz)
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		for(int r=1; r<=size; r++)
		{
			for(int c = 0; c<= size - r; c++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print(letter);
			}
			System.out.println("\n");
		}
		return letter;
	}
		
}
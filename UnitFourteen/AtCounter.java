package UnitFourteen;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount, row, col;

	public void aCounter()
	{
		atCount = 0;
		atMat = new char[][]
				{
									{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}
				};
	}
	
	public AtCounter()
	{
		aCounter();
	}

	public int countAts(int r, int c)
	{
		aCounter();
		
		row = r;
		col = c;
		
		countAts(row, col, 0);
		
		return atCount;
	}
	
	public void countAts(int r, int c, int stack)
	{
		if (bound(r, c))
		{
			if(atMat[r][c] == '@')
			{
				atMat[r][c] = '+';
				
				atCount++;
				
				countAts(r - 1, c, stack + 1);
				countAts(r + 1, c, stack + 1);
				
				countAts(r, c - 1, stack + 1);
				countAts(r, c + 1, stack + 1);
			}
		}
	}
	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output = row + " " + col + " has " + getAtCount() + " @s connected to it. \n";
		return output;
	}
	public boolean bound(int r, int c)
	{
		if (r < 0)
		{
			return false;
		}
		
		if (r >= atMat.length)
		{
			return false;
		}
		
		if (c < 0)
		{
			return false;
		}
		
		if (c >= atMat[0].length)
		{
			return false;
		}
		
		else
			return true;
	}
}
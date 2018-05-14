package UnitSix;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		start = 0;
		stop = 0;
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
		
		out.println(start + " " + stop);
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int i = start; i < stop; i++ )
		{
			if (i%2 <= 0)
			{
				evenCount = evenCount + 1;
			}
		}
		out.println("even count " + evenCount);
		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int i = start; i < stop; i++ )
		{
			if (i%2 >= 1)
			{
				oddCount = oddCount + 1;
			}
		}
		out.println("odd count " + oddCount);
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int i = start; i <= stop; i++)
		{
			total = total + i;
		}
		out.println("total " + total + "\n");
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}
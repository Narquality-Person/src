package UnitSeven;

import static java.lang.System.*;

public class Triples
{
   private int number;
   int aP, bP, cP;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int gCF(int a, int b, int c)
	{
		aP = a;
		bP = b;
		cP = c;
		int max = 0;
		for (int i=2; i <= number; i++)
		{
			if (a%i== 0&& b%i==0 && c%i==0)
			       max=0;
			else
				max = 0;
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for (aP = 1; aP<= number; aP++)
		{
			for (bP = 1; bP<= number; bP++)
			{
				for (cP = 1; cP<= number; cP++)
				{
					if (Math.pow(aP, 2) + Math.pow(bP, 2) == Math.pow(cP, 2) && gCF(aP,bP,cP) == 1)
					{
						output = output + aP + bP + cP;
					}
				}
			}
		}

		return output+"\n";
	}
}
package UnitSix;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats();
		
		test.setNums(1, 5);
		test.getEvenCount();
		test.getOddCount();
		test.getTotal();
		test.toString();
		
		test.setNums(2, 8);
		test.getEvenCount();
		test.getOddCount();
		test.getTotal();
		test.toString();
		
		test.setNums(5, 15);
		test.getEvenCount();
		test.getOddCount();
		test.getTotal();
		test.toString();
		
	}
}
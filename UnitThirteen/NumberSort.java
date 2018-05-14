package UnitThirteen;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int num = number;
		
		while (num > 0)
		{
			num = num / 10;
			count = count + 1;
		}
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int nDigits = getNumDigits(number);
		int[] sorted = new int[nDigits];
		int num = number;
		
		for (int i = nDigits - 1; i >= 0; i--)
		{
			sorted[i] = num % 10;
			num = num / 10;
		}
		
		Arrays.sort(sorted);
		return sorted;
	}
}
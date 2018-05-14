package UnitThirteen;

import static java.lang.System.*;
import java.util.Arrays;

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, 0, list.length-1);
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if (low >= high)
		{
			return;
		}
		
		System.out.println("pass " + passCount + ": " + Arrays.toString(list));
		
		passCount = passCount + 1;
		
		int split = partition(list, low, high);
		
		quickSort(list, low, split);
		quickSort(list, split+1, high);
		
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable item = list[low];
		
		int bottom = low - 1;
		int top = high + 1;
		
		while (bottom < top)
		{
			while (list[--top].compareTo(item) > 0);
			
			while (list[++bottom].compareTo(item) < 0);
			
			if (bottom >= top)
			{
				return top;
			}
			
			Comparable b = list[bottom];
			
			list[bottom] = list[top];
			list[top] = b;
		}
		
		return 0;
	}
}
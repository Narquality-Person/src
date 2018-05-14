package UnitThirteen;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modifiers
	
	public void add(String  word)
	{
		int loc = Collections.binarySearch(list, word);
		if (loc >= 0)
		{
			return;
		}
			
		list.add("");
		
		loc = ((-1) * loc) - 1;
		for (int i = list.size() - 2; i >= loc; i--)
		{
			list.set(i+1, list.get(i));
		}
		
		list.set(loc, word);
	}


	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		String stringy = "";
		
		for (String str : list)
		{
			stringy += str + " ";
		}
		
		return stringy;
	}
}

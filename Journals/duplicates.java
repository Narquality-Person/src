package Journals;

public class duplicates {
	static int[] dupe = {1,2,3,2,1,6,3,4,5,2};
	
	
	public duplicates (int[] number)
	{
		dupe = number;
	}
	
	public static int[] eliminateDuplicates(int[] list)
	{
		dupe = list;
		for(int i = 0; i<dupe.length; i++)
		{
			for (int k = i+1; k<dupe.length; k++)
			{
				if(dupe[i] == dupe[k])
				{
					dupe[k] = dupe[k+1];
				}
			}
		}
		return list;
	}
}

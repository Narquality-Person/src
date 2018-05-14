package UnitFourteen;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter acTester = new AtCounter();
		
		//test the code
		int[][] testCase = {{0,0}, {2,5}, {5,0}, {9,9}, {3,9}};
		
		for (int i = 0; i < testCase.length; i++)
		{
			int row = testCase[i][0];
			int col = testCase[i][1];
			
			acTester.countAts(row, col);
			System.out.print(acTester);
		}
	}
}
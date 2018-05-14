package UnitFourteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab21i {
	public static void main( String args[] ) throws IOException
	{
		Scanner test = new Scanner(new File("lab21i.dat"));
		
		List<String> iString = new ArrayList<String>();
		List<Integer> iSizes = new ArrayList<Integer>();
		
		while(test.hasNextLine())
		{
			int size = test.nextInt();
			test.nextLine();
			String str = test.nextLine();
			
			iSizes.add(size);
			iString.add(str);
		}
		
		for (int i = 0; i < iSizes.size(); i++)
		{
			System.out.println(new Maze(iSizes.get(i), iString.get(i)));
		}
		
		test.close();
	}
}

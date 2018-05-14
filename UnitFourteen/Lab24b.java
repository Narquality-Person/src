package UnitFourteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("Lab24b.dat"));
		int fSize = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < fSize; i++)
		{
			String fancyWord = file.next();
			System.out.println(new FancyWord(fancyWord));
		}
	}
}
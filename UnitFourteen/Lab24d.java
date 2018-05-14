package UnitFourteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("Lab24d.dat"));
		
		int numGames = file.nextInt();
		file.nextLine();
		
		String game = "";
		while(file.hasNextLine())
		{
			game = game + file.nextLine();
		}
		
		for (int i = 0; i < numGames; i++)
		{
			String g = g.substring(9 * i, 9 * (i + 1));
			TicTacToe ttt = new TicTacToe(g);
			System.out.println(ttt);
		}
	}
}

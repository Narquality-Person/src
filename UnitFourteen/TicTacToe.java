package UnitFourteen;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		this();
		int box = 0;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				mat[i][j] = game.charAt(box++);
			}
		}
	}

	public String getWinner()
	{
		for (int r = 0; r < 3; r++)
		{
			String row = "";
			
			// Row Scanner
			
			for (int c = 0; c < 3; c++)
			{
				row = row + mat[r][c];
			}
			
			if (row.equals("XXX"))
			{
				return "X wins with a row of horizontal Xs!";
			}
				
			if (row.equals("OOO"))
			{
				return "O wins with a row of horizontal Os!";
			}
		}
		
		// Column Scanner
		for (int c = 0; c < 3; c++)
		{
			String column = "";
			
			for (int r = 0; r < 3; r++)
			{
				column = column + mat[r][c];
			}
			
			if (column.equals("XXX"))
			{
				return "X wins with a column of vertical Xs!";
			}
				
			if (column.equals("OOO"))
			{
				return "O wins with a column of vertical Os!";
			}
			
		}
		
		// Diagonal Scanner
		String diagonal1 = "";
		String diagonal2 = "";
		
		for (int i = 0; i < 3; i++)
		{
			diagonal1 = diagonal1 + mat[i][i];
			diagonal2 = diagonal2 + mat[2-i][i];

			if (diagonal1.equals("XXX"))
			{
				return "With a diagnoal of Xs, X wins the game with Xs!";
			}
				
			if (diagonal1.equals("OOO"))
			{
				return "With a diagnoal of Os, O wins the game with Xs!";
			}
			
			if (diagonal2.equals("XXX"))
			{
				return "With a diagnoal of Xs, X wins the game with Xs!";
			}
			
			if (diagonal2.equals("OOO"))
			{
				return "With a diagnoal of Os, O wins the game with Xs!";
			}
		}
		
		return "It's a tie.";
	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				output = output + mat[i][j] + " ";
			}
			
			output = output + "\n";
		}
		
		output = output + getWinner();
		
		return output+"\n\n";
	}
}
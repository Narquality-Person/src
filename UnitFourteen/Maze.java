package UnitFourteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze, oMaze;

	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		oMaze = new int[size][size];
		
		Scanner test = new Scanner(line);
		
		for (int r = 0; r < size; r++)
		{
			for (int c = 0; c < size; c++)
			{
				int num = test.nextInt();
				
				maze[r][c] = num;
				oMaze[r][c] = num;
			}
		}
		test.close();
	}

	public boolean hasExitPath(int r, int c)
	{
		if (bound(r, c))
		{
			if(maze[r][c] == 1)
			{
				maze[r][c] = 2;
				
				if (c == maze.length - 1)
				{
					return true;
				}
				
				if (hasExitPath(r + 1, c))
				{
					return true;
				}
				
				if (hasExitPath(r - 1, c))
				{
					return true;
				}
				
				if (hasExitPath(r,c + 1))
				{
					return true;
				}
				
				if(hasExitPath(r, c - 1))
				{
					return true;
				}
			}
		}
		
		return false;
	}

	public String toString()
	{
		String output="";
		
		for (int r = 0; r < oMaze.length; r++)
		{
			for (int c = 0; c < oMaze.length; c++)
			{
				output = output + oMaze[r][c] + " ";
			}
			output = output +"\n";
		}

		String pathString = "";
		
		boolean path = hasExitPath(0, 0);
		
		if (path)
		{
			pathString = "exit path";
		}
		
		else
		{
			pathString = "exit not path";
		}
		
		output = output + pathString + "\n";
		
		return output;
	}
	
	public boolean bound(int r, int c)
	{
		if (r < 0)
		{
			return false;
		}
		
		if (r >= maze.length)
		{
			return false;
		}
		
		if (c < 0)
		{
			return false;
		}
		
		if (c >= maze.length)
		{
			return false;
		}
		
		else
			return true;
	}
}
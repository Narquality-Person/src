package Unit17;

import java.lang.*;

public class Aliens
{
	private Alien[][] aliens;
	private boolean[][] movingRight;
	
	private final int r = 4;
	private final int c = 4;
	
	public Aliens()
	{
		aliens = new Alien[r][c];
		movingRight = new boolean[r][c];
		
		for (int row = 0; row < r; row++)
		{
			int start = 0;
			
			if (row % 2 == 0)
			{
				start = 10;
			}
			
			else
			{
				start = 300;
			}
			
			for (int col = 0; col < c; col++)
			{
				aliens[row][col] = new Alien(start + row * 80, 50 + col * 80, (int) (Math.random() * 2) + 2);
				movingRight[row][col] = true;
			}
		}
	}
	
	public void kill(int r, int c) {
		aliens[r][c] = null;
	}
	
	public Alien get(int r, int c)
	{
		return aliens[r][c];
	}
	
	public boolean getMovingRight(int r, int c)
	{
		return movingRight[r][c];
	}
	
	public void reverseMovingRight(int r, int c)
	{
		movingRight[r][c] = !movingRight[r][c];
	}
	
	public int getRows()
	{
		return r;
	}
	
	public int getCols()
	{
		return c;
	}
}

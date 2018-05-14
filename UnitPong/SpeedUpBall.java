package UnitPong;

import java.awt.Color;

public class SpeedUpBall extends Ball{
	//SpeedUpBall Constructors
	
	public SpeedUpBall()
	{
		super();
	}
	
	public SpeedUpBall(int xPos, int yPos)
	{
		super(xPos, yPos);
	}

	public SpeedUpBall(int xPos, int yPos, int width, int height)
	{
		super(xPos, yPos, width, height);
	}
	
	public SpeedUpBall(int xPos, int yPos, int width, int height, int xPosSpeed, int yPosSpeed)
	{
		super(xPos, yPos, width, height, xPosSpeed, yPosSpeed);
	}
	
	public SpeedUpBall (int xPos, int yPos, int width, int height, Color col, int xPosSpeed, int yPosSpeed)
	{
		super(xPos, yPos, width, height, col, xPosSpeed, yPosSpeed);
	}
	
	public void setXSpeed(int xPosSpd)
	{
		int add = 1;
		
		if (xPosSpd < 0)
		{
			add = -1;
		}
		
		super.setXSpeed(xPosSpd + add);
	}
	
	public void setYSpeed(int yPosSpd)
	{
		int add = 1;
		
		if (yPosSpd < 0)
		{
			add = -1;
		}
		
		super.setYSpeed(yPosSpd + add);
	}
}

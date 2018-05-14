package UnitPong;

import java.awt.Color;
import java.awt.Graphics;

public class BlinkyBall extends Ball{
	//BlinkyPosBall Constructors
	
	public BlinkyBall()
	{
		super();
	}
	
	public BlinkyBall(int xPos, int yPos)
	{
		super(xPos, yPos);
	}

	public BlinkyBall(int xPos, int yPos, int width, int height)
	{
		super(xPos, yPos, width, height);
	}

	public BlinkyBall(int xPos, int yPos, int width, int height, int xPosSpd, int yPosSpd)
	{
		super(xPos, yPos, width, height, xPosSpd, yPosSpd);
	}

	public BlinkyBall(int xPos, int yPos, int width, int height, Color col, int xPosSpd, int yPosSpd)
	{
		super(xPos, yPos, width, height, col, xPosSpd, yPosSpd);
	}

	// Random Color Picker Method
	
	public Color randomColor()
	{
		int red = (int) (256 * Math.random());
		int green = (int) (256 * Math.random());
		int blue = (int) (256 * Math.random());
		
		return new Color(red, green, blue);
	}

	public void moveAndDraw(Graphics window)
	{
		setColor(randomColor());
		super.moveAndDraw(window);
	}
}

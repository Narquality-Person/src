package UnitPong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		this(x, y, 10, 10);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		this(x, y, w, h, 3, 1);
	}

	public Ball(int x, int y, int w, int h, int xSpd, int ySpd)
	{
		this(x, y, w, h, Color.BLACK, xSpd, ySpd);
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		this(x, y, w, h, c, 3, 1);
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd)
	{
		super(x, y, w, h, c);
		
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	//collideable
	
	//x and y in range
	
	private boolean inXRange(Block newBlock)
	{
		return getX() >= newBlock.getX() && getX() + this.getWidth() <= newBlock.getX() + newBlock.getWidth();
	}
	
	private boolean inYRange(Block newBlock)
	{
		return getY() >= newBlock.getX() && getX() + this.getWidth() <= newBlock.getX() + newBlock.getWidth();
	}
	
	public boolean collideLeft(Object object)
	{
		Block newBlock = (Block) object;
		
		if (newBlock == null)
		{
			return false;
		}
		
		return inYRange(newBlock) && newBlock.getX() < getX() + getWidth() && newBlock.getX() + newBlock.getWidth() <= getX();
	}
	
	public boolean collideRight(Object object)
	{
		Block newBlock = (Block) object;
		
		if (newBlock == null)
		{
			return false;
		}
		
		return inYRange(newBlock) && getX() < newBlock.getX() + newBlock.getWidth() && getX() + getWidth() >= newBlock.getX();
	}
	
	public boolean collideTop(Object object)
	{
		Block newBlock = (Block) object;
		
		if (newBlock == null)
		{
			return false;
		}
		
		return inXRange(newBlock) && newBlock.getY() < getY() + getHeight() && newBlock.getY() + newBlock.getHeight() >= getY();
	}
	
	public boolean collideDown(Object object)
	{
		Block newBlock = (Block) object;
		
		if (newBlock == null)
		{
			return false;
		}
		
		return inXRange(newBlock) && newBlock.getY() < getY() + getHeight() && newBlock.getY() + newBlock.getHeight() >= getY();
	}
	   
   //add the set methods
	
	public void setXSpeed(int xSpd)
	{
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd)
	{
		ySpeed = ySpd;
	}
	
	public void moveAndDraw(Graphics window)
	{
		//draw a white ball at old ball location
		
		draw(window, Color.WHITE);
		
		//setX
		
		setX(getX() + xSpeed);
		
		//setY
		
		setY(getY() + ySpeed);
		
		//draw the ball at its new location
		
		draw(window);
	}
	
	public boolean equals(Object obj)
	{
		Ball newBall = (Ball) obj;
		
		if (newBall != null)
		{
			if (super.equals(obj))
			{
				return newBall.getXSpeed() == this.getXSpeed() && newBall.getYSpeed() == this.getYSpeed();
			}
		}
		
		return false;
	}
	
	//add the get methods
	
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	//add a toString() method
	
	public String toString()
	{
		return super.toString() + "\nxSpeed: " + xSpeed + "\nySpeed: " + ySpeed + "\n";
	}
}
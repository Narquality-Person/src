package UnitPong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		this(100,150);
	}

	public Block(int x, int y)
	{
		this(x, y, 10, 10);
	}
	
	public Block(int x, int y, int w, int h)
	{
		this(x, y, w, h, Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		
		setColor(c);
	}
	
	//add other Block constructors - x , y , width, height, color
	
	public void setX(int x)
	{
		this.xPos = x;
	}
	
	public void setY(int y)
	{
		this.yPos = y;
	}
	
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public void setWidth(int w)
	{
		this.width = w;
	}
	
	public void setHeight(int h)
	{
		this.height = h;
	}

   //add the other set methods
	
	public void setColor(Color col)
	{
		this.color = col;
	}
	
	public void draw(Graphics window)
	{
		//uncomment after you write the set and get methods
		
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
    }
	
	public void delete(Graphics window)
	{
		draw(window, Color.WHITE);
	}
	
	public void draw(Graphics window, Color col)
	{
		draw(window, Color.BLACK);
	}
	
	public boolean equals(Object obj)
	{
		Block newBlock = (Block) obj;
		
		if (newBlock != null)
		{
			return newBlock.getX() == this.getX() && newBlock.getY() == this.getY() && newBlock.getWidth() == this.getWidth() && newBlock.getHeight() == this.getHeight() && newBlock.getColor().equals(getColor());
		}
		
		return false;
	}
	
	//add the other get methods
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}

	public Color getColor()
	{
		return color;
	}
	
   //add a toString() method  - x , y , width, height, color
	
	public String toString()
	{
		return "x coord: " + xPos + "\ny coord: " + yPos + "\nwidth: " + width + "\ncolor: " + color;
	}
}

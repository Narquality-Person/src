package Unit17;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,2);
	}

	public Alien(int x, int y)
	{
		this(x,y,2);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Image/ file not found.");
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),80,80,null);
		
		//collide detection stuff moved to outerSpace
		
		move("RIGHT");
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
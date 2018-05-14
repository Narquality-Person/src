package UnitTwo;

import java.util.Scanner;

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		Scanner keyboard = new Scanner(System.in);
		
		length=len;
		width=wid;
		
		/*
		//user inputted length and width values
		System.out.println("Set the length of the rectangle.");
		length = keyboard.nextInt();
		System.out.println("Set the width of the rectangle.");
		width = keyboard.nextInt(); */
	}

	public void calculatePerimeter()
	{
		perimeter = 2 * length + 2 * width;
	}

	public void print( )
	{
		System.out.println("The perimeter of your rectangle is " + perimeter + ".");
	}
}

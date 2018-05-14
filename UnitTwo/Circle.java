package UnitTwo;

import java.lang.Math;

public class Circle
{
	private double radius;
	private double radii;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
		radii = rad;
	}

	public void calculateArea()
	{
		radius = Math.pow(radius, 2);
		area = Math.PI * radius;
	}

	public void print( )
	{
		System.out.println("The area of the circle with radius " + radii + " is " + area);
		
	}
}
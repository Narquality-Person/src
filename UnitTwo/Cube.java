package UnitTwo;

public class Cube
{
	private int side;
	private int surfaceArea;

	public void setSide(int s)
	{
		side = s;
	}

	public void calculateSurfaceArea( )
	{
		surfaceArea = 6 * side * side;
	}

	public void print( )
	{
		System.out.println("The surface area of the cube with a side length of " + side + " is " + surfaceArea);
	}
}

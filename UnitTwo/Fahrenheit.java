package UnitTwo;

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		fahrenheit = fahrenheit - 32;
		celsius = (fahrenheit * 5) / 9;
		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(getCelsius() + "° C");
	}
}

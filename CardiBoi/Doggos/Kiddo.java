package Doggos;

import java.util.Arrays;

public class Kiddo {
	private String kiddosName;
	private Dog kiddosDog;
	
	public Kiddo()
	{
		setkName("");
		setDog("");
	}
	
	public Kiddo(String name, String dogNames)
	{
		setkName(name);
		setDog(dogNames);
	}
	
	public void setkName(String name)
	{
		kiddosName = name;
	}
	
	public void setDog(String dogNames)
	{
		kiddosDog = new Dog(dogNames);
	}
	
	public String getName()
	{
		return kiddosName;
	}
	
	public String toString()
	{
		return "" + kiddosName + kiddosDog;
	}
}

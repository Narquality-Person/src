package Doggos;

import java.util.Arrays;
import java.util.Scanner;

public class Dog {
	private String[] dog;
	
	public Dog()
	{
		setDog("");
	}
	
	public Dog(String dogNames)
	{
		setDog(dogNames);
	}
	
	public void setDog(String dogNames)
	{
		Scanner test = new Scanner(dogNames);
		dog = new String[test.nextInt()];
		test.skip(" ");
		test.skip("-");
		for (int i = 0; i < dog.length; i++)
		{
			test.skip(" ");
			dog[i] = test.next();
		}
	}
	
	public int getNumDogs()
	{
		return dog.length;
	}
	
	public String toString()
	{
		String output = "\nNumber of Dogs: " + getNumDogs() + "\nDog Names: " + Arrays.toString(dog);
		
		return output;
	}
}

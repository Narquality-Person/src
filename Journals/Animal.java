package Journals;

import java.util.Scanner;

public class Animal
{
	double animalWeight = 0.0;
	double animalHeight = 0.0;
	double BMI = 0.0;
	String animalName = "Default";
	
	public Animal()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What would you like to name the animal?");
		animalName = keyboard.next();
		System.out.println("How much does " + animalName + "weigh?");
		animalWeight = keyboard.nextDouble();
		System.out.println("How tall is " + animalName + "?");
		animalHeight = keyboard.nextDouble();
		BMI = animalWeight/animalHeight;
		System.out.println("Name: " + animalName + "\n Animal Weight: " + animalWeight + "\n Animal Height: " + animalHeight + "BMI: " + BMI );
	}
}

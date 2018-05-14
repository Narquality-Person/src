package UnitFive;

import java.util.Scanner;
import java.util.Random;

public class LicensePlate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many plates would you like to generate?");
		int num = keyboard.nextInt();
		System.out.println("");
		
		System.out.println("Generating" + num + "license plates...");
		for (int i = 0; i < num; i++)
		{
			System.out.println(generatePlate());
		}
		
	}
	
	public static String generatePlate()
	{
		String plate = "";
		
		Random rand = new Random();
		
		for (int i = 0; i < 3; i++)
		{
			char c = (char) (rand.nextInt(10) + 48);
			plate += c;
		}
		
		for (int i = 0; i < 4; i++)
		{
			char c = (char) (rand.nextInt(26) + 65);
			plate += c;
		}
		
		return plate;
	}

}

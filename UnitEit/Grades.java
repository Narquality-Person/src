package UnitEit;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	Scanner keyboard = new Scanner(System.in);
	
	//instance variables
	int arrayLength = 0;
	double[] array = new double[arrayLength];
	
	public Grades()
	{
		setGrades(arrayLength);
	}
	
	//set method
	public void setGrades(int arLen)
	{
		arrayLength = arLen;
	}
	
	public void getGrade()
	{
		//System.out.println("Enter an array length: ");
		//arrayLength = keyboard.nextInt();
		array = new double[arrayLength];
		for (int i = 0; i<array.length; i++)
		{
			System.out.println("Grade [" + i + "] :: ");
			array[i]=keyboard.nextDouble();
		}
	}
	
	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double sumA;
		sumA = getSum();
		double average=0.0;
		average = sumA / arrayLength;
		return average;
	}
	
	//toString method
	
}
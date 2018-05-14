package UnitEleven;

public class Grade
{
	private double value;
	
	public static void printGrade(int grade)
	{
		if (grade >= 90 && grade <= 100)
		{
			System.out.println("A");
		}
		else if (grade >= 80)
		{
			System.out.println("B");
		}
		else if (grade >= 70)
		{
			System.out.println("C");
		}
		else if (grade >= 60)
		{
			System.out.println("D");
		}
		else
			System.out.println("F");
			
	}
//add in two constructors
//add in set and get methods
//String getLetterGrade()
//double getNumericGrade()
//toString method
}
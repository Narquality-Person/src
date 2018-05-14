package UnitEit;

public class Lab14d
{
	public static void main( String args[] )
	{
		Grades grad = new Grades();
		
		grad.setGrades(5);
		grad.getGrade();
		double d = grad.getAverage();
		System.out.println(d);
	}
}
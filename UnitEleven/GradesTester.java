package UnitEleven;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradesTester
{
   public static void main( String args[] )
   {
		Grades test = new Grades("5 - 90 85 95.5 77.5 88");
		System.out.println(test);
		System.out.println("sum = " + test.getSum());	
		System.out.println("num grades = " + test.getNumGrades());											
		System.out.println("low grade = " + test.getLowGrade());		
		System.out.println("high grade = " + test.getHighGrade());
	}		
}
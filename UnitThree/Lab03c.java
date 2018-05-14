package UnitThree;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		/*Scanner keyboard = new Scanner(in);

		out.print("Enter the a value :: ");
		int a = keyboard.nextInt();

		out.print("Enter the b value :: ");
		int b = keyboard.nextInt();

		out.print("Enter the c value :: ");
		int c = keyboard.nextInt();*/

		Quadratic test = new Quadratic();
		test.setEquation(5, -8, 3);
		test.calcRoots();
		test.print();
		
		test.setEquation(3, 2, -7);
		test.calcRoots();
		test.print();
		
		test.setEquation(9, 6, 1);
		test.calcRoots();
		test.print();
	}
}

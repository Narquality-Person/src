package UnitTwo;

public class Lab02a
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		
		//perimeter = 16
		test.setLengthWidth(2,6);
		test.calculatePerimeter();
		test.print();
		
		//perimeter = 34
		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();
		
		//perimeter = 412
		test.setLengthWidth(131,75);
		test.calculatePerimeter( );
		test.print();
		
		//perimeter = 90
		test.setLengthWidth(20,25);
		test.calculatePerimeter( );
		test.print();
		
		//perimeter = 530
		test.setLengthWidth(9,256);
		test.calculatePerimeter( );
		test.print();
		
		//perimeter = 216
		test.setLengthWidth(36,72);
		test.calculatePerimeter( );
		test.print();
	}
}

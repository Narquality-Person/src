package UnitTwo;

public class Lab02b
{
	public static void main( String[] args )
	{
		Sum test = new Sum();
		test.setNums(5,5);
		test.sum();
		test.print();

		test.setNums(90,100.0);
		test.sum();
		test.print();
		
		test.setNums(100.5,85.8);
		test.sum();
		test.print();
		
		test.setNums(-100, 55);
		test.sum();
		test.print();
		
		test.setNums(15326, 5642);
		test.sum();
		test.print();
		
		test.setNums(1000, 555);
		test.sum();
		test.print();
		
	}
}
package UnitTwo;

public class Lab02f {
	
	public static void main(String[] args) {
		Line tester = new Line(1, 9, 14, 2);
		
		tester.setCoordinates(1, 9, 14, 2);
		tester.calculateSlope();
		tester.print();
		
		tester.setCoordinates(1, 7, 18, 3);
		tester.calculateSlope();
		tester.print();
		
		tester.setCoordinates(6, 4, 2, 2);
		tester.calculateSlope();
		tester.print();
		
		tester.setCoordinates(4, 4, 5, 3);
		tester.calculateSlope();
		tester.print();
		
		tester.setCoordinates(1, 1, 2, 9);
		tester.calculateSlope();
		tester.print();
	}
	
}
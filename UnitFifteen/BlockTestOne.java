package UnitFifteen;

import java.awt.Color;

import UnitFifteen.Block;

class BlockTestOne
{
	public static void main( String args[] )
	{
		Block one = new Block();
		System.out.println(one);

		Block two = new Block(50,50,30,30);
		System.out.println(two);

		Block three = new Block(350,350,15,15,Color.RED);
		System.out.println(three);

		Block four = new Block(450,50,20,60, Color.GREEN);
		System.out.println(four);
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(one));		
	}
}

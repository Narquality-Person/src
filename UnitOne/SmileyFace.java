package UnitOne;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
	public SmileyFace()    //constructor - sets up the class
	   {
	      setSize(800,600);
	      setBackground(Color.WHITE);
	      setVisible(true);
	   }

	   public void paint( Graphics window )
	   {
	      smileyFace(window);
	   }

	   public void smileyFace( Graphics window )
	   {
	      window.setColor(Color.BLUE);
	      window.drawString("SMILEY FACE LAB ", 35, 35);

	      window.setColor(Color.YELLOW);
	      window.fillOval( 210, 100, 400, 400 );
	      
	      //eyeBalls
	      window.setColor(Color.BLACK);
	      window.fillOval(300, 200, 75, 75);
	      window.fillOval(460, 200, 75, 75);
	      
	      //smile
	      window.drawArc(320, 300, 180, 90, 0, -180);
	   }
}

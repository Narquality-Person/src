package UnitOne;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SpecialRectangle extends Canvas
{
   public SpecialRectangle()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      Rect(window);
   }
   
   public void Rect( Graphics window )
   {
	  int length1 = 6;
	  int width1 = 7;
	  int length2 = 13;
	  int width2 = 8;
	  
	  int perimeter, area = 42;
	  
	  //title
	  window.setColor(Color.BLUE);
      window.drawString( "42 = 13 + 13 + 8 + 8", 200, 100 );

      //peri42 rectangle
      window.setColor(Color.BLUE);
      window.fillRect(200, 400, length2, width2);
      
   }
}

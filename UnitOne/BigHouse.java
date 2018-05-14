package UnitOne;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }
   
   public void bigHouse( Graphics window )
   {
	  
	  //title
	  window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 475, 50 );

      //house base
      window.setColor(Color.BLUE);
      window.fillRect(200, 400, 600, 600);
      
      //house roof
      window.setColor(Color.GREEN);
      window.fillRect(0, 200, 1000, 200);
      
      //windows
      window.setColor(Color.YELLOW);
      window.fillRect(300, 500, 150, 150);
      window.fillRect(550, 500, 150, 150);
      
      //door
      window.setColor(Color.WHITE);
      window.fillRect(425, 700, 150, 300);
      
      //extra credit
      
      //trees
      window.setColor(Color.DARK_GRAY);
      window.fillRect(40, 825, 25, 200);
      window.fillRect(140, 825, 25, 200);
      window.setColor(Color.GREEN);
      window.fillOval(0, 750, 100, 100);
      window.fillOval(100, 750, 100, 100);
      
      //seesaw
      
      //base
      window.setColor(Color.BLUE);
      window.fillRect(925, 850, 600, 50);
      window.fillRect(1200, 850, 50, 150);
      
      //seats
      window.setColor(Color.RED);
      window.fillOval(875, 835, 125, 75);
      window.fillOval(1500, 835, 125, 75);
      
      //handles
      window.setColor(Color.BLACK);
      window.drawArc(1000, 840, 40, 20, 0, 180);
      window.drawArc(1460, 840, 40, 20, 0, 180);
   }
}

package UnitOne;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      face(window);
      
      //call other methods
      twoBody(window);
      armLegs(window);
   }

   public void face( Graphics window )
   {
      //head
	   window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);
      
      //facial features
      
      //eyes
      window.setColor(Color.BLACK);
      window.fillOval(340, 125, 35, 15);
      window.fillOval(435, 125, 35, 15);
      
      //nose
      window.fillOval(375, 145, 50, 25);
      
      //mouth
      window.drawArc(355, 135, 100, 50, 0, -180);
   }

   public void twoBody( Graphics window )
   {
	   //top
	   window.setColor(Color.BLUE);
	   window.fillRect(335, 210, 125, 100);
	   
	   //bottom
	   window.setColor(Color.GRAY);
	   window.fillRect(335, 320, 125, 100);
   }

   public void armLegs( Graphics window )
   {
	   //arms
	   window.drawLine(275, 150, 335, 225);
	   window.drawLine(460, 225, 520, 150);
	   
	   //legs
	   window.drawLine(275, 525, 335, 415);
	   window.drawLine(460, 415, 520, 525);
   }
}
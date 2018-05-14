package UnitPong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

import UnitFifteen.Paddle;
import UnitFifteen.Wall;

import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	private Wall top, bottom, left, right;
	
	private final int boardWidth = 600;
	private final int boardHeight = 450;
	
	public Pong()
	{
		//set up all variables related to the game
		
		ball = new Ball();
		
		leftPaddle = new Paddle(20, 150, 20, 70, Color.RED, 5);
		
		rightPaddle = new Paddle(530, 150, 20, 70, Color.GREEN, 5);
		
		top = new Wall(10, 0, boardWidth, true);
		bottom = new Wall(10, boardHeight + 10, boardWidth, true);
		
		left = new Wall(0, 10, boardHeight, false);
		right = new Wall(10 + boardWidth, 10, boardHeight, false);
		
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		
		if(back==null)
		{
			back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if (ball.collideLeft(left) || ball.collideRight(right))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the top or bottom wall 
		
		if (ball.collideDown(top) || ball.collideTop(bottom))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits the left paddle
		
		else if (ball.collideLeft(leftPaddle) || ball.collideRight(leftPaddle) || ball.collideLeft(rightPaddle) || ball.collideRight(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the right paddle
		
		else if (ball.collideTop(leftPaddle) || ball.collideDown(leftPaddle) || ball.collideTop(rightPaddle) || ball.collideDown(rightPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the paddles need to be moved
		
		if (keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(window);
		}
		
		if (keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(window);
		}
			
		if (keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		
		if (keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void run()
	{
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}
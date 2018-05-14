package Unit17;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	
	private Alien alienOne;
	private Alien alienTwo;
	
	private ArrayList<Alien> aliens;
	
	private ArrayList<Ammo> pewSHIP;
	private ArrayList<Ammo> pewALIEN;

	private boolean[] keys;
	private BufferedImage back;
	
	private int score;
	private boolean lose;
	
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(200, 200, 1);
		
		alienOne = new Alien(20,  0, 5);
		alienTwo = new Alien(680, 0, 5);
		
		pewSHIP = new ArrayList<Ammo>();
		pewALIEN = new ArrayList<Ammo>();
		
		score = 0;
		lose = false;
		
		aliens = new ArrayList<Alien>();
		
		Aliens alien = new Aliens();
		
		for(int i = 0; i < alien.getList().length; i++)
		{
			for(int j = 0; j < alien.getList()[0].length; j++)
			{
				aliens.add(alien.getList()[i][j]);
			}
		}
		
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

 public void update(Graphics window)
 {
	   paint(window);
 }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		graphToBack.setColor(Color.GREEN);
		graphToBack.drawString("Score: " + score, 500, 500);
		ship.draw(graphToBack);

		for (int i = 0; i < aliens.size(); i++)
		{
			aliens.get(i).draw(graphToBack);
		}
		
		alienOne.draw(graphToBack);
		alienTwo.draw(graphToBack);
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move stuff
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true)
		{
			shot = true;
		}
		//add in collision detection(ALIEN)
		for (int a = 0; a < pewALIEN.size(); a++)
		{
			pewALIEN.get(a).draw(graphToBack);
			if((ship.getX() - 80 >= pewALIEN.get(a).getX() && ship.getX() <= pewALIEN.get(a).getX())
					&& (ship.getY() - 80 >= pewALIEN.get(a).getY() && ship.getY() <= pewALIEN.get(a).getY()))
			{
				if (pewALIEN.get(a).getSpeed() == 6)
				{
					ship.setPos(1200, 1200);
					
					graphToBack.setColor(Color.BLACK);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					score -= 24;
					
					graphToBack.setColor(Color.GREEN);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					pewALIEN.get(a).setPos(5000,0);
				}
			}
		}
		
		for (int b = 0; b < pewALIEN.size(); b++)
		{
			pewALIEN.get(b).draw(graphToBack);
			if((ship.getX() - 80 >= pewALIEN.get(b).getX() && ship.getX() <= pewALIEN.get(b).getX()) &&
					(ship.getY() - 80 >= pewALIEN.get(b).getY() && ship.getY() <= pewALIEN.get(b).getY()))
			{
				if(pewALIEN.get(b).getSpeed() == 6)
				{
					ship.setPos(1200, 1200);
					
					graphToBack.setColor(Color.BLACK);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					score -= 24;
					
					graphToBack.setColor(Color.GREEN);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					pewALIEN.get(b).setPos(5000,0);
				}
			}
		}
		
		//add in collision detection (SHIP)
		for(int i = 0; i < pewSHIP.size(); i++)
		{
			pewSHIP.get(i).draw(graphToBack);
			if((alienOne.getX() + 80 >= pewSHIP.get(i).getX() && alienOne.getX() <= pewSHIP.get(i).getX()) &&
					(alienOne.getY() + 80 >= pewSHIP.get(i).getY() && alienOne.getY() <= pewSHIP.get(i).getY()))
			{
				if(pewSHIP.get(i).getSpeed() == 6)
				{
					alienOne.setPos(1200, 1200);
					
					graphToBack.setColor(Color.BLACK);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					score += 24;
					
					graphToBack.setColor(Color.GREEN);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					pewSHIP.get(i).setPos(5000,0);
				}
			}
			
			if((alienTwo.getX() + 80 >= pewSHIP.get(i).getX() && alienTwo.getX() <= pewSHIP.get(i).getX()) &&
					(alienTwo.getY() + 80 >= pewSHIP.get(i).getY() && alienTwo.getY() <= pewSHIP.get(i).getY()))
			{
				if(pewSHIP.get(i).getSpeed() == 6)
				{
					alienTwo.setPos(1200, 1200);
					
					graphToBack.setColor(Color.BLACK);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					score += 24;
					
					graphToBack.setColor(Color.GREEN);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					pewSHIP.get(i).setPos(5000,0);
				}
			}
			
			for(int j = 0; j <aliens.size(); j++)
			{
				if((aliens.get(j).getX() + 80 >= pewSHIP.get(j).getX() && aliens.get(j).getX() <= pewSHIP.get(j).getX()) &&
						(aliens.get(j).getY() + 80 >= pewSHIP.get(j).getY() && aliens.get(j).getY() <= pewSHIP.get(j).getY()))
				{
					aliens.get(j).setPos(1200, 1200);
					aliens.remove(aliens.get(j));
					
					graphToBack.setColor(Color.BLACK);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					score += 12;
					
					graphToBack.setColor(Color.GREEN);
					graphToBack.drawString("Score: " + score, 500, 500);
					
					pewSHIP.get(i).setPos(5000,0);
				}
			}
		}
		
		//out of bounds
		if(ship.getX() > 750 || ship.getX() < -50 || ship.getY() > 500 || ship.getY() < -50)
		{
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("You are lost in outer space! Return to the battle zone immediately!", 200, 550);;
		}
		
		if(ship.getX() < 750 && ship.getY() < 500 && ship.getX() > -50 && ship.getY() > -50)
		{
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("You are lost in outer space! Return to the battle zone immediately!", 200, 550);;
		}
		
		if(alienOne.getX() < 10 || alienOne.getX() > 700)
		{
			alienOne.setSpeed((alienOne.getSpeed()) * -1);
		}
		if(alienTwo.getX() < 10 || alienTwo.getX() > 700)
		{
			alienTwo.setSpeed((alienTwo.getSpeed()) * -1);
		}
		
		//collision detection
		for(int i = 0; i < aliens.size(); i++)
		{
			if(aliens.get(i).getX() < 10 || aliens.get(i).getX() > 700)
			{
				aliens.get(i).setSpeed((aliens.get(i).getSpeed()) * -1);
			}
		}
		
		if(alienOne.getX() < 10 || alienOne.getX() > 700)
		{
			alienOne.setSpeed((alienOne.getSpeed()) * -1);
		}
		
		if(alienTwo.getX() < 10|| alienTwo.getX() > 700)
		{
			alienTwo.setSpeed((alienTwo.getSpeed()) * -1);
		}
		
		for(int k = 0; k < aliens.size(); k++)
		{
				if((aliens.get(k).getX() + 80 >= ship.getX() && aliens.get(k).getX() <= ship.getX()) &&
						(aliens.get(k).getY() + 80 >= ship.getY() && aliens.get(k).getY() <= ship.getY()))
				{
					for(int l = 0; l < aliens.size(); l++)
					{
						lose = true;
					}
					
				}
		}
		
		if(!lose && aliens.size() == 0)
		{
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("YOU WON :) Score: "+ score, 250, 250);
		}
		
		if(lose)
		{
			for(int i = 0; i < aliens.size(); i++)
			{
				aliens.remove(i);
			}	
			
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("YOU LOST :(", 250, 250);
			ship.setPos(8000, 8000);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{}

 public void run()
 {
 	try
 	{
 		while(true)
 		{
 		   Thread.currentThread().sleep(5);
          repaint();
       }
    }catch(Exception e)
    {}
 }
}

package BopIt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

public class Game extends JFrame implements ActionListener
{
	JPanel panel = new JPanel();
	
	ImageIcon bopToy = new ImageIcon("C:\\Users\\Jessica Xiang\\Downloads\\AP CSA\\AP CSA\\bop.jpg");
	
	public static final int WIDTH = 800, HEIGHT = 600;
	
	public int score, ticks;
	
	boolean gameOver;
	
	int random;
	
	ArrayList<String> command = new ArrayList<String>();
	
	String gameCommand = "";
	String checker = "";
	
	//Bop It Buttons: Bop It, Twist It, Pull It
	//JButton startButton = new JButton("Start");
	String bOne = "Twist It!";
	String bTwo = "Bop It!";
	String bThree = "Pull It!";
		
	JButton buttonONE = new JButton(bOne);
	JButton buttonTWO = new JButton(bTwo);
	JButton buttonTHREE = new JButton(bThree);
	
	
	public Game()
	{
		//Timer timer = new Timer(20, this);
		
		setSize(800, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		command.add("Twist It!");
		command.add("Bop It!");
		command.add("Pull It!");
		command.add("Game Over!");
		
		buttonONE.addActionListener(this);
		buttonTWO.addActionListener(this);
		buttonTHREE.addActionListener(this);
	}
	
	public String userCommand()
	{
		random = (int)(Math.random()*2);
		
		if(random == 0)
		{
			gameCommand = command.get(0);
		}
		
		else if(random == 1)
		{
			gameCommand = command.get(1);
		}
			
		else if(random == 2)
		{
			gameCommand = command.get(2);
		}
			
		else
		{
			gameCommand = command.get(3);
		}
		
		return gameCommand;
	}
	
	/*public static void main (String[] args)
	{
		Game game = new Game();
		game.actionPerformed(arg0);
		
	}*/

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		checker = gameCommand;
		
		while(score >= 0 && score <= 5 && gameCommand != command.get(3))
		{
			userCommand();
			if(checker.equals(bOne))
			{
				if(arg0.getSource() == buttonONE)
				{
					score += 1;
				}
				else
				{
					gameCommand = command.get(3);
				}
			}
			
			else if(checker.equals(bTwo))
			{
				if(arg0.getSource() == buttonTWO)
				{
					score += 1;
				}
				else
				{
					gameCommand = command.get(3);
				}
			}
			
			else if(checker.equals(bThree))
			{
				if(arg0.getSource() == buttonTHREE)
				{
					score += 1;
				}
				else
				{
					gameCommand = command.get(3);
				}
			}
		}
	}
}

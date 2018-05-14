package BopIt;

import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class BxLayout extends JFrame
{
	JPanel panel = new JPanel();
	
	ImageIcon bopLogo = new ImageIcon("C:\\\\Users\\\\Jessica Xiang\\\\Downloads\\\\AP CSA\\\\AP CSA\\\\maxresdefault.jpg");
	ImageIcon bopToy = new ImageIcon("C:\\Users\\Jessica Xiang\\Downloads\\AP CSA\\AP CSA\\BopIt.jpg");
	
	int score = 0;
	
	int action;
	
	String command = "The game will begin in 10 seconds; you will get 10 seconds to bop/twist/pull it";
	
	//Bop It Logo
	//JLabel bITLogo = new JLabel(bopLogo);
	//bITLogo.setHorizontalAlignment(bITLogo.CENTER);
	
	//Score Counter
	JLabel bITScore = new JLabel("Score: " + score);
	
	//Bop It Toy
	JLabel bITToy = new JLabel(bopToy);
	
	//Command/ Action
	JLabel bITCommand = new JLabel(command);
	static Timer commandTimer = new Timer();
	TimerTask commandTask = new TimerTask()
	{
		public void run()
		{
			secondsPassed++;
			bopTwistPull();
		}
	};
	
	int secondsPassed = 0;
	long startTime = 0;
	
	//Bop It Buttons: Bop It, Twist It, Pull It
	//JButton startButton = new JButton("Start");
	JButton buttonONE = new JButton("Twist It");
	JButton buttonTWO = new JButton("Bop It");
	JButton buttonTHREE = new JButton("Pull It");
	
	
	public BxLayout()
	{
		setTitle("BopIt!");
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		//panel.add(bITLogo);
		panel.add(bITScore);
		panel.add(bITToy);
		//add(panel);
		
		panel.add(bITCommand);
		panel.add(buttonONE);
		panel.add(buttonTWO);
		panel.add(buttonTHREE);
		add(panel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	
	public void bopTwistPull()
	{
		action = (int)(Math.random()*2);
		
		if (action == 0)
		{
			command = "Bop It!";
			
			if(buttonTWO.isEnabled() == true && secondsPassed%10 == 0 && secondsPassed/10 > 0)
			{
				score += 1;
				bopTwistPull();
				add(panel);
			}
			else
			{
				command = "Game Over!";
				add(panel);
			}
		}
		
		else if (action == 1)
		{
			command = "Twist It!";
			
			if(buttonONE.isEnabled() == true && secondsPassed%10 == 0 && secondsPassed/10 > 0)
			{
				score += 1;
				bopTwistPull();
				add(panel);
			}
			else
			{
				command = "Game Over!";
				add(panel);
			}
		}
		
		else if (action == 2)
		{
			command = "Pull It!";
			
			if(buttonTHREE.isEnabled() == true && secondsPassed%10 == 0 && secondsPassed/10 > 0)
			{
				score += 1;
				bopTwistPull();
				add(panel);
			}
			else
			{
				command = "Game Over!";
				add(panel);
			}
		}
	}
	
	public static void main(String[] args)
	{
		commandTimer.start();
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new BxLayout();
				
			}
		});
	}
}

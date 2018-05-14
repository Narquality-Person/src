package BopIt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BopIt extends JFrame
{
	JPanel panel = new JPanel();
	
	//BopIt Toy
	JButton bITButton;
	JLabel bITLabel;
	private Image bIT;
	
	JLabel bITLogo;
	
	//Buttons
	//Start Game
	JButton startButton = new JButton("Click me to play now!");
	
	//BopIt button
	
	//TwistIt button
	
	//PullIt button
	
	//variables that randomize which thing to do: bop, twist, or turn
	int commandIt = 0;
	
	
	
	public BopIt()
	{
		//title that'll appear in JFrame Window
		setTitle("BopIt!");
		
		//set location
		setLocationRelativeTo(null);
		
		//key to "terminate" program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame Window is visible
		setVisible(true);
		
		//Image Presto
		JLabel bITLabel = new JLabel(new ImageIcon("C:\\Users\\Jessica Xiang\\Downloads\\AP CSA\\AP CSA\\BopIt.jpg"));
		add(bITLabel);
		
		//bIT Logo
		JLabel bITLogo = new JLabel(new ImageIcon("C:\\Users\\Jessica Xiang\\Downloads\\AP CSA\\AP CSA\\maxresdefault.jpg"));
	}
	
	public void ButtonSetup()
	{
		startButton.setVisible(true);
		startButton.setSize(100, 100);
		if(startButton.isEnabled() == true)
		{
			commandIt = (int) (Math.random() * (2-1));
			
		}
	}
	
	
	
	public static void main(String[] args)
	{
		new BopIt();
		//BopIt.BoxLayout();
	}
}
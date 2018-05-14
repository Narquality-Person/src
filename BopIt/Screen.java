package BopIt;

import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame
{
	JPanel panel = new JPanel();
	JLabel bITLogo = new JLabel("C:\\Users\\Jessica Xiang\\Downloads\\AP CSA\\AP CSA\\maxresdefault.jpg");
	JButton buttonONe = new JButton("First");
	
	public Screen()
	{
		panel.setLayout(new Screen());
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new Screen();
			}
		});
	}
}

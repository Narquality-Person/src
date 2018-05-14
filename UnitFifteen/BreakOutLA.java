package UnitFifteen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import UnitFifteen.Ball;
import UnitFifteen.Block;
import UnitFifteen.Paddle;
import UnitFifteen.Wall;

import java.awt.event.KeyEvent;
import static java.lang.Character.*;

public class BreakOutLA extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys; // keeps track of what keys are pressed
	
	private List<Block> breakoutBlocks;
	
	private Wall top, bottom, left, right;
	
	private final int boardWidth = 600;
	private final int boardHeight = 450;

	public BreakOutLA()
	{
		// set up all game variables

		// instantiate a Ball
		ball = new Ball(boardWidth / 2, 400);
		ball.setXSpeed(1);
		ball.setYSpeed(2);

		// instantiate a Paddle
		paddle = new Paddle(boardWidth / 2, boardHeight - 20, 70, 20, Color.RED, 5);
		
		top = new Wall(10, 0, boardWidth, true);
		bottom = new Wall(10, boardHeight + 10, boardWidth, true);
		
		left = new Wall(0, 10, boardHeight, false);
		right = new Wall(10 + boardWidth, 10, boardHeight, false);

		keys = new boolean[2];
		
		breakoutBlocks = new ArrayList<Block>();
		
		int numHorz = 9;
		int numVert = 6;
		
		for (int i = 0; i < numHorz; i++)
		{
			for (int j = 0; j < numVert; j++)
			{
				breakoutBlocks.add(new Block((i + 1) * 56, (j + 1) * 48, 40, (boardHeight / 2) / numVert));
			}
		}

		// set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}
	
	public void paint(Graphics window)
	{
		for (Block b : breakoutBlocks)
		{
			b.draw(window);
		}
		
		window.drawString("Jessica Xiang 4/4/18, Laptop/ CA-SU-F106-13", 0, 0);
		
		int scoreCounter = 0;
		
		window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		
		ball.moveAndDraw(window);
		
		paddle.draw(window);
		
		top.draw(window);
		bottom.draw(window);
		
		left.draw(window);
		right.draw(window);
		
		//jank brick bois
		
		int blocks = 4;
		int row = 5;
		int x = 520;
		int y = 0;
		int width = 10;
		int height = 80;
		
		for(int i = 0; i < row; i++)
		{
			for (int j = 0; j < blocks; j++)
			{
				window.setColor(Color.BLACK);
				window.drawRect(x, y, width, height);
				x = x + 10;
			}
			y = y + 10;
		}
		
		//column one intersect
		
		if (ball.getX() >= 520 && ball.getX() <= 530 && ball.getY() >= 0 && ball.getY() <= 80)
		{
			window.setColor(Color.WHITE);
			window.drawRect(520, 0, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 520 && ball.getX() <= 530 && ball.getY() >= 90 && ball.getY() <= 170)
		{
			window.setColor(Color.WHITE);
			window.drawRect(520, 90, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 520 && ball.getX() <= 530 && ball.getY() >= 180 && ball.getY() <= 260)
		{
			window.setColor(Color.WHITE);
			window.drawRect(520, 180, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 520 && ball.getX() <= 530 && ball.getY() >= 270 && ball.getY() <= 350)
		{
			window.setColor(Color.WHITE);
			window.drawRect(520, 270, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 520 && ball.getX() <= 530 && ball.getY() >= 360 && ball.getY() <= 440)
		{
			window.setColor(Color.WHITE);
			window.drawRect(520, 360, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		//column two intersect
		
		if (ball.getX() >= 540 && ball.getX() <= 550 && ball.getY() >= 0 && ball.getY() <= 80)
		{
			window.setColor(Color.WHITE);
			window.drawRect(540, 0, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 540 && ball.getX() <= 550 && ball.getY() >= 90 && ball.getY() <= 170)
		{
			window.setColor(Color.WHITE);
			window.drawRect(540, 90, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 540 && ball.getX() <= 550 && ball.getY() >= 180 && ball.getY() <= 260)
		{
			window.setColor(Color.WHITE);
			window.drawRect(540, 180, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 540 && ball.getX() <= 550 && ball.getY() >= 270 && ball.getY() <= 350)
		{
			window.setColor(Color.WHITE);
			window.drawRect(540, 270, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 540 && ball.getX() <= 550 && ball.getY() >= 360 && ball.getY() <= 440)
		{
			window.setColor(Color.WHITE);
			window.drawRect(540, 360, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		//column three intersect
		
		if (ball.getX() >= 560 && ball.getX() <= 570 && ball.getY() >= 0 && ball.getY() <= 80)
		{
			window.setColor(Color.WHITE);
			window.drawRect(560, 0, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 560 && ball.getX() <= 570 && ball.getY() >= 90 && ball.getY() <= 170)
		{
			window.setColor(Color.WHITE);
			window.drawRect(560, 90, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 560 && ball.getX() <= 570 && ball.getY() >= 180 && ball.getY() <= 260)
		{
			window.setColor(Color.WHITE);
			window.drawRect(560, 180, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 560 && ball.getX() <= 570 && ball.getY() >= 270 && ball.getY() <= 350)
		{
			window.setColor(Color.WHITE);
			window.drawRect(560, 270, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 560 && ball.getX() <= 570 && ball.getY() >= 360 && ball.getY() <= 440)
		{
			window.setColor(Color.WHITE);
			window.drawRect(560, 360, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		//columnn four intersect
		
		if (ball.getX() >= 580 && ball.getX() <= 590 && ball.getY() >= 0 && ball.getY() <= 80)
		{
			window.setColor(Color.WHITE);
			window.drawRect(580, 0, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 580 && ball.getX() <= 590 && ball.getY() >= 90 && ball.getY() <= 170)
		{
			window.setColor(Color.WHITE);
			window.drawRect(580, 90, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 580 && ball.getX() <= 590 && ball.getY() >= 180 && ball.getY() <= 260)
		{
			window.setColor(Color.WHITE);
			window.drawRect(580, 180, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 580 && ball.getX() <= 590 && ball.getY() >= 270 && ball.getY() <= 350)
		{
			window.setColor(Color.WHITE);
			window.drawRect(580, 270, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		if (ball.getX() >= 580 && ball.getX() <= 590 && ball.getY() >= 360 && ball.getY() <= 440)
		{
			window.setColor(Color.WHITE);
			window.drawRect(580, 360, 10, 80);
			scoreCounter = scoreCounter + 1;
			window.drawString("Score: " + Integer.toString(scoreCounter), 300, 0);
		}
		
		for (Block b : breakoutBlocks)
		{
			boolean kill = false;
			
			if (ball.didCollideLeft(b) || ball.didCollideRight(b))
			{
				ball.setXSpeed(-ball.getXSpeed());
				kill = true;
			}
			if (ball.didCollideBottom(b) || ball.didCollideTop(b))
			{
				ball.setYSpeed(-ball.getYSpeed());
				kill = true;
			}
			
			if (kill)
			{
				b.delete(window);
				breakoutBlocks.remove(b);
			}
		}
		

		if (ball.didCollideLeft(left) || ball.didCollideRight(right))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		else if (ball.didCollideLeft(paddle) || ball.didCollideRight(paddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (ball.didCollideBottom(top) || ball.didCollideTop(bottom))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		else if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (keys[0] == true)
		{
			paddle.moveRightAndDraw(window);
		}
		if (keys[1] == true)
		{
			paddle.moveLeftAndDraw(window);
		}
	}

	public void keyPressed(KeyEvent e)
	{
		switch (toUpperCase(e.getKeyChar()))
		{
		case 'D':
			keys[0] = true;
			break;
		case 'A':
			keys[1] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch (toUpperCase(e.getKeyChar()))
		{
		case 'D':
			keys[0] = false;
			break;
			
		case 'A':
			keys[1] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e)
	{
		// no code needed here
	}

	public void run()
	{
		try
		{
			while (true)
			{
				Thread.currentThread().sleep(8);
				repaint();
			}
		}
		catch (Exception e)
		{
			
		}
	}
}

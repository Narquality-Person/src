package UnitPong;

import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import UnitFifteen.Block;
import UnitFifteen.Paddle;
import UnitFifteen.Wall;

public class Breakout extends Canvas implements KeyListener, Runner{
	private Ball ball;
	private Paddle paddle;
	
	//keep track of what keys are pressed
	private boolean[] pressed;
	
	private List<Block> breakoutBlocks;
	private Wall top, bottom, left, right;
	private final int bWidth = 600;
	private final int bHeight = 450;
	
	public Breakout()
	{
		//set up all game variables
		
		ball = new Ball(bWidth / 2, 300);
		ball.setXSpeed(2);
		ball.setYSpeed(2);
		
		paddle = new Paddle(bWidth / 2, bHeight - 20, 80, 20, Color.BLUE, 10);
		
		
		top = new Wall(10, 0, bWidth, true);
		bottom = new Wall(10, bHeight + 10, bWidth, true);
		
		left = new Wall(0, 10, bHeight, false);
		right = new Wall(10 + bWidth, 10, bHeight, false);

		pressed = new boolean[2];
		
		breakoutBlocks = new ArrayList<Block>();
		
		int horizontalNum = 9;
		int verticalNum = 6;
		
		for (int i = 0; i < horizontalNum; i++)
		{
			for (int j = 0; j < verticalNum; j++)
			{	
				breakoutBlocks.add(new Block(56 * (i + 1), 48 * (j + 1), 40, (bHeight / 2) / verticalNum));
			}
		}

		// set up Canvas
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
		for (Block blocks : breakoutBlocks)
		{
			blocks.draw(window);
		}
		
		ball.moveAndDraw(window);
		paddle.draw(window);
		
		top.draw(window);
		bottom.draw(window);
		
		left.draw(window);
		right.draw(window);
		
		for (Block blocks : breakoutBlocks)
		{
			boolean kill = false;
			
			if (ball.collideLeft(blocks) || ball.collideRight(blocks))
			{
				ball.setXSpeed(-ball.getXSpeed());
				kill = true;
			}
			
			if (ball.collideDown(blocks) || ball.collideTop(blocks))
			{
				ball.setYSpeed(-ball.getYSpeed());
				kill = true;
			}
			
			if (kill)
			{
				blocks.delete(window);
				breakoutBlocks.remove(blocks);
			}
		}

		if (ball.collideLeft(left) || ball.collideRight(right))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		else if (ball.collideLeft(paddle) || ball.collideRight(paddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (ball.collideDown(top) || ball.collideTop(bottom))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		else if (ball.collideTop(paddle) || ball.collideDown(paddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (pressed[0] == true)
		{
			paddle.moveRightAndDraw(window);
		}
		
		if (pressed[1] == true)
		{
			paddle.moveLeftAndDraw(window);
		}
	}

	public void keyPressed(KeyEvent event)
	{
		switch (toUpperCase(event.getKeyChar()))
		{
		case 'D':
			pressed[0] = true;
			break;
		
		case 'A':
			pressed[1] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent event)
	{
		switch (toUpperCase(event.getKeyChar()))
		{
		case 'D':
			pressed[0] = false;
			break;
		
		case 'A':
			pressed[1] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent event)
	{
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

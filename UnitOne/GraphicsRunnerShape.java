package UnitOne;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunnerShape extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunnerShape()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ShapePanel());

		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunnerShape run = new GraphicsRunnerShape();
	}
}

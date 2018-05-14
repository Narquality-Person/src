package UnitFifteen;

import java.awt.Color;

public class Wall extends Block {
	public Wall(int x, int y, int length, boolean horizontal) {
		super(x, y, 0, 0, Color.BLUE);
		
		if (horizontal) {
			setWidth(length);
			setHeight(10);
		}
		else {
			setWidth(10);
			setHeight(length);
		}
	}
}

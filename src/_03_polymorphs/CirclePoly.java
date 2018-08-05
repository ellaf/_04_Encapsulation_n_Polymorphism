package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePoly extends Polymorph{

	int counter = 0;
	CirclePoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, 50, 50);
	}
	
	@Override
	public void update() {
	x += Math.cos(counter)*20;
	y += Math.sin(counter)*20;
	counter++;
	}

}

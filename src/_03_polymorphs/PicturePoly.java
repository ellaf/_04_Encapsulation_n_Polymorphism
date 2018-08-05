package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PicturePoly extends Polymorph{

	BufferedImage kevin;
	
	PicturePoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			kevin = ImageIO.read(this.getClass().getResourceAsStream("kevin.jpg"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
	g.drawImage(kevin, x, y, 50, 50, null);
	}

}

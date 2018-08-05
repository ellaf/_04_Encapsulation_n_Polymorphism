package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    //Polymorph bluePoly;
    ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
    Polymorph pm1;
    Polymorph pm2;
    Polymorph pm3;
    Polymorph pm4;
    Polymorph pm5;
    Polymorph pm6;
    Polymorph pm7;
    Polymorph pm8;

    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	
   	 pm1 = new BluePolymorph(150,50);
   	 pm2 = new RedPolymorph(200,80);
   	 pm3 = new MovingMorph(50,50);
   	 pm4 = new RedPolymorph(400,320);
   	 pm5 = new CirclePoly(200,220);
   	 pm6 = new FollowPoly(400,20);
   	 pm7 = new PicturePoly(300,100);
   	 pm8 = new MessagePoly(350,150);
   	 this.addMouseListener((MessagePoly)pm8);
   	 poly.add(pm1);
   	 poly.add(pm2);
   	 poly.add(pm3);
   	 poly.add(pm4);
   	 poly.add(pm5);
   	 poly.add(pm6);
   	 poly.add(pm7);
   	 poly.add(pm8);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 for(Polymorph b : poly) {
   	b.draw(g);
   	 }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
   	for(Polymorph b : poly) {
   	   	b.update();
   	   	 }

   	 
    }
}

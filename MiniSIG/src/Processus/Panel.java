package Processus;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
public class Panel extends javax.swing.JPanel {
 
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
 
	private Image img;	
	private int width;
	private int height;
 
	private int x;
	private int y;
 
	public Panel() {
		super();
		width=1200;
		height=1200;
		img = Toolkit.getDefaultToolkit().getImage("arras2.png");
		initGUI();
	}
 
	private void initGUI() {
		try {		
			setPreferredSize(new Dimension(1200, 1000));
 
			this.addMouseMotionListener(new MouseMotionAdapter() {
				
				public void mouseDragged(MouseEvent evt) {
					x = evt.getX();
					y = evt.getY();
					repaint();
					
				}
			}
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		super.paint(g);	
		g2.drawImage(img, 0, 0, width, height,x,y,x+width,y+height, null);
 
	}
}

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class carte {

	 private double X1 ;
	 private double X2 ;
	 private double Y1 ;
	 private double Y2 ;
	 private int w,h ;
	 private Color[][] grid;
	 private boolean updateImage;
	 private  Image gridImage ;
	 
	 
	 public carte(int nw,int nh,int w,int h ,double X3,double X4, double Y3,double Y4, String img) 
	 {
		 double X1 = X3 ;
		 double X2 = X4 ;
		 double Y1 = Y3 ;
		 double Y2 = Y4;
		 String image = img;
		 
		 gridImage = new BufferedImage(nw*w,nh*h, 
				  BufferedImage.TYPE_INT_RGB);
	 }
	 public double getX1()
	 {
		return X1 ;
	 }
	 public void setX1(double X1)
	 {
		 this.X1 = X1 ;
	 }
	 
	 public double getX2()
	 {
		return X2 ;
	 }
	 public void setX2(double X2)
	 {
		 this.X2 = X2 ;
	 }
	 public double getY2()
	 {
		return Y2 ;
	 }
	 public void setY2(double Y2)
	 {
		 this.Y2 = Y2 ;
	 }
	 public double getY1()
	 {
		return Y1 ;
	 }
	 public void setY1(double Y1)
	 {
		 this.Y1 = Y1 ;
	 }
	 
	 

	 
	 
	 
	public void CreerAfficherPoint()
	 {
		setY1(2.7383);
		setY2(2.7949);
		setX1(50.2992);
		setX2(50.2754);
		final double X=50.2873; // coordone d'un point
		final double Y=2.7666;
		
		
	 }
	
	public static void main(String[] args){       
	                    

		  try{
			  
	      Image img = ImageIO.read(new File("arras2.png"));
	      BufferedImage image = toBufferedImage(img);
	      
	      Graphics g = (Graphics)image.getGraphics();
	        
		  
		  creerEtAfficherFenetre(image);
	        
	       } catch (IOException e) {
	      e.printStackTrace();
	       }
	    
	  }    
	  
	  public static BufferedImage toBufferedImage(Image image) {
	      if( image instanceof BufferedImage ) {
	              
	              return( (BufferedImage)image );
	      } else {
	  image = new ImageIcon(image).getImage();
	  
	  BufferedImage bufferedImage = new BufferedImage( 20,30, BufferedImage.TYPE_INT_RGB );
	  
	  return( bufferedImage ) ;
	}
	      }
	      public static void creerEtAfficherFenetre(final BufferedImage image) {
	          JFrame fenetre = new JFrame("MiniSig");
	          JPanel Panel2 = new JPanel();
	          Panel Panel3 = new Panel() ;
	   
	          Panel3.setLayout(null);
	          
	         JPanel Panel1 = new JPanel();
	                         
	          GridBagConstraints c2 = new GridBagConstraints();
	          
	          c2.gridx = 1;
	          c2.gridy = 2;
	          c2.ipadx =500;
	          c2.ipady =500;
	          
	          
	          Panel2.setPreferredSize(new Dimension(1200,1000));
	          Panel1.setPreferredSize(new Dimension(1920,1080));
	          
	          Panel2.add(Panel3);
	          Panel1.add(Panel2,c2);

	          
	          fenetre.setContentPane(Panel1);
	                      
	                  
	          fenetre.setPreferredSize(new Dimension (1920,1080));
	          fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          fenetre.pack();
	           
	          fenetre.setVisible(true);
	    }
	  
}



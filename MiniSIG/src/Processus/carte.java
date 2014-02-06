package Processus;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import CAD.Mapping;




public class carte {

	 private double X1 ;
	 private double X2 ;
	 private double Y1 ;
	 private double Y2 ;
	 private int zoom ;
	 private  String image ;
	 private  ResultSet rs;
	 private  Mapping mpg;
	 
	 
	 public carte()
	 {
		 
	 }
	 
	 public carte(double X1,double X2, double Y1,double Y2, int zoom, String img) 
	 {
		  this.X1 = X1 ;
		  this.X2 = X2 ;
		  this.Y1 = Y1 ;
		  this.Y2 = Y2;
		 this.zoom = zoom;
		 this.image = img;
		 
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
	                    
		  String image ="arras2.png";
		  creerEtAfficherFenetre(image);
	        

	    
	  }    
	  

		public int[] calculcoordpoint(int id_carte , Image image , double x , double y )
	      {
	    	 rs = mpg.Select( "*" , "carte" , "id_carte="+id_carte );
	    	  
	    	 try {
	    		 int width = image.getWidth(null);
		    	 int height = image.getHeight(null);
		    	double X1 = rs.getDouble(1);
				double X2 = rs.getDouble(2);
				double Y1 = rs.getDouble(3);
				double Y2 = rs.getDouble(4);
				
				double X3=X2-X1 ;
				double fx = height/X3;
				double X4=x-X1 ;
				double x_point = fx*X4;
				
				double Y3=Y2-Y1 ;
				double fy = width/Y3;
				double Y4=Y1 + y ;
				double y_point = fy*Y4;
				
				int[] coord = new int[2] ;
				int p_x = doubleToInt(x_point);
				int p_y = doubleToInt(y_point);
				
				coord[0] = p_x ;
				coord[1] = p_y ;
				
				
				return coord;
					
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
			return null;
	    	  
	      }
		
		public int[] calculcoorduniversel(String image , Image img , double x , double y )
	      {
	    	 rs = mpg.Select( "*" , "carte" , "libelle_carte="+image );
	    	  
	    	 try {
	    		 int width = img.getWidth(null);
		    	 int height = img.getHeight(null);
		    	double X1 = rs.getDouble(1);
				double X2 = rs.getDouble(2);
				double Y1 = rs.getDouble(3);
				double Y2 = rs.getDouble(4);
				
				double X3=X2-X1 ;
				double fx = X3/height;
				double X4 = fx*x;
				double x_point = X1 + X4;
				
				double Y3=Y2-Y1 ;
				double fy = Y3/width;
				double Y4=fy*y;
				double y_point = Y2 - Y4 ;
				
				int[] coord = new int[2] ;
				int p_x = doubleToInt(x_point);
				int p_y = doubleToInt(y_point);
				
				coord[0] = p_x ;
				coord[1] = p_y ;
				
				
				return coord;
	 		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
			return null;
	    	  
	      }
		
		
		
		
	      public int doubleToInt(double monDouble) {
	          long l = Math.round(monDouble);
	          String s = ""+l;
	          int i;
	          try {
	              i = Integer.parseInt(s);
	          } catch (NumberFormatException e) {
	              if (l<0) { i = Integer.MIN_VALUE; } else { i = Integer.MAX_VALUE; }
	          }
	          return i;
	      }
	      
		public static void creerEtAfficherFenetre(String image) {
	          JFrame fenetre = new JFrame("MiniSig");
	          JPanel Panel2 = new JPanel();
	          Map Panel3 = new Map( 756 , 546 ,image) ;
	   
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
		public static void ActionPOI(double abscisse, double ordonee,JPanel panel) {
			// TODO Auto-generated method stub
			
		}
	  
}



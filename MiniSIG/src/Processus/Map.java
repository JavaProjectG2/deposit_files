package Processus;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import CAD.Mapping;
public class Map extends javax.swing.JPanel {
 
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
 
	private Image img;	
	private int width;
	private int height;
	carte carteactu = new carte();
	private int x;
	private int y;
	private String image;
	private Mapping mpg = new Mapping();
	private ResultSet rs;
	int nbLIgnes;
	ArrayList<PI> list_PI = new ArrayList<PI>() ;
	ArrayList<Lieu> list_Lieu = new ArrayList<Lieu>() ;
	ArrayList<JPanel> panelPI = new ArrayList<JPanel>() ;
	ArrayList<JPanel> panelLieu = new ArrayList<JPanel>() ;
	ArrayList<Integer> Id_PI = new ArrayList<Integer>();
	ArrayList<Integer> Id_Lieu = new ArrayList<Integer>();
	Iterator<JPanel> it_PI = panelPI.iterator(); 
	Iterator<JPanel> it_Lieu = panelLieu.iterator(); 

	int nbligne;
 
	public Map(int h , int w , String image) {
		super();
		width=h;
		height=w;
		this.image = image;
		img = Toolkit.getDefaultToolkit().getImage(image);
		initGUI();
	}
	
	private void initGUI() {
		try {		
			setPreferredSize(new Dimension(1200, 1000));
 
			this.addMouseMotionListener(new MouseMotionAdapter() {
				
				public void mouseDragged(MouseEvent evt) {
					x = evt.getX();
					y = evt.getY();
					while (it_PI.hasNext()); 

					remove(panelPI.indexOf((list_PI.get(Id_PI.get(1))))) ; 
					remove(panelPI.indexOf((list_Lieu.get(Id_Lieu.get(1))))) ; 
					
					repaint();
					
				}
			}
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public void paint(Graphics g) {
		
	  
		 int[] coord1 = carteactu.calculcoorduniversel( image , img , x ,  y );
		 int[] coord2 = carteactu.calculcoorduniversel( image , img , x+width ,  y+height );
		 try {
			SelectionPI(coord1[0] , coord1[1] , coord2[2] , coord2[2]) ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		Graphics2D g2 = (Graphics2D)g;
		super.paint(g);	
		g2.drawImage(img, 0, 0, width, height,x,y,x+width,y+height, null);
 
	}
	


	
	public void SelectionPI(int x1 , int y1 , int x2 , int y2 ) throws SQLException
	{
		rs = mpg.Select("count(*)","AS nbLignes", "(interet.X_interet between "+x1+" and "+y1+") AND (interet.Y_interet betwenn "+x1+" and "+x2+")" ) ;		
		
		int nbLignes=0;
    	rs.next();
    	nbLignes = rs.getInt("nbLignes");
    	rs = null;

		
		rs = mpg.Select("ID_Interet, Libelle_Interet, TexteCourt_Interet, Description_Interet, X_Interet, Y_Interet, Image_Interet", "interet" , "(interet.X_interet between "+x1+" and "+y1+") AND (interet.Y_interet betwenn "+x1+" and "+x2+")" ) ;
		
			
			
			try {
				while (rs.next()){
				
						{
					
					try {
						
						
						 Id_PI.add(rs.getInt(1));
								
						
						
						list_PI.add(rs.getInt(1),new PI());
						list_PI.get(rs.getInt(1)).setLibelle(rs.getString(2));
						list_PI.get(rs.getInt(1)).setId_PI(rs.getInt(1));
						list_PI.get(rs.getInt(1)).setTexteCourt(rs.getString(3));
						list_PI.get(rs.getInt(1)).setDescription(rs.getString(4));
						list_PI.get(rs.getInt(1)).setAbscisse(rs.getDouble(5));
						list_PI.get(rs.getInt(1)).setOrdonee(rs.getDouble(6));
						list_PI.get(rs.getInt(1)).setImage(rs.getString(7));
						list_PI.get(rs.getInt(1)).setTexteCourt(rs.getString(3));
						list_PI.get(rs.getInt(1)).setZoom(rs.getInt(8));
						int[] coord = new int[2];
						coord = carteactu.calculcoordpoint(list_PI.get(rs.getInt(1)).getId_PI(),img , list_PI.get(rs.getInt(1)).getAbscisse(), list_PI.get(rs.getInt(1)).getOrdonee());
						
						
						
						panelPI.add(rs.getInt(1), new JPanel());
						panelPI.get(rs.getInt(1)).add(list_PI.get(rs.getInt(1)));
						panelPI.get(rs.getInt(1)).setVisible(true);	
						add(panelPI.get(rs.getInt(1)));
						panelPI.get(rs.getInt(1)).setLocation( coord[0], coord[1]);
						panelPI.get(rs.getInt(1)).setVisible(true);
						
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
						}
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		


	}
	public void Selectionlieu(int x1 , int y1 , int x2 , int y2 )
	{
				
		rs = mpg.Select("*", "lieu" , "(lieu.X_lieu between "+x1+" and "+y1+") AND (lieu.Y_lieu betwenn "+x1+" and "+x2+")" ) ;
		
			
			
			try {
				while (rs.next()){
				
						{
					
					try {
						
						 int i =0;
						 Id_Lieu.add(rs.getInt(1));
								
						
						
						list_Lieu.add(rs.getInt(1),new Lieu());
						list_Lieu.get(rs.getInt(1)).setLibelle(rs.getString(2));
						list_Lieu.get(rs.getInt(1)).setId_Lieu(rs.getInt(1));
						list_Lieu.get(rs.getInt(1)).setAbscisse(rs.getDouble(3));
						list_Lieu.get(rs.getInt(1)).setOrdonee(rs.getDouble(4));
						list_Lieu.get(rs.getInt(1)).setZoom(rs.getInt(8));
						list_Lieu.get(rs.getInt(1)).setID_Map(rs.getInt(8));
						
						int[] coord = new int[2];
						coord = carteactu.calculcoordpoint(list_Lieu.get(rs.getInt(1)).getId_Lieu(),img , list_Lieu.get(rs.getInt(1)).getAbscisse(), list_Lieu.get(rs.getInt(1)).getOrdonee());
						
						
						
						panelLieu.add(rs.getInt(1), new JPanel());
						panelLieu.get(rs.getInt(1)).add(list_Lieu.get(rs.getInt(1)));
						panelLieu.get(rs.getInt(1)).setVisible(true);	
						add(panelLieu.get(rs.getInt(1)));
						panelLieu.get(rs.getInt(1)).setLocation( coord[0], coord[1]);
						panelLieu.get(rs.getInt(1)).setVisible(true);
						i++;
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
						}
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		


	}
	
	
	
}

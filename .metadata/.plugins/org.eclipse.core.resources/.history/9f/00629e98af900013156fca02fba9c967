package Processus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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

public class Map extends javax.swing.JLayeredPane {

	/**
	 * Auto-generated main method to display this JPanel inside a new JFrame.
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
	int nbLIgne;
	ArrayList<PI> list_PI = new ArrayList<PI>();
	ArrayList<Lieu> list_Lieu = new ArrayList<Lieu>();
	ArrayList<JPanel> panelPI = new ArrayList<JPanel>();
	ArrayList<JPanel> panelLieu = new ArrayList<JPanel>();
	ArrayList<Integer> Id_PI = new ArrayList<Integer>();
	ArrayList<Integer> Id_Lieu = new ArrayList<Integer>();
	Iterator<JPanel> it_PI = panelPI.iterator();
	Iterator<JPanel> it_Lieu = panelLieu.iterator();

	int nbligne;

	public Map(int h, int w, String image) {
		super();
		width = h;
		height = w;
		this.image = image;
		setPreferredSize(new Dimension(w,h));
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
					System.out.print("1");
					while (it_PI.hasNext()) {

						remove(panelPI.indexOf((list_PI.get(Id_PI.get(1)))));
					}
					while (it_PI.hasNext()) {
						remove(panelLieu.indexOf((list_Lieu.get(Id_Lieu.get(1)))));
					}
					repaint();

				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		super.paint(g);
		g2.drawImage(img, 0, 0, width, height, x, y, x + width, y + height,
				null);
		
		double[] coord1 = carteactu.calculcoorduniversel(image, img, x, y);
		
		double[] coord2 = carteactu.calculcoorduniversel(image, img, x + width, y+ height);
		try {
			SelectionPI(coord1[0], coord1[1], coord2[0], coord2[1]);
			Selectionlieu(coord1[0], coord1[1], coord2[0], coord2[1]);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void SelectionPI(double x1, double y1, double x2, double y2) throws SQLException {
		rs = mpg.Select("count(*)", "interet AS nbLignes","((X_Interet between " + x1 + " and " + x2+ ") AND (Y_Interet between " + y1 + " and "+ y2 + "))");
if (rs != null)
{
		rs.next();
		nbLIgne = rs.getInt(1);
		

		rs = mpg.Select("ID_Interet, Libelle_Interet, TexteCourt_Interet, Description_Interet, X_Interet, Y_Interet, Image_Interet","interet", "((X_interet between " + x1 + " and " + y1+ ") AND (Y_interet between " + x1 + " and "+ x2 + "))");

		try {
			while (rs.next()) {

				{

					try {

						Id_PI.add(rs.getInt(1));

						list_PI.add(rs.getInt(1), new PI());
						list_PI.get(rs.getInt(1)).setLibelle(rs.getString(2));
						list_PI.get(rs.getInt(1)).setId_PI(rs.getInt(1));
						list_PI.get(rs.getInt(1))
								.setTexteCourt(rs.getString(3));
						list_PI.get(rs.getInt(1)).setDescription(
								rs.getString(4));
						list_PI.get(rs.getInt(1)).setAbscisse(rs.getDouble(5));
						list_PI.get(rs.getInt(1)).setOrdonee(rs.getDouble(6));
						list_PI.get(rs.getInt(1)).setImage(rs.getString(7));
						list_PI.get(rs.getInt(1))
								.setTexteCourt(rs.getString(3));
						list_PI.get(rs.getInt(1)).setZoom(rs.getInt(8));
						int[] coord = new int[2];
						coord = carteactu.calculcoordpoint(
								list_PI.get(rs.getInt(1)).getId_PI(), img,
								list_PI.get(rs.getInt(1)).getAbscisse(),
								list_PI.get(rs.getInt(1)).getOrdonee());

						panelPI.add(rs.getInt(1), new JPanel());
						panelPI.get(rs.getInt(1))
								.add(list_PI.get(rs.getInt(1)));
						panelPI.get(rs.getInt(1)).setVisible(true);
						add(panelPI.get(rs.getInt(1)));

						panelPI.get(rs.getInt(1)).setVisible(true);
						panelPI.get(rs.getInt(1)).setBounds(coord[0],coord[1],16,16); ;
						System.out.print("création PI");
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

	public void Selectionlieu(double coord1, double coord12, double coord2, double coord22) {

		rs = mpg.Select("count(*)", "lieu AS nbLignes","((X_Lieu between " + coord1 + " and " + coord2+ ") AND (Y_Lieu between " + coord12 + " and "+ coord22 + "))");
		if (rs != null)
		{
				try {
					rs.next();
					nbLIgne = rs.getInt(1);
					rs = null;
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
		rs = mpg.Select("*", "lieu", "((X_Lieu between " + coord1 + " and " + coord2+ ") AND (Y_Lieu between " + coord12 + " and "+ coord22 + "))");

		try {
			while (rs.next()) {

				{

					try {

						int i = 0;
						Id_Lieu.add(rs.getInt(1));

						list_Lieu.add(i, new Lieu());
						list_Lieu.get(i).setLibelle(rs.getString(2));
						list_Lieu.get(i).setId_Lieu(rs.getInt(1));
						list_Lieu.get(i).setAbscisse(rs.getDouble(3));
						list_Lieu.get(i).setOrdonee(rs.getDouble(4));
						list_Lieu.get(i).setZoom(rs.getInt(5));
						list_Lieu.get(i).setID_Map(rs.getInt(6));
						list_Lieu.get(i).setPreferredSize(new Dimension(32,32));
						int[] coord = new int[2];
						coord = carteactu.calculcoordpoint(	list_Lieu.get(i).getId_Lieu(), img,list_Lieu.get(i).getAbscisse(),list_Lieu.get(i).getOrdonee());

						panelLieu.add(i, new JPanel());
						panelLieu.get(i).add(list_Lieu.get(i));
						
						add(panelLieu.get(i),DRAG_LAYER);
						panelLieu.get(i).setBounds(coord[0],coord[1],32,32);
						panelLieu.get(i).setBackground(Color.BLUE);
						panelLieu.get(i).setVisible(true);
						

						
						i++;
						System.out.print("création Lieu");

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
}

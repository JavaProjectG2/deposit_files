package Processus;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import CAD.Mapping;


public class Lieu extends JButton{

	private int Id_Lieu;
	private double Abscisse;
	private double Ordonee;
	private String Libelle;
	private int Zoom;
	private int ID_Map;
	private JPanel panel;
	private Mapping mappingsql = new Mapping();
	
	public Lieu(){
		try {
			Image img = ImageIO.read(getClass().getResource("Poibleu.png"));
		    this.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    this.addMouseListener(new MouseListener()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Consulter_Lieu();
	        }
	        public void mousePressed(MouseEvent e) {}
	        public void mouseReleased(MouseEvent e) {}
	        public void mouseEntered(MouseEvent e) {
	        	Survol_Lieu();
	        }
	        public void mouseExited(MouseEvent e) {}
	    });
	}
	
	public void setId_Lieu(int Id_Lieu){
		this.Id_Lieu = Id_Lieu;
	}
	public int getId_Lieu(){
		return Id_Lieu;
	}
	public void setAbscisse(double Abscisse){
		this.Abscisse = Abscisse;
	}
	public double getAbscisse(){
		return Abscisse;
	}
	public void setpanel(JPanel panel){
		this.panel = panel;
	}
	public JPanel getpanel(){
		return panel;
	}
	public void setID_Map(int ID_Map){
		this.ID_Map=ID_Map;
	}
	public int getID_Map(){
		return ID_Map;
	}
	public void setOrdonee(double Ordonee){
		this.Ordonee = Ordonee;
	}
	public double getOrdonee(){
		return Ordonee;
	}
	public void setLibelle(String Libelle){
		this.Libelle = Libelle;
	}
	public String getLibelle(){
		return Libelle;
	}
	public void setZoom(int Zoom){
		this.Zoom = Zoom;
	}
	public int getZoom(){
		return Zoom;
	}

	public void Consulter_Lieu(){	
		carte.AfficherCarte(ID_Map);
	}
	
	public void Survol_Lieu(){
		panel = new JPanel();
		JLabel label_PI = new JLabel();
		label_PI.setText(this.Libelle);
		panel.add(label_PI);
		carte.ActionPOI(Abscisse,Ordonee,panel);
	}
	
	public void Ajouter_Lieu(int ID_Map){
		String[] nomCol = new String[5];
		String[] champs = new String[5];
		
		nomCol[0]="Libelle_Lieu";
		nomCol[1]="X_Lieu";
		nomCol[2]="Y_Lieu";
		nomCol[3]="ID_Map";
		
		champs[0]=this.Libelle;
		champs[1]=String.valueOf(this.Abscisse);
		champs[2]=String.valueOf(this.Ordonee);
		champs[3]=String.valueOf(ID_Map);
			
		mappingsql.Insert("lieu", nomCol, champs);
	}
	
	public void Supprimer_Lieu(){
		mappingsql.Delete("lieu","ID_Lieu=\'" + Id_Lieu + "\'");
	}
	
	public void Modifier_Lieu(int ID_Lieu){
		String[] champs = new String[5];
		
		champs[0]="Libelle_Lieu=\'" + this.Libelle + "\',";
		champs[1]="X_Lieu=\'" + String.valueOf(this.Abscisse) + "\',";
		champs[2]="Y_Lieu=\'" + String.valueOf(this.Ordonee) + "\',";
		champs[3]="ID_Map=\'" + String.valueOf(ID_Lieu) + "\'";		
		
		mappingsql.Update("lieu", "ID_Lieu=\'" + ID_Lieu +"\'", champs);
		
	}
	
}
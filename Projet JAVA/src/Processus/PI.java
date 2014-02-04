package Processus;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import CAD.Mapping;


public class PI extends JButton{

	private int Id_PI;
	private double Abscisse;
	private double Ordonee;
	private String ImagePI;
	private String Libelle;
	private String TexteCourt;
	private String Description;
	private JPanel panel;
	private Mapping mappingsql = new Mapping();
	
	public PI(){
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
	        	Consulter_PI();
	        }
	        public void mousePressed(MouseEvent e) {}
	        public void mouseReleased(MouseEvent e) {}
	        public void mouseEntered(MouseEvent e) {}
	        public void mouseExited(MouseEvent e) {}
	    });
	}
	
	public void setId_PI(int Id_PI){
		this.Id_PI = Id_PI;
	}
	public int getId_PI(){
		return Id_PI;
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
	public void setOrdonee(double Ordonee){
		this.Ordonee = Ordonee;
	}
	public double getOrdonee(){
		return Ordonee;
	}
	public void setImage(String ImagePI){
		this.ImagePI = ImagePI;
	}
	public String getImage(){
		return ImagePI;
	}
	public void setLibelle(String Libelle){
		this.Libelle = Libelle;
	}
	public String getLibelle(){
		return Libelle;
	}
	public void setTexteCourt(String TexteCourt){
		this.TexteCourt = TexteCourt;
	}
	public String getTexteCourt(){
		return TexteCourt;
	}
	public void setDescription(String Description){
		this.Description = Description;
	}
	public String getDescription(){
		return Description;
	}
	
	public void Consulter_PI(){
		this.panel = new JPanel();
		
		
		
		
	}
	
	public void Ajouter_PI(int ID_Lieu){
		String[] nomCol = new String[7];
		String[] champs = new String[7];
		
		nomCol[0]="Libelle_Interet";
		nomCol[1]="TexteCourt_Interet";
		nomCol[2]="Description_Interet";
		nomCol[3]="X_Interet";
		nomCol[4]="Y_Interet";
		nomCol[5]="Image_Interet";
		nomCol[6]="ID_Lieu";
		
		champs[0]=this.Libelle;
		champs[1]=this.TexteCourt;
		champs[2]=this.Description;
		champs[3]=String.valueOf(this.Abscisse);
		champs[4]=String.valueOf(this.Ordonee);
		champs[5]=this.ImagePI;
		champs[6]=String.valueOf(ID_Lieu);		
			
		mappingsql.Insert("interet", nomCol, champs);
	}
	
	public void Supprimer_PI(){
		mappingsql.Delete("interet","ID_Interet=\'" + Id_PI + "\'");
	}
	
	public void Modifier_PI(int ID_Lieu){
		String[] champs = new String[7];
		
		champs[0]="Libelle_Interet=\'" + this.Libelle + "\',";
		champs[1]="TexteCourt_Interet=\'" + this.TexteCourt + "\',";
		champs[2]="Description_Interet=\'" + this.Description + "\',";
		champs[3]="X_Interet=\'" + String.valueOf(this.Abscisse) + "\',";
		champs[4]="Y_Interet=\'" + String.valueOf(this.Ordonee) + "\',";
		champs[5]="Image_Interet=\'" + this.ImagePI + "\',";
		champs[6]="ID_Lieu=\'" + String.valueOf(ID_Lieu) + "\'";		
		
		mappingsql.Update("interet", "ID_Interet=\'" + Id_PI +"\'", champs);
		
	}
	
}
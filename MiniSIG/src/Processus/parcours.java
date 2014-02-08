package Processus;

import java.awt.TextArea;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import CAD.Mapping;

public class parcours
{
    private String table;
    private String[] nomCol;
    private String[] champs;
    private static Mapping  map = new Mapping();
    private static ResultSet result;
    
    public static void DisplayParcours(JPanel panParcours) throws SQLException {
    	panParcours.setLayout(new BoxLayout(panParcours, BoxLayout.PAGE_AXIS));
    	System.out.println("ok1");
    	
    	ArrayList<String> ListParcours = ConsulterParcours();
    	
    	for(String element : ListParcours) {
    		System.out.println("okloop");
    		JLabel labParcours = new JLabel(element);
    		panParcours.add(labParcours);
    	}
    }
    
    public static ArrayList<String> ConsulterParcours() throws SQLException {
    	ArrayList<String> ListParcours = new ArrayList<String>();
    	
        result = map.Select("Libelle_Parcours, TexteCourt_Parcours", "parcours");

        ResultSetMetaData resultMeta = result.getMetaData();

        //verifie que le ResultSet nest pas vide
        if(result.next()) {
	        for(int i=1; i<= resultMeta.getColumnCount(); i++) {
	        	ListParcours.add(result.getObject(i).toString());
	        }
        }
    	
    	return ListParcours;
    }
        
	public void AjouterParcours(String Description,String Libelle,String TextCourt)
	{
	    String[] nomCol = new String[3];
	    nomCol[0]="Description_Parcours";
	    nomCol[1]="Libelle_Parcours";
	    nomCol[2]= "TexteCourt_Parcours";
	                
	    String[] champs = new String[3];
	    champs[0]=Description;
	    champs[1]=Libelle;
	    champs[2]=TextCourt;             
		//String condition = "ID_parcours = "+Id+"";
		map.Insert("parcours", nomCol , champs);
	}
	
	public void SupprimerParcours(String condition)
	{
	    /*String[] nomCol = new String[3];
	    nomCol[0]="Description_Parcours";
	    nomCol[1]="Libelle_Parcours";
	    nomCol[2]= "TexteCourt_Parcours";*/
	            
		//String condition = "ID_parcours = "+Id+"";
		map.Delete("parcours", condition);
	}
}

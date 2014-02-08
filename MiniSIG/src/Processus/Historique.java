package Processus;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import CAD.Mapping;

public class Historique{
	private static Mapping mappingsql = new Mapping();
	
	public static void DisplayPanelHistorique(JPanel Contener) throws SQLException {
		
		Contener.setLayout(new BoxLayout(Contener, BoxLayout.PAGE_AXIS));
		
		ArrayList<String> ListHisto = ConsulterHisto();
		
		for(String element : ListHisto) {
			JLabel LabHisto = new JLabel(element);
			Contener.add(LabHisto);
		}
		
		/*results.last();
		int nbLignes = results.getRow();
		System.out.println(nbLignes);
		
		results.first();
		
		//remplie les labels avec le contenu du resultSet recupere
		for(int i=1; i<=nbLignes; i++) {
			String contLigne = results.getString(i);
			System.out.println(contLigne);
			JLabel labHisto = new JLabel(contLigne);
			Contener.add(labHisto);
		}*/
		
		
	}
	
	public static ArrayList<String> ConsulterHisto() throws SQLException{ //recupere tout historique
		
		 ArrayList<String> ListHisto = new ArrayList<String>();
		
		ResultSet results = mappingsql.Select("historique.Date_Historique, interet.Libelle_Interet, interet.TexteCourt_Interet", "`historique` INNER JOIN `interet` ON historique.ID_Interet=interet.ID_Interet ORDER BY `Date_Historique` DESC LIMIT 0 , 30");
		
		ResultSetMetaData resultMeta = results.getMetaData();
		
		//verifie que le ResultSet nest pas vide
		if(results.next()) {
			for(int i=1; i<=resultMeta.getColumnCount(); i++) {
				ListHisto.add(results.getObject(i).toString());
			}
		}
		
		return ListHisto;
	}
	
	public static void AjouterHisto(int ID_Pi){
		
		String[] nomCol = new String[2];
		String[] champs = new String[2];
		
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
		
		nomCol[0]="Date_Historique";
		nomCol[1]="ID_Interet";

		champs[0]=dateFormat.format(date);
		champs[1]=String.valueOf(ID_Pi);
			
		mappingsql.Insert("historique", nomCol, champs);
	}	 
}




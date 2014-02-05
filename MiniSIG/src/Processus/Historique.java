package Processus;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;

import CAD.Mapping;

public class Historique{
	 private Mapping mappingsql = new Mapping();
	
	 
	public void ConsulterHisto(){
		ResultSet results = mappingsql.Select("*", "`historique` ORDER BY `Date_Historique` DESC LIMIT 0 , 30");
		JPanel Contener = new JPanel();
		 
	}
	
	public void AjouterHisto(int ID_Pi){
		
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




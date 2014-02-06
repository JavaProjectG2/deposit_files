package iu.parcours;

import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class parcours
{
    private String table;
    private String[] nomCol;
    private String[] champs;
    Mapping mpg = new Mapping();
        
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
	mpg.Insert("parcours", nomCol , champs);
}

public void SupprimerParcours()
{
    String[] nomCol = new String[3];
    nomCol[0]="Description_Parcours";
    nomCol[1]="Libelle_Parcours";
    nomCol[2]= "TexteCourt_Parcours";
            
	//String condition = "ID_parcours = "+Id+"";
	mpg.Delete("parcours", nomCol , champs);
}
}

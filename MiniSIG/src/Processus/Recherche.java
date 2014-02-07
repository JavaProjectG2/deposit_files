/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Processus;

import CAD.Mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rémi
 */
public class Recherche {
    
    private Mapping mappingsql = new Mapping();
    private ResultSet result1;
    private ResultSet result2;
    private ResultSet result3;
    
    public void DisplayPanelRecherche() throws SQLException {
    	JPanel panRecherche = new JPanel();
    	
    	panRecherche.setLayout(new BoxLayout(panRecherche, BoxLayout.PAGE_AXIS));
    	
    	ArrayList<String> ListRechercheLieu = E();
    	
    	for(String element : ListRechercheLieu) {
    		JLabel labRecherche = new JLabel(element);
    		panRecherche.add(labRecherche);
    	}
    }
    
    public ResultSet EffectuerRechercheInteret(String Contenu){
                String recherche1= "`interet` WHERE Libelle_Interet LIKE `%";
                recherche1+= Contenu;
                recherche1+= "%` OR TexteCourt_Interet LIKE `%";
                recherche1+= Contenu;
                recherche1+= "%` OR Description_Interet LIKE `%";
                recherche1+= Contenu;
                recherche1+= "%`";
                ResultSet result1 = mappingsql.Select("`Libelle_Interet`,`TexteCourt_Interet`,`Description_Interet`",recherche1);
                return result1;
    }
    
    public ResultSet EffectuerRechercheLieu(String Contenu){
                String recherche2="`lieu` WHERE Libelle_Lieu LIKE `% ";
                recherche2 = Contenu;
                recherche2+=" %`";
                ResultSet result2 = mappingsql.Select("`Libelle_Lieu`", recherche2);
                return result2;
}

	public ResultSet EffectuerRechercheParcours(String Contenu){
                String recherche3="`parcours` WHERE Libelle_Parcours LIKE`";
                recherche3+= Contenu;
                recherche3+="`%"; 
                rechercher3+=
                recherche3
                return result3;
	}
	
	/*public ResultSet[] EffectuerRecherche(String Contenu)
	{
		ResultSet[] tab_resultat = new ResultSet[2];
		
	}*/
	
	public Recherche(String Contenu) throws SQLException{
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		ResultSet re_interet = EffectuerRechercheInteret(Contenu);
		ResultSet re_lieu = EffectuerRechercheLieu(Contenu);
		ResultSet re_parcours = EffectuerRechercheParcours(Contenu);
		
		ArrayList<JLabel> list_recherche = new ArrayList<JLabel>();
		
		JFrame fenetre_recherche = new JFrame();
		while(re_interet.next())
		{
			list_recherche.add(i,new JLabel());
			list_recherche.get(i).setText(re_interet.getString(0);
		}
		
	}
    
	
	
}

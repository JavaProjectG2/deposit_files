package Processus;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Color; 

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import CAD.Mapping;

/**
 *
 * @author Dustdevil
 */

public class News {
    
    private static Mapping map = new Mapping();
    private static ResultSet result;
    
    //creation jpanel contenant toutes les news sous la forme de liens hypertextes
    public static void DisplayPanelNews(JPanel panNews) throws SQLException {
    	//JPanel panNews = new JPanel();
    	
    	panNews.setLayout(new BoxLayout(panNews, BoxLayout.PAGE_AXIS));
    	System.out.println("ok1");
    	
    	ArrayList<String> ListNews = ConsultNews();
    	System.out.println("ok2");
    	System.out.println(ListNews);
    	
    	for(String element : ListNews) {
    		System.out.println("okloop");
    		JLabel labNews = new JLabel(element);
    		panNews.add(labNews);
    	}
    }
    
    public static void AddNews(String[] infosNews) { //les informations dans infosNews doivent etre dans lordre : Libelle_New, Description_New
        String[] nomCol = new String[2];
        
        nomCol[0] = "Libelle_New";
        nomCol[1] = "Description_New";
        
        map.Insert("new", nomCol, infosNews);
    }
    
    public static ArrayList<String> ConsultNews() throws SQLException { //recupere lensemble des news 
        
        ArrayList<String> ListNews = new ArrayList<String>();
        
        result = map.Select("Libelle_New, Description_New", "new");

        ResultSetMetaData resultMeta = result.getMetaData();

        //verifie que le ResultSet nest pas vide
        if(result.next()) {
	        for(int i=1; i<= resultMeta.getColumnCount(); i++) {
	        	ListNews.add(result.getObject(i).toString());
	        }
        }
        
        return ListNews; 
    }
    
    public static void modifyNews(String IDNews, String[] infosNews) { //les infos de infosNews doivent etre dans lordre : Libelle_New, Description_New et presentes comme dans une requete SQL
        map.Update("new", IDNews, infosNews);
    }
    
    public static void DelNews(String IDNews) {
        map.Delete("new", "ID_New = "+IDNews);
    }
}

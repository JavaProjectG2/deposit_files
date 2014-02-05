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
    
    private Mapping map = new Mapping();
    private ResultSet result;
    
    //creation jpanel contenant toutes les news sous la forme de liens hypertextes
    public void DisplayPanelNews() throws SQLException {
    	JPanel panNews = new JPanel();
    	
    	panNews.setLayout(new BoxLayout(panNews, BoxLayout.PAGE_AXIS));
    	
    	ArrayList<String> ListNews = ConsultNews();
    	
    	for(String element : ListNews) {
    		JLabel labNews = new JLabel(element);
    		panNews.add(labNews);
    	}
    }
    
    public void AddNews(String[] infosNews) { //les informations dans infosNews doivent etre dans lordre : Libelle_New, Description_New
        String[] nomCol = new String[2];
        
        nomCol[0] = "Libelle_New";
        nomCol[1] = "Description_New";
        
        map.Insert("News", nomCol, infosNews);
    }
    
    public ArrayList<String> ConsultNews() throws SQLException { //recupere lensemble des news 
        
        ArrayList<String> ListNews = new ArrayList<String>();
        
        result = map.Select("*", "News");
        ResultSetMetaData resultMeta = result.getMetaData();
        
        for(int i=0; i<= resultMeta.getColumnCount(); i++) {
            ListNews.add(result.getObject(i).toString());
        }
        
        return ListNews; 
    }
    
    public void modifyNews(String IDNews, String[] infosNews) { //les infos de infosNews doivent etre dans lordre : Libelle_New, Description_New et presentes comme dans une requete SQL
        map.Update("News", IDNews, infosNews);
    }
    
    public void DelNews(String IDNews) {
        map.Delete("News", "ID_New = "+IDNews);
    }
}

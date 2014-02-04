
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dustdevil
 */
public class News {
    
    Mapping map = new Mapping();
    ResultSet result;
    
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
    
    public void modifyNews(String IDNews, String infosNews) { //les infos de infosNews doivent etre dans lordre : Libelle_New, Description_New et presentes comme dans une requete SQL
        map.Update("News", IDNews, infosNews);
    }
    
    public void DelNews(String IDNews) {
        map.Delete("News", "ID_New = "+IDNews);
    }
}

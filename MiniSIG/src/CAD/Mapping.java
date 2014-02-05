package CAD;
import java.sql.ResultSet;

// Insert et Update
public class Mapping 
{
    private String rq_sql;
    private ResultSet result;
    private CAD conn = new CAD();
    
    public void CL_mpg_affichage()
    {
        this.rq_sql = null;
    }
    
    //requete INSERT
    public void Insert(String nomTable, String[] nomCol, String[] champs) {
        this.rq_sql  = "INSERT INTO `"+nomTable+"` ('";
        
        for (String col : nomCol) {
            this.rq_sql += col+"', '";
        }
        
        rq_sql = rq_sql.substring(0,(rq_sql.length()>=1)? rq_sql.length()-3 : 0); //supprime les 3 derniers caracteres de la requete pour retirer les quotes et virgules en trop.
        
        this.rq_sql += ") VALUES ";
        for (String champ : champs) {
            this.rq_sql += champ;
        }
        
        conn.m_ActionsRows(rq_sql);
        
    }
                
    //requete UPDATE
    public void Update(String nomTable, String Condition, String[] champs) { //remplir la variable champs comme dans une requete SQL
        
        this.rq_sql = "UPDATE "+nomTable+" SET ";

        this.rq_sql += champs;
        
        this.rq_sql += " WHERE "+Condition;
        
        conn.m_ActionsRows(rq_sql);
    }
    
    //requete DELETE
    public void Delete(String table, String Condition) {
        this.rq_sql= "DELETE * FROM \'"+table+"\' WHERE "+Condition+"";
        
        conn.m_ActionsRows(rq_sql);
    }

    //requete SELECT
    public ResultSet Select(String champ, String table, String Id) {
        this.rq_sql = "SELECT \'"+champ+"\' FROM \'"+table+"\' WHERE "+Id+"";
        
        result = conn.m_GetRows(rq_sql);
        
        return result;
    }
    public ResultSet Select(String champ, String table) {
        this.rq_sql = "SELECT "+champ+" FROM "+table+"";
        
        result = conn.m_GetRows(rq_sql);
        
        return result;
    }
}	


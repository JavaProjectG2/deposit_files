package iu.parcours;
public class Mapping 
{
   private String rq_sql;
    
     public void Insert(String nomTable, String[] nomCol, String[] champs) 
     {
        this.rq_sql  = "INSERT INTO `"+parcours+"` ('"; 
        
        for (String col : nomCol) 
        {
            this.rq_sql += col+"', '";
        }
     }

   public void Delete(String parcours, String[] nomCol, String[] champs) 
   {
       this.rq_sql  = "DELETE FROM`"+parcours+"` ('"; 
   }
}
    
    


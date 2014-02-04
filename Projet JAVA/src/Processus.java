import java.sql.ResultSet;


public class Processus 
{
	Mapping mpg = new Mapping();
	CAD cad = new CAD();
	public ResultSet Del(String libelle, String lieu, String condition)
	{
			
			ResultSet resultat = cad.m_GetRows(mpg.Delete(libelle, lieu, condition));
			return resultat;
	}	
	
	public ResultSet Select(String champ, String table, String Id)
	{
		ResultSet resultat_rq = cad.m_GetRows(mpg.Select(champ, table, Id));
		return resultat_rq;
	}

	public ResultSet Select(String champ, String table)
	{
		ResultSet resultat_rq = cad.m_GetRows(mpg.Select(champ, table));
		return resultat_rq;
	}
		
}


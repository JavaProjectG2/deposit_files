

public class Mapping 
{
	private String rq_sql;
	public void CL_mpg_affichage()
	{
		this.rq_sql = null;
	}
	
	public String Delete(String champ, String table, String Id)
	{
		this.rq_sql= "DELETE "+champ+" FROM "+table+" WHERE "+Id+"";
		return rq_sql;
	}
	
	public String Select(String champ, String table, String Id)
	{
		this.rq_sql = "SELECT "+champ+" FROM "+table+" WHERE "+Id+"";
		return rq_sql;
	}
	public String Select(String champ, String table)
	{
		this.rq_sql = "SELECT "+champ+" FROM "+table+"";
		return rq_sql;
	}


	
		
	}	


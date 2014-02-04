import java.sql.ResultSet;
import java.sql.SQLException;


public class main {

	public static void main(String[] args) 
	{
		Processus proc = new Processus();
		
		String table = "*"; 
		String champ = "*";
		String condition = "*";
		
		
		ResultSet resultat = proc.Del(champ, table, condition);
		
		ResultSet resultat_rq = proc.Select(champ, table);
		

		try {
	//1er requete
			while(resultat.next())
			{
				System.out.println(resultat.getString(1));
			}
			System.out.println("------------------------------------------");
	//2eme requete		
			while(resultat_rq.next())
			{
				System.out.println(resultat_rq.getString(1));
			}	
			System.out.println("------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

}



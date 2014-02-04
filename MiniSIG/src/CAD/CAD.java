package CAD;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class CAD 
{
	private Connection jdbc;
	private PreparedStatement psmt;
	
	
	public CAD ()
	{
		 try {
			jdbc = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
         psmt = null;
	}
	
	public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("connect.conf");
        props.load(in);
        in.close();
        
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null)
                System.setProperty("jdbc.drivers",drivers);
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        
        return DriverManager.getConnection(url, username, password);
        }
	
	public void m_ActionsRows(String rq_sql)
	{
		try {
			psmt = jdbc.prepareStatement(rq_sql);
			psmt.execute();
			} catch (SQLException e)
			{
			e.printStackTrace();
			}		
	}
	
	public ResultSet m_GetRows(String rq_sql) 
	{
		ResultSet resultat = null;
		try 
		{
			psmt = jdbc.prepareStatement(rq_sql);
			resultat = psmt.executeQuery();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return resultat;
	}
}


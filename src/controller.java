import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class controller {
	
	
	collegamentoDB connessione = new collegamentoDB();

	
	//Sistema di LOG-IN 
	public boolean logIn(String matricola) {
		boolean flag = false;
		
		
		try {
			String queryLogin ="SELECT matricola FROM personale WHERE matricola = '" + matricola + "'";  //crea una queri in postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement();		//roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);		//esequi la query
	
			//se non ci sta nulla, blocca il programma
			
			if(!rsLogin.next()) {
				
				return false;
			}
			
			flag = true;
			
			connessione.getConnection().close();
		} catch(SQLException e) {
			e.getStackTrace();
		}
		
		System.out.println(flag);
		return flag;
	}
	

}

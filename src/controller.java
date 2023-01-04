import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


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
	
	
	//Sistema di inserimento dentro la cartella clinica ---------------------------------------------------------------------------------------------
	public void insertCartClin(String numCartella, String idTart, String nome, String lunghezza, String larghezza, String peso, String specie, String luogoRitr) {
		
		try {

            String query = "INSERT INTO cartella_clinica (specie, lunghezza, larghezza, peso, luogo_ritrovamento, id_cartellaclinica, id_tartaruga, nome_tartaruga) VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

            prepStatementQuery.setString(1,specie);
            prepStatementQuery.setString(2,lunghezza);
            prepStatementQuery.setString(3,larghezza);
            prepStatementQuery.setString(4,peso);
            prepStatementQuery.setString(5,luogoRitr);
            prepStatementQuery.setString(6,numCartella);
            prepStatementQuery.setString(7,idTart);
            prepStatementQuery.setString(8,nome);

            prepStatementQuery.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	//inserimento all'interno di tartaruga ---------------------------------------------------------------------------------------------
	public void insertTarta(String idTart, String nome, String idVasca) {
		
		try {

            String query = "INSERT INTO tartaruga (id_tartaruga, nome, id_vasca, primoaccesso) VALUES (?,?,?,true)";

            PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);
            
            prepStatementQuery.setString(1,idTart);
            prepStatementQuery.setString(2,nome);
            prepStatementQuery.setString(3,idVasca);

            prepStatementQuery.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }		
	}
	
	//inserimento all'interno di vasca ---------------------------------------------------------------------------------------------
	public void insertVasca(String idVasca) {
		
		try {

            String query = "INSERT INTO vasca (id_vasca) VALUES (?)";

            PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);
            
            prepStatementQuery.setString(1,idVasca);

            prepStatementQuery.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }		
	}
	

	//Metodo per inviare al DATABASE la CARTELLA CLINICA ---------------------------------------------------------------------------------------------
	public void invioDB(String numCartella, String idTart, String nome, String lunghezza, String larghezza, String peso, String specie, String luogoRitr) {
		
		if(idTart.isEmpty() || numCartella.isEmpty() || nome.isEmpty() || specie.isEmpty() || lunghezza.isEmpty() || larghezza.isEmpty() || peso.isEmpty())	//DA CONTROLLARE MEGLIO
		{
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		}
		else {		//serve creare prima le tartarughe
			JOptionPane.showMessageDialog(null, "Cartella clinica inviata.");
			insertCartClin(numCartella, idTart/*idTartva messo l'id tartaruga piu avanti*/, nome, lunghezza, larghezza, peso, specie, luogoRitr);
		}
		
	}
	
	
	//Metodo per selezionare le tartarughe ---------------------------------------------------------------------------------------------
	public boolean selectTartaruga(String idTart) {
		boolean flag = false;
		
		try {
			String queryLogin ="SELECT id_tartaruga FROM tartaruga WHERE id_tartaruga = '" + idTart + "'";  //crea una queri in postgress
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

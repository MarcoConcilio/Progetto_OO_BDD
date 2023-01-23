package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CollegamentoDataBase.collegamentoDB;

public class tartarugaDao {
	collegamentoDB connessione = new collegamentoDB();
	
	// inserimento all'interno di tartaruga
	// ---------------------------------------------------------------------------------------------
	public void insertTarta(String idTart, String nome) {

		try {

			String query = "INSERT INTO tartaruga (id_tartaruga, nome, targhetta) VALUES (?,?,true)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, nome);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Metodo per selezionare le tartarughe
	// ---------------------------------------------------------------------------------------------
	public boolean selectTartaruga(String idTart) {
		boolean flag = false;

		try {
			String queryLogin = "SELECT id_tartaruga FROM tartaruga WHERE id_tartaruga = '" + idTart + "'"; // crea una
																											// queri
																											// in
																											// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			// se non ci sta nulla, blocca il programma

			if (!rsLogin.next()) {

				return false;
			}

			flag = true;

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}

		System.out.println(flag);
		return flag;
	}

	// Metodo per displayare l'ID della tartaruga associata e la vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayIDTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT id_tartaruga FROM tartaruga WHERE id_tartaruga = '" + idTart + "'"; // crea una
																											// queri in
																											// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("id_tartaruga");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// update di id_tartaruga dentro tartaruga dopo la riammissione
	// ---------------------------------------------------------------------------------------------
	public void updateIDTartarugaTartaruga(String idTart, String idVecchio) {

		try {

			String query = "UPDATE tartaruga SET id_tartaruga = ? , primoaccesso = false where id_tartaruga = ?";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, idVecchio);
			
			System.out.println(prepStatementQuery);
			
			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

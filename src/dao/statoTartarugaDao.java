package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CollegamentoDataBase.collegamentoDB;

public class statoTartarugaDao {
	collegamentoDB connessione = new collegamentoDB();

	public void insertStatoTartaruga(String testa, String occhi, String naso, String becco, String collo, String pinne,
			String coda) {

		try {

			String query = "INSERT INTO stato_tartaruga (testa, occhi, naso, becco, collo, pinne, coda) VALUES (?,?,?,?,?,?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, testa);
			prepStatementQuery.setString(2, occhi);
			prepStatementQuery.setString(3, naso);
			prepStatementQuery.setString(4, becco);
			prepStatementQuery.setString(5, collo);
			prepStatementQuery.setString(6, pinne);
			prepStatementQuery.setString(7, coda);
		
			
			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String displayTestaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT testa FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("testa");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayOcchiTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT occhi FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("occhi");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayNasoTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT naso FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);
			if (rsLogin.next()) {

				risultato = rsLogin.getString("naso");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayBeccoTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT becco FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("becco");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayCodaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT coda FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("coda");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayPinneTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT pinne FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("pinne");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayColloTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT collo FROM stato_tartaruga as s join cartella_clinica as c on s.id_stato = c.id_stato where c.id_tartaruga = '"+idTart+"'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("collo");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}
}

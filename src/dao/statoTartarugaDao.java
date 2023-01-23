package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CollegamentoDataBase.collegamentoDB;

public class statoTartarugaDao {
	collegamentoDB connessione = new collegamentoDB();

	// Sistema di inserimento dentro lo stato tartaruga
	// ---------------------------------------------------------------------------------------------
	public void insertStatoTartaruga(String testa, String occhi, String naso, String becco, String collo, String pinne,
			String coda, String idStato) {

		try {

			String query = "INSERT INTO stato_tartaruga (testa, occhi, naso, becco, collo, pinne, coda, id_stato) VALUES (?,?,?,?,?,?,?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, testa);
			prepStatementQuery.setString(2, occhi);
			prepStatementQuery.setString(3, naso);
			prepStatementQuery.setString(4, becco);
			prepStatementQuery.setString(5, collo);
			prepStatementQuery.setString(6, pinne);
			prepStatementQuery.setString(7, coda);
			prepStatementQuery.setString(8, idStato);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Metodo per displayare la testa della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayTestaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT testa FROM stato_tartaruga WHERE id_stato = '" + idTart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("testa");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare gli occhi della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayOcchiTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT occhi FROM stato_tartaruga WHERE id_stato = '" + idTart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("occhi");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il naso della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayNasoTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT naso FROM stato_tartaruga WHERE id_stato = '" + idTart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("naso");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il becco della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayBeccoTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT becco FROM stato_tartaruga WHERE id_stato = '" + idTart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("becco");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare la coda della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayCodaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT coda FROM stato_tartaruga WHERE id_stato = '" + idTart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("coda");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare le pinne della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayPinneTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT pinne FROM stato_tartaruga WHERE id_stato = '" + idTart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("pinne");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare le pinne della tartaruga associata

	// ---------------------------------------------------------------------------------------------
	public String displayColloTartaruga(String idCart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT collo FROM stato_tartaruga WHERE id_stato = '" + idCart + "'"; // crea
																										// una
																										// queri
																										// in
																										// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("collo");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

//	 update di id_stato dentro stato_tartaruga dopo la riammissione
//	 ---------------------------------------------------------------------------------------------
//	public void updateIDTartarugaCartClin(String idTart, String idVecchio) {
//
//		try {
//
//			String query = "UPDATE stato_tartaruga SET id_stato = ? where id_stato = ?";
//
//			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);
//
//			prepStatementQuery.setString(1, idTart);
//			prepStatementQuery.setString(2, idVecchio);
//
//			prepStatementQuery.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}

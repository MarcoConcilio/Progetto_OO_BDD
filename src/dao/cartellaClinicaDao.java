package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CollegamentoDataBase.collegamentoDB;

public class cartellaClinicaDao {
	collegamentoDB connessione = new collegamentoDB();

	// Sistema di inserimento dentro la cartella clinica
	// ---------------------------------------------------------------------------------------------
	public void insertCartClin(String numCartella, String idTart, String nome, String lunghezza, String larghezza,
			String peso, String specie, String luogoRitr, Date dataIngr) {

		try {

			String query = "INSERT INTO cartella_clinica (specie, lunghezza, larghezza, peso, luogo_ritrovamento, id_cartellaclinica, id_tartaruga, nome_tartaruga, data_ingresso) VALUES (?,?,?,?,?,?,?,?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, specie);
			prepStatementQuery.setString(2, lunghezza);
			prepStatementQuery.setString(3, larghezza);
			prepStatementQuery.setString(4, peso);
			prepStatementQuery.setString(5, luogoRitr);
			prepStatementQuery.setString(6, numCartella);
			prepStatementQuery.setString(7, idTart);
			prepStatementQuery.setString(8, nome);
			prepStatementQuery.setDate(9, dataIngr);

			
			
			prepStatementQuery.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Metodo per displayare il nome della tartaruga associata e la vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayNomeTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT nome_tartaruga FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea
																														// una
																														// queri
																														// in
																														// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("nome_tartaruga");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il numero cartella della tartaruga associata e la vasca
	// alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayNumeroCartellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT id_cartellaclinica FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea
																															// una
			// queri in
			// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("id_cartellaclinica");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il peso della tartaruga associata e la vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayPesoDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT peso FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea una
																											// queri in
																											// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("peso");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il Larghezza della tartaruga associata e la vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayLarghezzaDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT larghezza FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea
																												// una
			// queri in
			// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("larghezza");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il Larghezza della tartaruga associata e la vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayLunghezzaDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT lunghezza FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea
																												// una
			// queri in
			// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("lunghezza");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare la specie della tartaruga associata e la vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displaySpecieDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT specie FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea
																												// una
			// queri in
			// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("specie");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// Metodo per displayare il luogo di ritrovamento della tartaruga associata e la
	// vasca alla
	// tartaruga
	// ---------------------------------------------------------------------------------------------
	public String displayLuogoRitrovamentoDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT luogo_ritrovamento FROM cartella_clinica WHERE id_tartaruga = '" + idTart + "'"; // crea
			// una
			// queri in
			// postgress
			Statement statementQueryLogin = connessione.getConnection().createStatement(); // roba di background
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin); // esequi la query

			if (rsLogin.next()) {

				risultato = rsLogin.getString("luogo_ritrovamento");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	// update di id_tartaruga dentro cartella_clinica dopo la riammissione
	// ---------------------------------------------------------------------------------------------
	public void updateIDTartarugaCartClin(String idTart, String idTart2, String idVecchio) {

		try {

			String query = "UPDATE cartella_clinica SET id_tartaruga = ? AND id_cartellaclinica = '?' where id_tartaruga = ?";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, idTart2);
			prepStatementQuery.setString(3, idVecchio);
		
			
			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

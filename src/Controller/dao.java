package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import CollegamentoDataBase.collegamentoDB;

public class dao {

	collegamentoDB connessione = new collegamentoDB();

	// Sistema di LOG-IN
	public boolean logIn(String matricola) {
		boolean flag = false;

		try {
			String queryLogin = "SELECT matricola FROM personale WHERE matricola = '" + matricola + "'"; // crea una
																											// queri in
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

	// Sistema di inserimento dentro la cartella clinica
	// ---------------------------------------------------------------------------------------------
	public void insertCartClin(String numCartella, String idTart, String nome, String lunghezza, String larghezza,
			String peso, String specie, String luogoRitr) {

		try {

			String query = "INSERT INTO cartella_clinica (specie, lunghezza, larghezza, peso, luogo_ritrovamento, id_cartellaclinica, id_tartaruga, nome_tartaruga) VALUES (?,?,?,?,?,?,?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, specie);
			prepStatementQuery.setString(2, lunghezza);
			prepStatementQuery.setString(3, larghezza);
			prepStatementQuery.setString(4, peso);
			prepStatementQuery.setString(5, luogoRitr);
			prepStatementQuery.setString(6, numCartella);
			prepStatementQuery.setString(7, idTart);
			prepStatementQuery.setString(8, nome);

			prepStatementQuery.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

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

			prepStatementQuery.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// inserimento all'interno di tartaruga
	// ---------------------------------------------------------------------------------------------
	public void insertTarta(String idTart, String nome) {

		try {

			String query = "INSERT INTO tartaruga (id_tartaruga, nome, primoaccesso) VALUES (?,?,true)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, nome);

			prepStatementQuery.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	 inserimento all'interno di vasca
//	 ---------------------------------------------------------------------------------------------
//	public void insertVasca(String idVasca) {
//
//		try {
//
//			String query = "INSERT INTO vasca (id_vasca) VALUES (?)";
//
//			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);
//
//			prepStatementQuery.setString(1, idVasca);
//
//			prepStatementQuery.executeQuery();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	// inserimento all'interno di vasca
	// ---------------------------------------------------------------------------------------------
	public void insertNumeroVasca(String NumeroVasca, String idVasca) {

		try {

			String query = "INSERT INTO numero_vasca (numerovasca, id_vasca) VALUES (?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, NumeroVasca);
			prepStatementQuery.setString(2, idVasca);

			prepStatementQuery.executeQuery();

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

}

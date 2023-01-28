package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import CollegamentoDataBase.collegamentoDB;

public class cartellaClinicaDao {
	collegamentoDB connessione = new collegamentoDB();

	public void insertCartClin(String numCartella, String idTart, String nome, String lunghezza, String larghezza,
			String peso, String specie, String luogoRitr, Date dataIngr, int idIncrement, String Targhetta) {

		try {

			String query = "INSERT INTO cartella_clinica (specie, lunghezza, larghezza, peso, luogo_ritrovamento, id_cartellaclinica, nome_tartaruga, data_ingresso, id_tartaruga, targhetta, costante) VALUES (?,?,?,?,?,?,?,?,?,?,0)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, specie);
			prepStatementQuery.setString(2, lunghezza);
			prepStatementQuery.setString(3, larghezza);
			prepStatementQuery.setString(4, peso);
			prepStatementQuery.setString(5, luogoRitr);
			prepStatementQuery.setString(6, numCartella);
			prepStatementQuery.setString(7, nome);
			prepStatementQuery.setDate(8, dataIngr);
			prepStatementQuery.setInt(9, idIncrement);
			prepStatementQuery.setString(10, Targhetta);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String displayNumeroCartellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT id_cartellaclinica FROM cartella_clinica WHERE targhetta = '" + idTart + "'"; // crea
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

	public String displayPesoDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT peso FROM cartella_clinica WHERE targhetta = '" + idTart + "'"; // crea una
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

	public String displayLarghezzaDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT larghezza FROM cartella_clinica WHERE targhetta = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("larghezza");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayLunghezzaDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT lunghezza FROM cartella_clinica WHERE targhetta = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);
			if (rsLogin.next()) {

				risultato = rsLogin.getString("lunghezza");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displaySpecieDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT specie FROM cartella_clinica WHERE targhetta = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("specie");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayLuogoRitrovamentoDellaTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT luogo_ritrovamento FROM cartella_clinica WHERE targhetta = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("luogo_ritrovamento");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public void updateIDTartarugaCartClin(String idTart, String idTart2, String idVecchio) {

		try {

			String query = "UPDATE cartella_clinica SET targhetta = ? AND id_cartellaclinica = '?' where targhetta = ?";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, idTart2);
			prepStatementQuery.setString(3, idVecchio);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String selectStatistiche() {
		String risultato = new String();

		try {
			String queryLogin = "select count(cc.data_ingresso) from cartella_clinica as cc join statistiche as s on (cc.costante = s.costante) where cc.data_ingresso between s.data_inizio AND s.data_fine";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString(1);
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

//	public DefaultTableModel statisticheAnnuali() {
//		DefaultTableModel modello = new DefaultTableModel();
//		modello.addColumn("Nome");
//		modello.addColumn("Targhetta");
//		modello.addColumn("Data Ingresso");
//		modello.addColumn("Anno");
//		try {
//			String queryLogin = "select c.nome_tartaruga, c.targhetta, c.data_ingresso, EXTRACT ( YEAR FROM c.data_ingresso) from cartella_clinica as c order by c.data_ingresso";
//
//			Statement statementQueryLogin = connessione.getConnection().createStatement();
//			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);
//
//			while (rsLogin.next()) {
//
//				modello.addRow(new Object[] { rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3),
//						rsLogin.getString(4) });
//			}
//
//			connessione.getConnection().close();
//		} catch (SQLException e) {
//			e.getStackTrace();
//		}
//		return modello;
//	}

	public DefaultTableModel statisticheAnnuali2(String dataIns) {
		DefaultTableModel modello = new DefaultTableModel();
		modello.addColumn("Nome");
		modello.addColumn("Targhetta");
		modello.addColumn("Data Ingresso");
		modello.addColumn("Anno");
		
		try {
		
			String queryLogin = "select c.nome_tartaruga, c.targhetta, c.data_ingresso, EXTRACT ( YEAR FROM c.data_ingresso) from cartella_clinica as c join statistiche as s on (c.costante = s.costante) where c.data_ingresso between '"+dataIns+"-01-01' AND '"+dataIns+"-12-31' order by c.data_ingresso";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);
			
			while (rsLogin.next()) {

				modello.addRow(new Object[] { rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3),
						rsLogin.getString(4) });
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return modello;
	}
	
	public DefaultTableModel statisticheMensili() {
		DefaultTableModel modello = new DefaultTableModel();
		modello.addColumn("Nome");
		modello.addColumn("Targhetta");
		modello.addColumn("Data Ingresso");
		modello.addColumn("Mese");
		try {
			String queryLogin = "select c.nome_tartaruga, c.targhetta, c.data_ingresso, EXTRACT ( MONTH FROM c.data_ingresso) from cartella_clinica as c order by c.data_ingresso";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			while (rsLogin.next()) {

				modello.addRow(new Object[] { rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3),
						rsLogin.getString(4) });
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return modello;
	}
	
	public DefaultTableModel statisticheMensili2(String mese) {
		DefaultTableModel modello = new DefaultTableModel();
		modello.addColumn("Nome");
		modello.addColumn("Targhetta");
		modello.addColumn("Data Ingresso");
		modello.addColumn("Mese");
		try {
			String queryLogin = "select c.nome_tartaruga, c.targhetta, c.data_ingresso, EXTRACT ( MONTH FROM c.data_ingresso) from cartella_clinica as c join statistiche as s on (c.costante = s.costante) where c.data_ingresso between '2020-"+mese+"-01 AND 2030-"+mese+"-31' order by c.data_ingresso";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			while (rsLogin.next()) {

				modello.addRow(new Object[] { rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3),
						rsLogin.getString(4) });
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return modello;
	}


}

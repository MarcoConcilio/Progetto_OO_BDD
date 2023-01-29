package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import CollegamentoDataBase.collegamentoDB;

public class tartarugaDao {
	collegamentoDB connessione = new collegamentoDB();

	public void insertTarta(String idTart, String nome) {

		try {

			String query = "INSERT INTO tartaruga (targhetta, nome) VALUES (?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, nome);

			prepStatementQuery.executeUpdate();

			JOptionPane.showMessageDialog(null, "Tartaruga aggiunta correttamente.");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Targhetta gia' presente!");
		}
	}

	public boolean selectTartaruga(String idTart) {
		boolean flag = false;

		try {
			String queryLogin = "SELECT targhetta FROM tartaruga WHERE id_tartaruga = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

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
	
	public String selectTartarugaStringa(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT targhetta FROM tartaruga WHERE id_tartaruga = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("targhetta");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayIDTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT targhetta FROM tartaruga WHERE id_tartaruga = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("targhetta");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public String displayNomeTartaruga(String idTart) {
		String risultato = new String();

		try {
			String queryLogin = "SELECT nome FROM tartaruga WHERE id_tartaruga = '" + idTart + "'";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = rsLogin.getString("nome");
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public int selectUltimoIDTartaruga() {
		collegamentoDB connessione1 = new collegamentoDB();
		int risultato = -1;

		try {
			String queryLogin = "SELECT MAX(id_tartaruga) FROM tartaruga";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			if (rsLogin.next()) {

				risultato = Integer.valueOf(rsLogin.getString(1));
			}

			connessione1.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return risultato;
	}

	public DefaultTableModel sceltaTartaruga() {
		DefaultTableModel modello = new DefaultTableModel();
		modello.addColumn("Nome");
		modello.addColumn("Targhetta");
		modello.addColumn("ID interno");

		try {
			String queryLogin = "select t.nome, t.targhetta, t.id_tartaruga from tartaruga as t order by t.id_tartaruga";

			Statement statementQueryLogin = connessione.getConnection().createStatement();
			ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);

			while (rsLogin.next()) {

				modello.addRow(new Object[] { rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3) });
			}

			connessione.getConnection().close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return modello;
	}
}

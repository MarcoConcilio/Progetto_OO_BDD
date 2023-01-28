package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CollegamentoDataBase.collegamentoDB;

public class personaleDao {
	collegamentoDB connessione = new collegamentoDB();

	public boolean logIn(String matricola) {
		boolean flag = false;

		try {
			String queryLogin = "SELECT matricola FROM personale WHERE matricola = '" + matricola + "'";

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

}

package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import CollegamentoDataBase.collegamentoDB;

public class vascaDao {
	collegamentoDB connessione = new collegamentoDB();

	public boolean insertNumeroVasca(String NumeroVasca, String idVasca) {
		boolean flag = true;
		try {

			String query = "INSERT INTO numero_vasca (numerovasca, id_vasca) VALUES (?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, NumeroVasca);
			prepStatementQuery.setString(2, idVasca);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}
}

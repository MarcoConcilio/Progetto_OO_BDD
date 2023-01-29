package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import CollegamentoDataBase.collegamentoDB;

public class vascaDao {
	collegamentoDB connessione = new collegamentoDB();

	public void insertNumeroVasca(String NumeroVasca, String idVasca) {

		try {

			String query = "INSERT INTO numero_vasca (numerovasca, id_vasca) VALUES (?,?)";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, NumeroVasca);
			prepStatementQuery.setString(2, idVasca);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

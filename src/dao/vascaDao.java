package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import CollegamentoDataBase.collegamentoDB;

public class vascaDao {
	collegamentoDB connessione = new collegamentoDB();

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

	// update di id_tartaruga dentro vasca (anche dopo riammissione)
	// ---------------------------------------------------------------------------------------------
	public void updateIDTartarugaVasca(String idTart) {

		try {

			String query = "UPDATE numero_vasca SET id_tartaruga = ?";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);

			prepStatementQuery.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update di id_tartaruga dentro vasca (anche dopo riammissione)
	// ---------------------------------------------------------------------------------------------
	public void updateIDTartarugaVasca(String idTart, String idVecchio) {

		try {

			String query = "UPDATE numero_vasca SET id_tartaruga = ? where id_tartaruga = ?";

			PreparedStatement prepStatementQuery = connessione.getConnection().prepareStatement(query);

			prepStatementQuery.setString(1, idTart);
			prepStatementQuery.setString(2, idVecchio);

			prepStatementQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

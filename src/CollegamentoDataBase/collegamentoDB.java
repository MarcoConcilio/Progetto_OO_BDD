package CollegamentoDataBase;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class collegamentoDB {
	private static collegamentoDB dbcon = null;

	private Connection conn = null;

	public collegamentoDB() {
	}

	public static collegamentoDB getDBConnection() {
		if (dbcon == null) {
			dbcon = new collegamentoDB();
		}

		return dbcon;
	}

	public Connection getConnection() {
		String pwd = "";
		BufferedReader b = null;
		try {
			if (conn == null || conn.isClosed()) {
				try {
					b = new BufferedReader(
							new FileReader(new File("C:\\Users\\gaeco\\OneDrive\\Desktop\\passwordDB.txt")));
					pwd = b.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}

				Class.forName("org.postgresql.Driver");

				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gestione_tartarughe_marine",
						"postgres", "admin");
			}
		} catch (SQLException | ClassNotFoundException throwables) {
			throwables.printStackTrace();
		}

		return conn;
	}

}
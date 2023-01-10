package CollegamentoDataBase;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class collegamentoDB
{
    // istanza statica e privata della istanza di questa classe
    private static collegamentoDB dbcon = null;
    // istanza privata della connessione ad SQL
    private Connection conn = null;

    // costruttore private
    public collegamentoDB(){}

    // metodo pubblico per ottenere una istanza della classe privata
    public static collegamentoDB getDBConnection()
    {   // se la classe connessione è nulla, la crea
        if (dbcon == null) {
            dbcon = new collegamentoDB();
        }
        // e la restituisce
        return dbcon;
    }

    // metodo pubblico per ottenere la connessione
    public Connection getConnection()
    {
        String pwd = "";
        BufferedReader b = null;
        try
        {   // se la connessione non esiste oppure è stata chiusa
            if(conn==null || conn.isClosed())
            {   //legge la pwd dal file
                try {
                	b = new BufferedReader(new FileReader(new File("C:\\Users\\gaeco\\OneDrive\\Desktop\\passwordDB.txt")));
                pwd = b.readLine();
                } catch (IOException e) {
                	e.printStackTrace();
                }
            	
                // registra il driver
                Class.forName("org.postgresql.Driver");
                // chiama il DriverManager e chiedi la connessione
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gestione_tartarughe_marine", "postgres", "admin");
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }

}
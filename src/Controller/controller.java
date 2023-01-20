package Controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import dao.cartellaClinicaDao;
import dao.statoTartarugaDao;

public class controller {

	cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();
	statoTartarugaDao stato_tartarugaDao = new statoTartarugaDao();

	// Metodo per controllare se la cartella clinica è vuota 
	// ---------------------------------------------------------------------------------------------
	public void invioDB(String numCartella, String idTart, String nome, String lunghezza, String larghezza, String peso,
			String specie, String luogoRitr, Date dataIns) {

		if (idTart.isEmpty() || numCartella.isEmpty() || nome.isEmpty() || specie.isEmpty() || lunghezza.isEmpty()
				|| larghezza.isEmpty() || peso.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		} else { // serve creare prima le tartarughe

			cartellaClinicaDao.insertCartClin(numCartella, idTart, nome, lunghezza, larghezza, peso, specie, luogoRitr,
					dataIns);
		}

	}

	// Metodo per controllare se lo stato tartaruga è vuto
	// ---------------------------------------------------------------------------------------------
	public void invioDBSTATO(String testa, String occhi, String naso, String becco, String collo, String pinne,
			String coda, String idStato) {

		if (testa.isEmpty() || occhi.isEmpty() || naso.isEmpty() || becco.isEmpty() || collo.isEmpty()
				|| pinne.isEmpty() || coda.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		} else {
			JOptionPane.showMessageDialog(null, "Cartella clinica inviata.");
			stato_tartarugaDao.insertStatoTartaruga(testa, occhi, naso, becco, collo, pinne, coda, idStato);
		}
	}

	// metodo per inviare le cose a CARTELLA CLINICA
	// ---------------------------------------------------------------------------------------------
	public void controlloCC(String numCartella, String idTart, String nome, String lunghezza, String larghezza,
			String peso, String specie, String luogoRitr, String dataIns) {

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date;
			date = sdf1.parse(dataIns);
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

			invioDB(numCartella, idTart, nome, lunghezza, larghezza, peso, specie, luogoRitr, sqlStartDate);

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

package Controller;

import javax.swing.JOptionPane;

public class controller {

	dao dao = new dao();

	// Metodo per inviare al DATABASE la CARTELLA CLINICA
	// ---------------------------------------------------------------------------------------------
	public void invioDB(String numCartella, String idTart, String nome, String lunghezza, String larghezza, String peso,
			String specie, String luogoRitr) {

		if (idTart.isEmpty() || numCartella.isEmpty() || nome.isEmpty() || specie.isEmpty() || lunghezza.isEmpty()
				|| larghezza.isEmpty() || peso.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		} else { // serve creare prima le tartarughe

			dao.insertCartClin(numCartella, idTart, nome, lunghezza,
					larghezza, peso, specie, luogoRitr);
		}

	}

	// Metodo per inviare al DATABASE lo STATO TARTARUGA
	// ---------------------------------------------------------------------------------------------
	public void invioDBSTATO(String testa, String occhi, String naso, String becco, String collo, String pinne,
			String coda, String idStato) {

		if (testa.isEmpty() || occhi.isEmpty() || naso.isEmpty() || becco.isEmpty() || collo.isEmpty()
				|| pinne.isEmpty() || coda.isEmpty()) 
		{
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		} else {
			JOptionPane.showMessageDialog(null, "Cartella clinica inviata.");
			dao.insertStatoTartaruga(testa, occhi, naso, becco, collo, pinne, coda, idStato);
		}
	}

}

package Controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.finestraAltriLavoratori;
import GUI.finestraCartellaClinica1;
import GUI.finestraLOGIN;
import GUI.finestraRiammPrimoacc;
import GUI.primaFinestraMedico;
import dao.cartellaClinicaDao;
import dao.personaleDao;
import dao.statoTartarugaDao;
import dao.tartarugaDao;
import dao.vascaDao;

public class controller {

	cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();
	statoTartarugaDao stato_tartarugaDao = new statoTartarugaDao();
	vascaDao vascaDao = new vascaDao();
	tartarugaDao tartarugaDao = new tartarugaDao();

	public void invioDB(String numCartella, String idTart, String nome, String lunghezza, String larghezza, String peso,
			String specie, String luogoRitr, Date dataIns, int idAutoincrement, String Targhetta) {

		if (idTart.isEmpty() || numCartella.isEmpty() || nome.isEmpty() || specie.isEmpty() || lunghezza.isEmpty()
				|| larghezza.isEmpty() || peso.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		} else {

			cartellaClinicaDao.insertCartClin(numCartella, idTart, nome, lunghezza, larghezza, peso, specie, luogoRitr,
					dataIns, idAutoincrement, Targhetta);
		}

	}

	public void invioDBSTATO(String testa, String occhi, String naso, String becco, String collo, String pinne,
			String coda, String cc) {

		if (testa.isEmpty() || occhi.isEmpty() || naso.isEmpty() || becco.isEmpty() || collo.isEmpty()
				|| pinne.isEmpty() || coda.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
		} else {
			stato_tartarugaDao.insertStatoTartaruga(testa, occhi, naso, becco, collo, pinne, coda);
		}
	}

	public void controlloCC(String numCartella, String idTart, String nome, String lunghezza, String larghezza,
			String peso, String specie, String luogoRitr, String dataIns, int idAutoincrement, String Targhetta) {

		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date;
			date = sdf1.parse(dataIns);
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

			invioDB(numCartella, idTart, nome, lunghezza, larghezza, peso, specie, luogoRitr, sqlStartDate,
					idAutoincrement, Targhetta);

		} catch (ParseException e1) {
			e1.printStackTrace();
		}

	}

	public void invioTartar(String vasca, String nome, String id) {
		if (vasca.isEmpty() && nome.isEmpty() && id.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Inserisci i parametri.");
		} else {
			vascaDao.insertNumeroVasca(vasca, vasca);
			tartarugaDao.insertTarta(nome, id);
		}
	}

	public void cambioPanel(JPanel pannello1, JPanel pannello2) {
		pannello1.setVisible(false);
		pannello2.setVisible(true);
	}

	public void cambioFinestraLOG(primaFinestraMedico finestra2, finestraAltriLavoratori finestraAltri, String stringa,
			JTextField textUsername) {
		personaleDao dao = new personaleDao();
		finestraLOGIN finestra = new finestraLOGIN();

		stringa = textUsername.getText();
		if (dao.logIn(textUsername.getText())) {
			if (stringa.charAt(0) == 'M') {
				finestra.setVisible(false);
				finestra2.setVisible(true);
			} else {
				finestra.setVisible(false);
				finestraAltri.setVisible(true);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Credenziali errate.");
		}
	}

	public void inviaAltriLavoratori(controller controller, JTextField inserimentoVasca, JTextField textNome,
			JTextField textId, JPanel aggPannello, JPanel primoPannello) {
		controller.invioTartar(inserimentoVasca.getText(), textNome.getText(), textId.getText());
		aggPannello.setVisible(false);
		primoPannello.setVisible(true);
		inserimentoVasca.setText(null);
		textNome.setText(null);
		textId.setText(null);
	}

	public void displayTurtlesCC(JTextField textVisualizzaTarta, JTextField textFieldVisual, JPanel primoPannello,
			JPanel secondoPannello, JTextField dispNomeTart, JTextField dispIdTart, JTextField dispIdCartClinica,
			JTextField dispPeso, JTextField dispLarghezza, JTextField dispLunghezza, JTextField dispSpecie,
			JTextField dispLuogoRitrova) {
		tartarugaDao tartarugaDao = new tartarugaDao();
		cartellaClinicaDao clinicaDao = new cartellaClinicaDao();

		if (tartarugaDao.selectTartaruga(textVisualizzaTarta.getText())) {

			textFieldVisual.setText(textVisualizzaTarta.getText());
			primoPannello.setVisible(false);
			secondoPannello.setVisible(true);
			dispNomeTart.setText(tartarugaDao.displayNomeTartaruga(textFieldVisual.getText()));
			dispIdTart.setText(tartarugaDao.displayIDTartaruga(textFieldVisual.getText()));
			dispIdCartClinica.setText(clinicaDao.displayNumeroCartellaTartaruga(textFieldVisual.getText()));
			dispPeso.setText(clinicaDao.displayPesoDellaTartaruga(textFieldVisual.getText()));
			dispLarghezza.setText(clinicaDao.displayLarghezzaDellaTartaruga(textFieldVisual.getText()));
			dispLunghezza.setText(clinicaDao.displayLunghezzaDellaTartaruga(textFieldVisual.getText()));
			dispSpecie.setText(clinicaDao.displaySpecieDellaTartaruga(textFieldVisual.getText()));
			dispLuogoRitrova.setText(clinicaDao.displayLuogoRitrovamentoDellaTartaruga(textFieldVisual.getText()));
			textVisualizzaTarta.setText(null);

		} else {
			JOptionPane.showMessageDialog(null, "Nessun id trovato.");
		}
	}

	public void displayTurtlesCC(JTextField dispNomeTart, JTextField dispIdTart, JTextField dispIdCartClinica,
			JTextField dispPeso, JTextField dispLarghezza, JTextField dispLunghezza, JTextField dispSpecie,
			JTextField dispLuogoRitrova, JTextField textFieldVisual) {
		tartarugaDao tartarugaDao = new tartarugaDao();
		cartellaClinicaDao clinicaDao = new cartellaClinicaDao();

		dispNomeTart.setText(tartarugaDao.displayNomeTartaruga(textFieldVisual.getText()));
		dispIdTart.setText(tartarugaDao.displayIDTartaruga(textFieldVisual.getText()));
		dispIdCartClinica.setText(clinicaDao.displayNumeroCartellaTartaruga(textFieldVisual.getText()));
		dispPeso.setText(clinicaDao.displayPesoDellaTartaruga(textFieldVisual.getText()));
		dispLarghezza.setText(clinicaDao.displayLarghezzaDellaTartaruga(textFieldVisual.getText()));
		dispLunghezza.setText(clinicaDao.displayLunghezzaDellaTartaruga(textFieldVisual.getText()));
		dispSpecie.setText(clinicaDao.displaySpecieDellaTartaruga(textFieldVisual.getText()));
		dispLuogoRitrova.setText(clinicaDao.displayLuogoRitrovamentoDellaTartaruga(textFieldVisual.getText()));
	}

	public void displayTurtlesSTATO(JPanel secondoPannello, JPanel terzoPannello, JTextField dispTesta,
			JTextField dispOcchi, JTextField dispNaso, JTextField dispBecco, JTextField dispCoda, JTextField dispPinne,
			JTextField dispCollo, JTextField textFieldVisual) {
		secondoPannello.setVisible(false);
		terzoPannello.setVisible(true);

		statoTartarugaDao statoTartarugaDao = new statoTartarugaDao();

		dispTesta.setText(statoTartarugaDao.displayTestaTartaruga(textFieldVisual.getText()));
		dispOcchi.setText(statoTartarugaDao.displayOcchiTartaruga(textFieldVisual.getText()));
		dispNaso.setText(statoTartarugaDao.displayNasoTartaruga(textFieldVisual.getText()));
		dispBecco.setText(statoTartarugaDao.displayBeccoTartaruga(textFieldVisual.getText()));
		dispCoda.setText(statoTartarugaDao.displayCodaTartaruga(textFieldVisual.getText()));
		dispPinne.setText(statoTartarugaDao.displayPinneTartaruga(textFieldVisual.getText()));
		dispCollo.setText(statoTartarugaDao.displayColloTartaruga(textFieldVisual.getText()));
	}

	public void inviaCC(controller controller, String stringa, JTextField textNumCart, JTextField textIdTartaruga,
			JTextField textNome, JTextField textTesta, JTextField textOcchi, JTextField textNaso, JTextField textBecco,
			JTextField textCollo, JTextField textPinne, JTextField textCoda, JTextField textLunghezza,
			JTextField textLarghezza, JTextField textPeso, JTextField textSpecie, JTextField textLuogoRitrovamento,
			JTextField textDataIns, JPanel pannelloSecondo, JPanel pannelloPrimo) {
		tartarugaDao tartarugaDao = new tartarugaDao();

		stringa = textNumCart.getText();
		tartarugaDao.insertTarta(textIdTartaruga.getText(), textNome.getText());
		controller.invioDBSTATO(textTesta.getText(), textOcchi.getText(), textNaso.getText(), textBecco.getText(),
				textCollo.getText(), textPinne.getText(), textCoda.getText(), stringa);

		controller.controlloCC(textNumCart.getText(), textIdTartaruga.getText(), textNome.getText(),
				textLunghezza.getText(), textLarghezza.getText(), textPeso.getText(), textSpecie.getText(),
				textLuogoRitrovamento.getText(), textDataIns.getText(), tartarugaDao.selectUltimoIDTartaruga(),
				textIdTartaruga.getText());

		textTesta.setText(null);
		textOcchi.setText(null);
		textNaso.setText(null);
		textBecco.setText(null);
		textCollo.setText(null);
		textPinne.setText(null);
		textCoda.setText(null);
		textIdTartaruga.setText(null);
		textNome.setText(null);
		textNumCart.setText(null);
		textLunghezza.setText(null);
		textLarghezza.setText(null);
		textPeso.setText(null);
		textSpecie.setText(null);
		textLuogoRitrovamento.setText(null);
		pannelloSecondo.setVisible(false);
		pannelloPrimo.setVisible(true);
		textDataIns.setText(null);
	}

	public void controlloStringaVuota(JTextField textIdTartaruga, JTextField textNome, JTextField textSpecie,
			JTextField textNumCart, JTextField textPeso, JTextField textLarghezza, JTextField textLuogoRitrovamento,
			JTextField textLunghezza, JPanel pannelloPrimo, JPanel pannelloSecondo) {
		if (textIdTartaruga.getText().equals("") || textNome.getText().equals("") || textSpecie.getText().equals("")
				|| textNumCart.getText().equals("") || textPeso.getText().equals("")
				|| textLarghezza.getText().equals("") || textLuogoRitrovamento.getText().equals("")
				|| textLunghezza.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Devi inserire tutti i parametri.");
		} else {

			pannelloPrimo.setVisible(false);
			pannelloSecondo.setVisible(true);
		}
	}

	public void insertNumVasca(finestraCartellaClinica1 cartmedica1, JTextField inserimentoVasca) {
		finestraRiammPrimoacc fnestra = new finestraRiammPrimoacc();
		vascaDao vascaDao = new vascaDao();

		if (vascaDao.insertNumeroVasca(inserimentoVasca.getText(), inserimentoVasca.getText())) {
			fnestra.setVisible(false);
			cartmedica1.setVisible(true);

			inserimentoVasca.setText(null);
		}
		else {
			JOptionPane.showMessageDialog(null, "Il numero della vasca deve essere compreso tra 1 e 5.");
		}
	}

	public void textFieldFalseTrue(JLabel SCRITTURA3, JLabel SCRITTURA4, JLabel SCRITTURA5, JLabel successivo,
			JLabel lblSCRITTURA, JButton btnNewButton_1, JLabel lblSCRITTURA2, JTextField textFieldRicerca,
			JTextField inserimentoVasca) {
		textFieldRicerca.setVisible(false);
		lblSCRITTURA.setVisible(false);
		lblSCRITTURA2.setVisible(false);
		btnNewButton_1.setVisible(false);

		SCRITTURA3.setVisible(true);
		SCRITTURA4.setVisible(true);
		SCRITTURA5.setVisible(true);
		successivo.setVisible(true);
		inserimentoVasca.setVisible(true);
	}

	public void textFieldFalseTrue2(JLabel SCRITTURA3, JLabel SCRITTURA4, JLabel SCRITTURA5, JLabel successivo,
			JLabel lblSCRITTURA, JButton btnNewButton_1, JLabel lblSCRITTURA2, JTextField inserimentoVasca,
			JTextField textFieldRicerca) {
		SCRITTURA3.setVisible(false);
		SCRITTURA4.setVisible(false);
		SCRITTURA5.setVisible(false);
		successivo.setVisible(false);
		inserimentoVasca.setVisible(false);

		textFieldRicerca.setVisible(true);
		lblSCRITTURA.setVisible(true);
		lblSCRITTURA2.setVisible(true);
		btnNewButton_1.setVisible(true);
	}

	public void dispPrimaMedico(JTextField textVisualizzaTarta, JTextField textFieldVisual, JPanel primoPannello,
			JPanel secondoPannello, JTextField dispNomeTart, JTextField dispIdTart, JTextField dispIdCartClinica,
			JTextField dispPeso, JTextField dispLarghezza, JTextField dispLunghezza, JTextField dispSpecie,
			JTextField dispLuogoRitrova, JTextField textData) {
		tartarugaDao tartarugaDao = new tartarugaDao();
		cartellaClinicaDao clinicaDao = new cartellaClinicaDao();

		if (tartarugaDao.selectTartaruga(textVisualizzaTarta.getText())) {

			textFieldVisual.setText(textVisualizzaTarta.getText());
			primoPannello.setVisible(false);
			secondoPannello.setVisible(true);
			dispNomeTart.setText(tartarugaDao.displayNomeTartaruga(textFieldVisual.getText()));
			dispIdTart.setText(tartarugaDao.displayIDTartaruga(textFieldVisual.getText()));
			dispIdCartClinica.setText(clinicaDao.displayNumeroCartellaTartaruga(textFieldVisual.getText()));
			dispPeso.setText(clinicaDao.displayPesoDellaTartaruga(textFieldVisual.getText()));
			dispLarghezza.setText(clinicaDao.displayLarghezzaDellaTartaruga(textFieldVisual.getText()));
			dispLunghezza.setText(clinicaDao.displayLunghezzaDellaTartaruga(textFieldVisual.getText()));
			dispSpecie.setText(clinicaDao.displaySpecieDellaTartaruga(textFieldVisual.getText()));
			dispLuogoRitrova.setText(clinicaDao.displayLuogoRitrovamentoDellaTartaruga(textFieldVisual.getText()));
			textData.setText(clinicaDao.displayData(textFieldVisual.getText()));
			textVisualizzaTarta.setText(null);

		} else {
			JOptionPane.showMessageDialog(null, "Nessun id trovato.");
		}
	}

	public void displayTurtlesSTATO(JTextField dispTesta, JTextField dispOcchi, JTextField dispNaso,
			JTextField dispBecco, JTextField dispCoda, JTextField dispPinne, JTextField dispCollo,
			JTextField textFieldVisual) {
		statoTartarugaDao statoTartarugaDao = new statoTartarugaDao();

		dispTesta.setText(statoTartarugaDao.displayTestaTartaruga(textFieldVisual.getText()));
		dispOcchi.setText(statoTartarugaDao.displayOcchiTartaruga(textFieldVisual.getText()));
		dispNaso.setText(statoTartarugaDao.displayNasoTartaruga(textFieldVisual.getText()));
		dispBecco.setText(statoTartarugaDao.displayBeccoTartaruga(textFieldVisual.getText()));
		dispCoda.setText(statoTartarugaDao.displayCodaTartaruga(textFieldVisual.getText()));
		dispPinne.setText(statoTartarugaDao.displayPinneTartaruga(textFieldVisual.getText()));
		dispCollo.setText(statoTartarugaDao.displayColloTartaruga(textFieldVisual.getText()));
	}

	public void setTipoIntervallo(JComboBox comboBox, JComboBox boxAnni, JLabel lblNewLabel_27, JButton btnNewButton_6,
			JComboBox comboMesi, JLabel lblNewLabel_26, JButton btnNewButton_5) {
		if (comboBox.getSelectedIndex() == 0) {

			lblNewLabel_27.setVisible(false);
			btnNewButton_6.setVisible(false);
			comboMesi.setVisible(false);

			lblNewLabel_26.setVisible(true);
			boxAnni.setVisible(true);
			btnNewButton_5.setVisible(true);

		} else {
			lblNewLabel_26.setVisible(false);
			boxAnni.setVisible(false);
			btnNewButton_5.setVisible(false);

			lblNewLabel_27.setVisible(true);
			btnNewButton_6.setVisible(true);
			comboMesi.setVisible(true);
		}
	}

	public void setInvariati(JTextField textFieldRicerca, JPanel pannelloPrimo, JPanel pannelloSecondo,
			JTextField textNome, JTextField textTarghetta, JTextField textSpecie) {
		tartarugaDao tartarugaDao = new tartarugaDao();
		cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();

		if (tartarugaDao.selectTartaruga(textFieldRicerca.getText())) {
			pannelloPrimo.setVisible(false);
			pannelloSecondo.setVisible(true);

			textNome.setText(tartarugaDao.displayNomeTartaruga(textFieldRicerca.getText()));
			textTarghetta.setText(tartarugaDao.selectTartarugaStringa(textFieldRicerca.getText()));
			textSpecie.setText(cartellaClinicaDao.displaySpecieDellaTartaruga(textFieldRicerca.getText()));
		}
	}

}

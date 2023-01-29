package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import Controller.*;
import dao.cartellaClinicaDao;
import dao.statoTartarugaDao;
import dao.tartarugaDao;
import dao.vascaDao;

public class finestraRiammPrimoacc extends JFrame {

	private JPanel pannelloPrimo, pannelloSecondo, backGroundPanel;
	public primaFinestraMedico finestraMezzo;
	private JTextField textFieldRicerca;
	private JTextField inserimentoVasca;
	private String stringa;
	private JTextField textNome;
	private JTextField textTarghetta;
	private JTextField textSpecie;
	private JTextField textCartella;
	private JTextField textPeso;
	private JTextField textLarghezza;
	private JTextField textLunghezza;
	private JTextField textLuogo;
	private JTextField textData;
	private JTextField textTesta;
	private JTextField textNaso;
	private JTextField textOcchi;
	private JTextField textBecco;
	private JTextField textCoda;
	private JTextField textPinne;
	private JTextField textCollo;

	/**
	 * Create the frame.
	 */
	public finestraRiammPrimoacc() {

		finestraCartellaClinica1 cartmedica1 = new finestraCartellaClinica1(this);
		controller controller = new controller();

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 300, 526, 390);
		backGroundPanel = new JPanel();
		backGroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backGroundPanel);
		backGroundPanel.setLayout(new CardLayout(0, 0));

		pannelloPrimo = new JPanel();
		pannelloPrimo.setBackground(new Color(165, 206, 218));
		pannelloPrimo.setBorder(new EmptyBorder(5, 5, 5, 5));

		pannelloSecondo = new JPanel();
		pannelloSecondo.setForeground(new Color(0, 0, 0));
		pannelloSecondo.setBackground(new Color(165, 206, 218));
		pannelloSecondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		backGroundPanel.add(pannelloPrimo);
		backGroundPanel.add(pannelloSecondo);
		pannelloPrimo.setLayout(null);
		pannelloSecondo.setLayout(null);

		JButton btnNewButton_2 = new JButton("Indietro");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(pannelloSecondo, pannelloPrimo);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 11, 89, 23);
		pannelloSecondo.add(btnNewButton_2);

		JLabel lblNewLabel_9 = new JLabel("Aggiornare la cartella clinica:");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(119, 3, 252, 32);
		pannelloSecondo.add(lblNewLabel_9);

		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNome.setBounds(34, 51, 41, 14);
		pannelloSecondo.add(labelNome);

		textNome = new JTextField();
		textNome.setBounds(76, 50, 86, 20);
		pannelloSecondo.add(textNome);
		textNome.setColumns(10);
		textNome.setEditable(false);

		JLabel labelTarghetta = new JLabel("Targhetta:");
		labelTarghetta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTarghetta.setBounds(10, 76, 65, 23);
		pannelloSecondo.add(labelTarghetta);

		textTarghetta = new JTextField();
		textTarghetta.setText("");
		textTarghetta.setBounds(76, 79, 86, 20);
		pannelloSecondo.add(textTarghetta);
		textTarghetta.setColumns(10);
		textTarghetta.setEditable(false);

		JLabel labelSpecie = new JLabel("Specie:");
		labelSpecie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelSpecie.setBounds(29, 108, 46, 20);
		pannelloSecondo.add(labelSpecie);

		textSpecie = new JTextField();
		textSpecie.setText("");
		textSpecie.setColumns(10);
		textSpecie.setBounds(76, 110, 86, 20);
		pannelloSecondo.add(textSpecie);
		textSpecie.setEditable(false);

		JLabel labelCartella = new JLabel("Numero cartella:");
		labelCartella.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelCartella.setBounds(203, 51, 100, 14);
		pannelloSecondo.add(labelCartella);

		textCartella = new JTextField();
		textCartella.setColumns(10);
		textCartella.setBounds(304, 50, 86, 20);
		pannelloSecondo.add(textCartella);

		JLabel labelPeso = new JLabel("Peso:");
		labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPeso.setBounds(269, 80, 34, 14);
		pannelloSecondo.add(labelPeso);

		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(304, 79, 86, 20);
		pannelloSecondo.add(textPeso);

		JLabel labelLarghezza = new JLabel("Larghezza:");
		labelLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelLarghezza.setBounds(237, 110, 66, 17);
		pannelloSecondo.add(labelLarghezza);

		JLabel labelLunghezza = new JLabel("Lunghezza:");
		labelLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelLunghezza.setBounds(7, 139, 70, 23);
		pannelloSecondo.add(labelLunghezza);

		textLarghezza = new JTextField();
		textLarghezza.setColumns(10);
		textLarghezza.setBounds(304, 110, 86, 20);
		pannelloSecondo.add(textLarghezza);

		textLunghezza = new JTextField();
		textLunghezza.setText("");
		textLunghezza.setColumns(10);
		textLunghezza.setBounds(76, 141, 86, 20);
		pannelloSecondo.add(textLunghezza);

		JLabel labelLuogo = new JLabel("Luogo ritrovamento:");
		labelLuogo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelLuogo.setBounds(94, 172, 133, 24);
		pannelloSecondo.add(labelLuogo);

		JLabel labelData = new JLabel("Data accesso:");
		labelData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelData.setBounds(216, 143, 89, 14);
		pannelloSecondo.add(labelData);

		textLuogo = new JTextField();
		textLuogo.setColumns(10);
		textLuogo.setBounds(226, 176, 145, 20);
		pannelloSecondo.add(textLuogo);

		textData = new JTextField();
		textData.setColumns(10);
		textData.setBounds(304, 142, 86, 20);
		pannelloSecondo.add(textData);

		JLabel labelTesta = new JLabel("Testa:");
		labelTesta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTesta.setBounds(34, 221, 41, 14);
		pannelloSecondo.add(labelTesta);

		JLabel labelNaso = new JLabel("Naso:");
		labelNaso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNaso.setBounds(34, 252, 41, 14);
		pannelloSecondo.add(labelNaso);

		JLabel labelOcchi = new JLabel("Occhi:");
		labelOcchi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelOcchi.setBounds(34, 286, 41, 14);
		pannelloSecondo.add(labelOcchi);

		JLabel labelBecco = new JLabel("Becco:");
		labelBecco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelBecco.setBounds(167, 221, 46, 14);
		pannelloSecondo.add(labelBecco);

		JLabel labelCoda = new JLabel("Coda:");
		labelCoda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelCoda.setBounds(172, 252, 41, 14);
		pannelloSecondo.add(labelCoda);

		JLabel labelPinne = new JLabel("Pinne:");
		labelPinne.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPinne.setBounds(172, 286, 41, 14);
		pannelloSecondo.add(labelPinne);

		JLabel labelCollo = new JLabel("Collo:");
		labelCollo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelCollo.setBounds(327, 221, 41, 14);
		pannelloSecondo.add(labelCollo);

		textTesta = new JTextField();
		textTesta.setColumns(10);
		textTesta.setBounds(76, 220, 86, 20);
		pannelloSecondo.add(textTesta);

		textNaso = new JTextField();
		textNaso.setColumns(10);
		textNaso.setBounds(76, 251, 86, 20);
		pannelloSecondo.add(textNaso);

		textOcchi = new JTextField();
		textOcchi.setColumns(10);
		textOcchi.setBounds(76, 285, 86, 20);
		pannelloSecondo.add(textOcchi);

		textBecco = new JTextField();
		textBecco.setColumns(10);
		textBecco.setBounds(216, 220, 86, 20);
		pannelloSecondo.add(textBecco);

		textCoda = new JTextField();
		textCoda.setColumns(10);
		textCoda.setBounds(216, 251, 86, 20);
		pannelloSecondo.add(textCoda);

		textPinne = new JTextField();
		textPinne.setColumns(10);
		textPinne.setBounds(217, 285, 86, 20);
		pannelloSecondo.add(textPinne);

		textCollo = new JTextField();
		textCollo.setColumns(10);
		textCollo.setBounds(367, 220, 86, 20);
		pannelloSecondo.add(textCollo);

		JButton btnNewButton_2_1 = new JButton("Invia");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.inviaCC(controller, stringa, textCartella, textTarghetta, textNome, textTesta, textOcchi,
						textNaso, textBecco, textCollo, textPinne, textCoda, textLunghezza, textLarghezza, textPeso,
						textSpecie, textLuogo, textData, pannelloSecondo, pannelloPrimo);

			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(364, 272, 89, 23);
		pannelloSecondo.add(btnNewButton_2_1);

		inserimentoVasca = new JTextField();
		inserimentoVasca.setBounds(303, 213, 167, 20);
		pannelloPrimo.add(inserimentoVasca);
		inserimentoVasca.setColumns(10);
		inserimentoVasca.setVisible(false);

		JLabel SCRITTURA3 = new JLabel("Inserisci l'ID della vasca");
		SCRITTURA3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		SCRITTURA3.setBounds(303, 136, 175, 15);
		pannelloPrimo.add(SCRITTURA3);
		SCRITTURA3.setVisible(false);

		JLabel SCRITTURA4 = new JLabel("in cui aggiungere la");
		SCRITTURA4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		SCRITTURA4.setBounds(303, 157, 153, 23);
		pannelloPrimo.add(SCRITTURA4);
		SCRITTURA4.setVisible(false);

		JLabel SCRITTURA5 = new JLabel("tartaruga.");
		SCRITTURA5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		SCRITTURA5.setBounds(303, 177, 85, 31);
		pannelloPrimo.add(SCRITTURA5);
		SCRITTURA5.setVisible(false);

		JLabel successivo = new JLabel("Successivo");
		successivo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.insertNumVasca(cartmedica1, inserimentoVasca);
			}
		});
		successivo.setForeground(new Color(0, 64, 128));
		successivo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		successivo.setBounds(399, 231, 71, 14);
		pannelloPrimo.add(successivo);
		successivo.setVisible(false);

		JLabel lblSCRITTURA = new JLabel("Inserisci l'ID interno della");
		lblSCRITTURA.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblSCRITTURA.setBounds(23, 157, 242, 23);
		pannelloPrimo.add(lblSCRITTURA);
		lblSCRITTURA.setVisible(false);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.setInvariati(textFieldRicerca, pannelloPrimo, pannelloSecondo, textNome, textTarghetta,
						textSpecie);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(245, 212, 28, 23);
		pannelloPrimo.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);

		JLabel lblSCRITTURA2 = new JLabel("tartaruga riammessa.");
		lblSCRITTURA2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblSCRITTURA2.setBounds(33, 181, 167, 23);
		pannelloPrimo.add(lblSCRITTURA2);
		lblSCRITTURA2.setVisible(false);

		JButton btnPrimoAccesso = new JButton("Primo Accesso");
		btnPrimoAccesso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrimoAccesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.textFieldFalseTrue(SCRITTURA3, SCRITTURA4, SCRITTURA5, successivo, lblSCRITTURA,
						btnNewButton_1, lblSCRITTURA2, textFieldRicerca, inserimentoVasca);
			}
		});
		btnPrimoAccesso.setBounds(303, 102, 167, 23);
		pannelloPrimo.add(btnPrimoAccesso);

		JLabel lblNewLabel = new JLabel("Seleziona la tipologia di tartaruga:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(60, 34, 328, 27);
		pannelloPrimo.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("images\\Cattura (2)PNG (1) (2) (1).png"));
		lblNewLabel_1.setBounds(255, 242, 118, 99);
		pannelloPrimo.add(lblNewLabel_1);

		textFieldRicerca = new JTextField();
		textFieldRicerca.setBounds(23, 212, 212, 23);
		pannelloPrimo.add(textFieldRicerca);
		textFieldRicerca.setColumns(10);
		textFieldRicerca.setVisible(false);

		stringa = textFieldRicerca.getText();

		JButton btnNewButton = new JButton("Riammessa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.textFieldFalseTrue2(SCRITTURA3, SCRITTURA4, SCRITTURA5, successivo, lblSCRITTURA,
						btnNewButton_1, lblSCRITTURA2, inserimentoVasca, textFieldRicerca);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(43, 102, 140, 23);
		pannelloPrimo.add(btnNewButton);

	}
}

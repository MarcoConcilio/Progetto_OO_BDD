package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.cartellaClinicaDao;
import dao.statoTartarugaDao;
import dao.tartarugaDao;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class primaFinestraMedico extends JFrame {

	private JPanel primoPannello, secondoPannello, backGroundPanel, terzoPannello, statPannello;
	public finestraLOGIN finestraMain;
	private JTextField textVisualizzaTarta;
	private JTextField textFieldVisual;
	private JButton btnIndietro2;
	private JLabel lblNewLabel_1;
	private JTextField dispNomeTart;
	private JLabel lblNewLabel_2;
	private JTextField dispIdTart;
	private JTextField dispIdCartClinica;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField dispPeso;
	private JTextField dispLarghezza;
	private JTextField dispLunghezza;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField dispSpecie;
	private JTextField dispLuogoRitrova;
	private JLabel lblNewLabel_10;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField dispTesta;
	private JTextField dispOcchi;
	private JTextField dispNaso;
	private JTextField dispBecco;
	private JTextField dispCoda;
	private JTextField dispPinne;
	private JTextField dispCollo;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JTextField textEntrate;
	private JLabel lblNewLabel_25;
	private JButton btnNewButton_4;
	private JTable table;
	private JLabel lblNewLabel_23;
	private JScrollPane scrollPane_2;
	private JTable table_1;

	public primaFinestraMedico(finestraLOGIN m1) {
		finestraMain = m1;
		finestraRiammPrimoacc finestramezzo = new finestraRiammPrimoacc(this);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 704, 506);
		backGroundPanel = new JPanel();
		backGroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backGroundPanel);
		backGroundPanel.setLayout(new CardLayout(0, 0));

		primoPannello = new JPanel();
		primoPannello.setForeground(new Color(0, 0, 0));
		primoPannello.setBackground(new Color(165, 206, 218));
		primoPannello.setBorder(new EmptyBorder(5, 5, 5, 5));

		setBounds(600, 300, 704, 506);
		secondoPannello = new JPanel();
		secondoPannello.setForeground(new Color(0, 0, 0));
		secondoPannello.setBackground(new Color(165, 206, 218));
		secondoPannello.setBorder(new EmptyBorder(5, 5, 5, 5));

		terzoPannello = new JPanel();
		terzoPannello.setForeground(new Color(0, 0, 0));
		terzoPannello.setBackground(new Color(165, 206, 218));
		terzoPannello.setBorder(new EmptyBorder(5, 5, 5, 5));

		statPannello = new JPanel();
		statPannello.setForeground(new Color(0, 0, 0));
		statPannello.setBackground(new Color(165, 206, 218));
		statPannello.setBorder(new EmptyBorder(5, 5, 5, 5));

		backGroundPanel.add(primoPannello);
		backGroundPanel.add(terzoPannello);
		backGroundPanel.add(secondoPannello);
		backGroundPanel.add(statPannello);
		primoPannello.setLayout(null);
		secondoPannello.setLayout(null);
		terzoPannello.setLayout(null);
		statPannello.setLayout(null);

		JButton btnIndietro2_1 = new JButton("Indietro");
		btnIndietro2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statPannello.setVisible(false);
				primoPannello.setVisible(true);
			}
		});
		btnIndietro2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIndietro2_1.setBounds(10, 11, 101, 23);
		statPannello.add(btnIndietro2_1);

		textEntrate = new JTextField();
		textEntrate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textEntrate.setBounds(249, 93, 68, 29);
		statPannello.add(textEntrate);
		textEntrate.setColumns(10);
		textEntrate.setEditable(false);

		JLabel lblNewLabel_22 = new JLabel("Indicare in che modo visualizzare le statistiche:");
		lblNewLabel_22.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_22.setBounds(28, 168, 397, 23);
		statPannello.add(lblNewLabel_22);

		lblNewLabel_25 = new JLabel("Numero di tartarughe totali:");
		lblNewLabel_25.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblNewLabel_25.setBounds(28, 94, 225, 25);
		statPannello.add(lblNewLabel_25);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Annuale", "Mensile" }));
		comboBox.setBounds(430, 168, 88, 32);
		statPannello.add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 217, 658, 229);
		statPannello.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();

				if (comboBox.getSelectedIndex() == 0) {

					table.setModel(cartellaClinicaDao.statisticheAnnuali());
				} else {
					table.setModel(cartellaClinicaDao.statisticheMensili());
				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(528, 168, 28, 32);
		statPannello.add(btnNewButton_4);

		lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setIcon(new ImageIcon("images\\Squirtle (1).png"));
		lblNewLabel_23.setBounds(469, 31, 88, 91);
		statPannello.add(lblNewLabel_23);

		btnNewButton_2 = new JButton("Indietro");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				terzoPannello.setVisible(false);
				secondoPannello.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 11, 100, 23);
		terzoPannello.add(btnNewButton_2);

		JLabel lblNewLabel_11 = new JLabel("Testa:");
		lblNewLabel_11.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(74, 133, 46, 14);
		terzoPannello.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Occhi:");
		lblNewLabel_12.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(74, 192, 46, 14);
		terzoPannello.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Naso:");
		lblNewLabel_13.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(74, 250, 46, 14);
		terzoPannello.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Becco:");
		lblNewLabel_14.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(273, 133, 46, 14);
		terzoPannello.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("Coda:");
		lblNewLabel_15.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(273, 192, 46, 14);
		terzoPannello.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("Pinne:");
		lblNewLabel_16.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(273, 250, 46, 14);
		terzoPannello.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("Collo:");
		lblNewLabel_17.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(457, 192, 46, 14);
		terzoPannello.add(lblNewLabel_17);

		dispTesta = new JTextField();
		dispTesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispTesta.setBounds(118, 131, 86, 20);
		terzoPannello.add(dispTesta);
		dispTesta.setColumns(10);
		dispTesta.setEditable(false);

		dispOcchi = new JTextField();
		dispOcchi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispOcchi.setColumns(10);
		dispOcchi.setBounds(118, 190, 86, 20);
		terzoPannello.add(dispOcchi);
		dispOcchi.setEditable(false);

		dispNaso = new JTextField();
		dispNaso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispNaso.setColumns(10);
		dispNaso.setBounds(118, 248, 86, 20);
		terzoPannello.add(dispNaso);
		dispNaso.setEditable(false);

		dispBecco = new JTextField();
		dispBecco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispBecco.setColumns(10);
		dispBecco.setBounds(318, 131, 86, 20);
		terzoPannello.add(dispBecco);
		dispBecco.setEditable(false);

		dispCoda = new JTextField();
		dispCoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispCoda.setColumns(10);
		dispCoda.setBounds(318, 190, 86, 20);
		terzoPannello.add(dispCoda);
		dispCoda.setEditable(false);

		dispPinne = new JTextField();
		dispPinne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispPinne.setColumns(10);
		dispPinne.setBounds(318, 248, 86, 20);
		terzoPannello.add(dispPinne);
		dispPinne.setEditable(false);

		dispCollo = new JTextField();
		dispCollo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispCollo.setColumns(10);
		dispCollo.setBounds(500, 190, 86, 20);
		terzoPannello.add(dispCollo);
		dispCollo.setEditable(false);

		JLabel lblNewLabel_19 = new JLabel("Stato delle parti del corpo della tartaruga:");
		lblNewLabel_19.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_19.setBounds(74, 69, 358, 32);
		terzoPannello.add(lblNewLabel_19);

		JButton buttonCartClin = new JButton("Aggiungi tartaruga");
		buttonCartClin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finestramezzo.setVisible(true);
			}
		});
		buttonCartClin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonCartClin.setBounds(53, 331, 217, 23);
		primoPannello.add(buttonCartClin);

		textVisualizzaTarta = new JTextField();
		textVisualizzaTarta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textVisualizzaTarta.setBounds(178, 99, 291, 32);
		primoPannello.add(textVisualizzaTarta);
		textVisualizzaTarta.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tartarugaDao tartarugaDao = new tartarugaDao();
				cartellaClinicaDao clinicaDao = new cartellaClinicaDao();

//				table_1.setModel(tartarugaDao.sceltaTartaruga());
				
				if (tartarugaDao.selectTartaruga(textVisualizzaTarta.getText())) {
//					textFieldVisual.setVisible(true);

					textFieldVisual.setText((tartarugaDao.selectTartarugaStringa(textVisualizzaTarta.getText())));
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
					

//					primoPannello.setVisible(false);
//					secondoPannello.setVisible(true);
//					dispNomeTart.setText(tartarugaDao.displayNomeTartaruga(textFieldVisual.getText()));
//					dispIdTart.setText(tartarugaDao.displayIDTartaruga(textFieldVisual.getText()));
//					dispIdCartClinica.setText(clinicaDao.displayNumeroCartellaTartaruga(textFieldVisual.getText()));
//					dispPeso.setText(clinicaDao.displayPesoDellaTartaruga(textFieldVisual.getText()));
//					dispLarghezza.setText(clinicaDao.displayLarghezzaDellaTartaruga(textFieldVisual.getText()));
//					dispLunghezza.setText(clinicaDao.displayLunghezzaDellaTartaruga(textFieldVisual.getText()));
//					dispSpecie.setText(clinicaDao.displaySpecieDellaTartaruga(textFieldVisual.getText()));
//					dispLuogoRitrova
//							.setText(clinicaDao.displayLuogoRitrovamentoDellaTartaruga(textFieldVisual.getText()));

					textVisualizzaTarta.setText(null);
					
				} else {
					JOptionPane.showMessageDialog(null, "Nessun id trovato.");
				}

			}
		});
		btnNewButton.setBounds(479, 99, 28, 32);
		primoPannello.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Inserisci ID interno da visualizzare.");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel.setBounds(178, 56, 291, 32);
		primoPannello.add(lblNewLabel);

		textFieldVisual = new JTextField();
		textFieldVisual.addMouseListener(new MouseAdapter() {
			@Override // display delle statistiche della tartaruga che selezioni
			public void mouseClicked(MouseEvent e) {
				tartarugaDao tartarugaDao = new tartarugaDao();
				cartellaClinicaDao clinicaDao = new cartellaClinicaDao();

//				primoPannello.setVisible(false);
//				secondoPannello.setVisible(true);
//				dispNomeTart.setText(tartarugaDao.displayNomeTartaruga(textFieldVisual.getText()));
//				dispIdTart.setText(tartarugaDao.displayIDTartaruga(textFieldVisual.getText()));
//				dispIdCartClinica.setText(clinicaDao.displayNumeroCartellaTartaruga(textFieldVisual.getText()));
//				dispPeso.setText(clinicaDao.displayPesoDellaTartaruga(textFieldVisual.getText()));
//				dispLarghezza.setText(clinicaDao.displayLarghezzaDellaTartaruga(textFieldVisual.getText()));
//				dispLunghezza.setText(clinicaDao.displayLunghezzaDellaTartaruga(textFieldVisual.getText()));
//				dispSpecie.setText(clinicaDao.displaySpecieDellaTartaruga(textFieldVisual.getText()));
//				dispLuogoRitrova.setText(clinicaDao.displayLuogoRitrovamentoDellaTartaruga(textFieldVisual.getText()));

			}
		});
		textFieldVisual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldVisual.setBounds(657, 1, 21, 32);
		primoPannello.add(textFieldVisual);
		textFieldVisual.setColumns(10);
		textFieldVisual.setVisible(false);
		textFieldVisual.setEditable(false);

		JLabel lblNewLabel_9 = new JLabel("Clicca qui per aggiungere una");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(40, 259, 259, 32);
		primoPannello.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("tartaruga al DataBase.");
		lblNewLabel_10.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(76, 285, 185, 35);
		primoPannello.add(lblNewLabel_10);

		JLabel lblNewLabel_18 = new JLabel("Visualizza statistiche.");
		lblNewLabel_18.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_18.setBounds(437, 280, 172, 32);
		primoPannello.add(lblNewLabel_18);

		JButton btnNewButton_3 = new JButton("Statistiche");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();

				textEntrate.setText(cartellaClinicaDao.selectStatistiche());

				primoPannello.setVisible(false);
				statPannello.setVisible(true);

			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(448, 331, 151, 23);
		primoPannello.add(btnNewButton_3);

		lblNewLabel_20 = new JLabel("Medico Veterinario");
		lblNewLabel_20.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_20.setBounds(10, 11, 139, 23);
		primoPannello.add(lblNewLabel_20);

		lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon("images\\MedicoVeterinario (1) (1) (1).png"));
		lblNewLabel_21.setBounds(47, 34, 62, 65);
		primoPannello.add(lblNewLabel_21);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(465, 142, -285, 76);
		primoPannello.add(scrollPane_1);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane_2.setBounds(178, 142, 291, 106);
		primoPannello.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);

		tartarugaDao tartarugaDao = new tartarugaDao();
		table_1.setModel(tartarugaDao.sceltaTartaruga());
		
		btnIndietro2 = new JButton("Indietro");
		btnIndietro2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIndietro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondoPannello.setVisible(false);
				primoPannello.setVisible(true);

			}
		});
		btnIndietro2.setBounds(10, 11, 101, 23);
		secondoPannello.add(btnIndietro2);

		lblNewLabel_1 = new JLabel("Cartella clinica di: ");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 65, 124, 23);
		secondoPannello.add(lblNewLabel_1);

		dispNomeTart = new JTextField();
		dispNomeTart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispNomeTart.setBounds(144, 65, 86, 27);
		secondoPannello.add(dispNomeTart);
		dispNomeTart.setColumns(10);
		dispNomeTart.setEditable(false);

		lblNewLabel_2 = new JLabel("ID_Tartaruga:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(51, 130, 94, 21);
		secondoPannello.add(lblNewLabel_2);

		dispIdTart = new JTextField();
		dispIdTart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispIdTart.setBounds(144, 127, 86, 27);
		secondoPannello.add(dispIdTart);
		dispIdTart.setColumns(10);
		dispIdTart.setEditable(false);

		JLabel lblNewLabel_3 = new JLabel("Id Cartella clinica:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(21, 196, 124, 14);
		secondoPannello.add(lblNewLabel_3);

		dispIdCartClinica = new JTextField();
		dispIdCartClinica.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispIdCartClinica.setColumns(10);
		dispIdCartClinica.setBounds(144, 183, 86, 27);
		secondoPannello.add(dispIdCartClinica);
		dispIdCartClinica.setEditable(false);

		lblNewLabel_4 = new JLabel("Peso:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(387, 247, 37, 14);
		secondoPannello.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Larghezza:");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(354, 125, 72, 30);
		secondoPannello.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Lunghezza:");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(349, 183, 77, 24);
		secondoPannello.add(lblNewLabel_6);

		dispPeso = new JTextField();
		dispPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispPeso.setEditable(false);
		dispPeso.setColumns(10);
		dispPeso.setBounds(427, 242, 86, 27);
		secondoPannello.add(dispPeso);
		dispPeso.setEditable(false);

		dispLarghezza = new JTextField();
		dispLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLarghezza.setEditable(false);
		dispLarghezza.setColumns(10);
		dispLarghezza.setBounds(428, 128, 86, 27);
		secondoPannello.add(dispLarghezza);
		dispLarghezza.setEditable(false);

		dispLunghezza = new JTextField();
		dispLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLunghezza.setEditable(false);
		dispLunghezza.setColumns(10);
		dispLunghezza.setBounds(427, 183, 86, 27);
		secondoPannello.add(dispLunghezza);
		dispLunghezza.setEditable(false);

		lblNewLabel_7 = new JLabel("Specie:");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(96, 243, 48, 23);
		secondoPannello.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Luogo di ritrovamento:");
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(271, 65, 155, 23);
		secondoPannello.add(lblNewLabel_8);

		dispSpecie = new JTextField();
		dispSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispSpecie.setEditable(false);
		dispSpecie.setColumns(10);
		dispSpecie.setBounds(144, 242, 86, 27);
		secondoPannello.add(dispSpecie);
		dispSpecie.setEditable(false);

		dispLuogoRitrova = new JTextField();
		dispLuogoRitrova.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLuogoRitrova.setEditable(false);
		dispLuogoRitrova.setColumns(10);
		dispLuogoRitrova.setBounds(428, 61, 150, 27);
		secondoPannello.add(dispLuogoRitrova);
		dispLuogoRitrova.setEditable(false);

		btnNewButton_1 = new JButton("Successivo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(514, 377, 118, 23);
		secondoPannello.add(btnNewButton_1);
	}
}

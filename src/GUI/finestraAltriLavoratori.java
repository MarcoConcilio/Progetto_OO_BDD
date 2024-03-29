package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.controller;
import dao.cartellaClinicaDao;
import dao.statoTartarugaDao;
import dao.tartarugaDao;
import dao.vascaDao;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class finestraAltriLavoratori extends JFrame {

	private JPanel backGroundPanel, primoPannello, secondoPannello, terzoPannello, aggPannello, statPannello;
	public finestraLOGIN finestraMain;
	private JTextField textVisualizzaTarta;
	private JTextField textFieldVisual;
	private JTextField dispNomeTart;
	private JTextField dispIdTart;
	private JTextField dispIdCartClinica;
	private JTextField dispSpecie;
	private JTextField dispLuogoRitrova;
	private JTextField dispLarghezza;
	private JTextField dispLunghezza;
	private JTextField dispPeso;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField dispTesta;
	private JTextField dispOcchi;
	private JTextField dispNaso;
	private JTextField dispBecco;
	private JTextField dispCoda;
	private JTextField dispPinne;
	private JTextField dispCollo;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JButton buttonCartClin;
	private JLabel lblNewLabel_18;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton bottoneAnno;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JTextField inserimentoVasca;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JTextField textNome;
	private JTextField textId;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JLabel lblNewLabel_27;

	public finestraAltriLavoratori(finestraLOGIN m1) {
		finestraMain = m1;
		controller controller = new controller();

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

		aggPannello = new JPanel();
		aggPannello.setForeground(new Color(0, 0, 0));
		aggPannello.setBackground(new Color(165, 206, 218));
		aggPannello.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		statPannello = new JPanel();
		statPannello.setForeground(new Color(0, 0, 0));
		statPannello.setBackground(new Color(165, 206, 218));
		statPannello.setBorder(new EmptyBorder(5, 5, 5, 5));

		backGroundPanel.add(primoPannello);
		backGroundPanel.add(terzoPannello);
		backGroundPanel.add(secondoPannello);
		backGroundPanel.add(aggPannello);
		backGroundPanel.add(statPannello);
		primoPannello.setLayout(null);
		aggPannello.setLayout(null);
		statPannello.setLayout(null);
		
	
		
		JButton btnIndietro2_1 = new JButton("Indietro");
		btnIndietro2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(statPannello, primoPannello);
			}
		});
		btnIndietro2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIndietro2_1.setBounds(10, 11, 101, 23);
		statPannello.add(btnIndietro2_1);

		JTextField textEntrate = new JTextField();
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Annuali", "Mensile" }));
		comboBox.setBounds(430, 168, 88, 32);
		statPannello.add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 280, 658, 166);
		statPannello.add(scrollPane);

		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		JComboBox boxAnni = new JComboBox();
		boxAnni.setModel(new DefaultComboBoxModel(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026",
				"2027", "2028", "2029", "2030" }));
		boxAnni.setBounds(28, 237, 88, 32);
		statPannello.add(boxAnni);
		boxAnni.setVisible(false);

		

		lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setIcon(new ImageIcon("images\\Squirtle (1).png"));
		lblNewLabel_23.setBounds(469, 31, 88, 91);
		statPannello.add(lblNewLabel_23);

		bottoneAnno = new JButton("");
		bottoneAnno.setIcon(new ImageIcon("images\\Cattura (1).png"));
		bottoneAnno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				table.setModel(cartellaClinicaDao.statisticheAnnuali2(boxAnni.getSelectedItem().toString()));
			}
		});
		bottoneAnno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bottoneAnno.setBounds(126, 237, 28, 32);
		statPannello.add(bottoneAnno);

		lblNewLabel_26 = new JLabel("Indicare l'anno:");
		lblNewLabel_26.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_26.setBounds(28, 203, 139, 23);
		statPannello.add(lblNewLabel_26);
		lblNewLabel_26.setVisible(false);
		
		lblNewLabel_27 = new JLabel("Indicare il mese:");
		lblNewLabel_27.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_27.setBounds(467, 203, 139, 23);
		statPannello.add(lblNewLabel_27);
		lblNewLabel_27.setVisible(false);

		JComboBox comboMesi = new JComboBox();
		comboMesi.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		comboMesi.setBounds(491, 237, 46, 32);
		statPannello.add(comboMesi);
		comboMesi.setVisible(false);

		JButton bottoneMese = new JButton("");
		bottoneMese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				table.setModel(cartellaClinicaDao.statisticheMensili2(comboMesi.getSelectedItem().toString()));
			}
		});
		bottoneMese.setIcon(new ImageIcon("images\\Cattura (1).png"));
		bottoneMese.setBounds(547, 237, 28, 32);
		statPannello.add(bottoneMese);
		bottoneAnno.setVisible(false);
		lblNewLabel_26.setVisible(false);
		bottoneMese.setVisible(false);


		btnNewButton_5 = new JButton("Indietro");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(aggPannello, primoPannello);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_5.setBounds(10, 11, 99, 23);
		aggPannello.add(btnNewButton_5);

		JButton btnNewButton_61 = new JButton("");
		btnNewButton_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				table.setModel(cartellaClinicaDao.statisticheMensili2(comboMesi.getSelectedItem().toString()));
			}
		});
		btnNewButton_61.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton_61.setBounds(547, 237, 28, 32);
		statPannello.add(btnNewButton_61);
		btnNewButton_5.setVisible(false);
		lblNewLabel_26.setVisible(false);
		btnNewButton_61.setVisible(false);

		
		lblNewLabel_19 = new JLabel("Inserisci dati della tartaruga:");
		lblNewLabel_19.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		lblNewLabel_19.setBounds(50, 184, 297, 36);
		aggPannello.add(lblNewLabel_19);

		lblNewLabel_20 = new JLabel("Nome:");
		lblNewLabel_20.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 19));
		lblNewLabel_20.setBounds(144, 311, 55, 29);
		aggPannello.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Numero vasca:");
		lblNewLabel_21.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 19));
		lblNewLabel_21.setBounds(77, 114, 122, 36);
		aggPannello.add(lblNewLabel_21);

		inserimentoVasca = new JTextField();
		inserimentoVasca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		inserimentoVasca.setBounds(207, 120, 140, 32);
		aggPannello.add(inserimentoVasca);
		inserimentoVasca.setColumns(10);

		JButton btnNewButton_611 = new JButton("Invia");
		btnNewButton_611.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_611.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.inviaAltriLavoratori(controller, inserimentoVasca, textNome, textId, aggPannello,
						primoPannello);
			}
		});
		btnNewButton_611.setBounds(248, 371, 99, 23);
		aggPannello.add(btnNewButton_611);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.setTipoIntervallo(comboBox, boxAnni, lblNewLabel_27, bottoneMese, comboMesi,
						lblNewLabel_26, bottoneAnno);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(528, 168, 28, 32);
		statPannello.add(btnNewButton_4);
		
		lblNewLabel_22 = new JLabel("Inserisci il numero della vasca:");
		lblNewLabel_22.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		lblNewLabel_22.setBounds(29, 61, 318, 32);
		aggPannello.add(lblNewLabel_22);

		lblNewLabel_23 = new JLabel("Targhetta:");
		lblNewLabel_23.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 19));
		lblNewLabel_23.setBounds(117, 243, 88, 36);
		aggPannello.add(lblNewLabel_23);

		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textNome.setColumns(10);
		textNome.setBounds(207, 246, 140, 32);
		aggPannello.add(textNome);

		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textId.setColumns(10);
		textId.setBounds(207, 310, 140, 32);
		aggPannello.add(textId);

		JLabel lblNewLabel = new JLabel("Inserisci ID interno da visualizzare.");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel.setBounds(170, 54, 291, 32);
		primoPannello.add(lblNewLabel);

		textVisualizzaTarta = new JTextField();
		textVisualizzaTarta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textVisualizzaTarta.setColumns(10);
		textVisualizzaTarta.setBounds(170, 97, 291, 32);
		primoPannello.add(textVisualizzaTarta);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.displayTurtlesCC(textVisualizzaTarta, textFieldVisual, primoPannello, secondoPannello,
						dispNomeTart, dispIdTart, dispIdCartClinica, dispPeso, dispLarghezza, dispLunghezza, dispSpecie,
						dispLuogoRitrova);
			}

		});
		btnNewButton.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(471, 97, 28, 32);
		primoPannello.add(btnNewButton);

		textFieldVisual = new JTextField();
		textFieldVisual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.displayTurtlesCC(dispNomeTart, dispIdTart, dispIdCartClinica, dispPeso, dispLarghezza,
						dispLunghezza, dispSpecie, dispLuogoRitrova, textFieldVisual);
			}
		});
		textFieldVisual.setBounds(650, 0, 28, 32);
		primoPannello.add(textFieldVisual);
		textFieldVisual.setColumns(10);
		secondoPannello.setLayout(null);

		dispNomeTart = new JTextField();
		dispNomeTart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispNomeTart.setEditable(false);
		dispNomeTart.setColumns(10);
		dispNomeTart.setBounds(150, 65, 86, 27);
		secondoPannello.add(dispNomeTart);

		dispIdTart = new JTextField();
		dispIdTart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispIdTart.setEditable(false);
		dispIdTart.setColumns(10);
		dispIdTart.setBounds(150, 129, 86, 27);
		secondoPannello.add(dispIdTart);

		dispIdCartClinica = new JTextField();
		dispIdCartClinica.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispIdCartClinica.setEditable(false);
		dispIdCartClinica.setColumns(10);
		dispIdCartClinica.setBounds(150, 188, 86, 27);
		secondoPannello.add(dispIdCartClinica);

		dispSpecie = new JTextField();
		dispSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispSpecie.setEditable(false);
		dispSpecie.setColumns(10);
		dispSpecie.setBounds(150, 240, 86, 27);
		secondoPannello.add(dispSpecie);

		dispLuogoRitrova = new JTextField();
		dispLuogoRitrova.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLuogoRitrova.setEditable(false);
		dispLuogoRitrova.setColumns(10);
		dispLuogoRitrova.setBounds(436, 65, 138, 27);
		secondoPannello.add(dispLuogoRitrova);

		dispLarghezza = new JTextField();
		dispLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLarghezza.setEditable(false);
		dispLarghezza.setColumns(10);
		dispLarghezza.setBounds(436, 129, 86, 27);
		secondoPannello.add(dispLarghezza);

		dispLunghezza = new JTextField();
		dispLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLunghezza.setEditable(false);
		dispLunghezza.setColumns(10);
		dispLunghezza.setBounds(436, 188, 86, 27);
		secondoPannello.add(dispLunghezza);

		dispPeso = new JTextField();
		dispPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispPeso.setEditable(false);
		dispPeso.setColumns(10);
		dispPeso.setBounds(436, 240, 86, 27);
		secondoPannello.add(dispPeso);

		lblNewLabel_1 = new JLabel("Cartella clinica di: ");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(30, 66, 124, 23);
		secondoPannello.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("ID_Tartaruga:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(60, 131, 94, 21);
		secondoPannello.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Id Cartella clinica:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(30, 193, 124, 14);
		secondoPannello.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Specie:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(99, 241, 48, 23);
		secondoPannello.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Luogo di ritrovamento:");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(278, 66, 155, 23);
		secondoPannello.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Larghezza:");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(361, 126, 72, 30);
		secondoPannello.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Lunghezza:");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(356, 188, 77, 24);
		secondoPannello.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Peso:");
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(396, 245, 37, 14);
		secondoPannello.add(lblNewLabel_8);

		btnNewButton_1 = new JButton("Indietro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(secondoPannello, primoPannello);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(10, 11, 99, 23);
		secondoPannello.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Successivo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.displayTurtlesSTATO(secondoPannello, terzoPannello, dispTesta, dispOcchi, dispNaso,
						dispBecco, dispCoda, dispPinne, dispCollo, textFieldVisual);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(526, 399, 118, 23);
		secondoPannello.add(btnNewButton_2);
		terzoPannello.setLayout(null);

		dispTesta = new JTextField();
		dispTesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispTesta.setEditable(false);
		dispTesta.setColumns(10);
		dispTesta.setBounds(123, 116, 86, 20);
		terzoPannello.add(dispTesta);

		dispOcchi = new JTextField();
		dispOcchi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispOcchi.setEditable(false);
		dispOcchi.setColumns(10);
		dispOcchi.setBounds(123, 179, 86, 20);
		terzoPannello.add(dispOcchi);

		dispNaso = new JTextField();
		dispNaso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispNaso.setEditable(false);
		dispNaso.setColumns(10);
		dispNaso.setBounds(123, 247, 86, 20);
		terzoPannello.add(dispNaso);

		dispBecco = new JTextField();
		dispBecco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispBecco.setEditable(false);
		dispBecco.setColumns(10);
		dispBecco.setBounds(305, 116, 86, 20);
		terzoPannello.add(dispBecco);

		dispCoda = new JTextField();
		dispCoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispCoda.setEditable(false);
		dispCoda.setColumns(10);
		dispCoda.setBounds(305, 179, 86, 20);
		terzoPannello.add(dispCoda);

		dispPinne = new JTextField();
		dispPinne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispPinne.setEditable(false);
		dispPinne.setColumns(10);
		dispPinne.setBounds(305, 247, 86, 20);
		terzoPannello.add(dispPinne);

		dispCollo = new JTextField();
		dispCollo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispCollo.setEditable(false);
		dispCollo.setColumns(10);
		dispCollo.setBounds(478, 179, 86, 20);
		terzoPannello.add(dispCollo);

		lblNewLabel_9 = new JLabel("Testa:");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(78, 118, 46, 14);
		terzoPannello.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("Occhi:");
		lblNewLabel_10.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(78, 181, 46, 14);
		terzoPannello.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("Naso:");
		lblNewLabel_11.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(78, 249, 46, 14);
		terzoPannello.add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("Becco:");
		lblNewLabel_12.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(259, 118, 46, 14);
		terzoPannello.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("Coda:");
		lblNewLabel_13.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(259, 181, 46, 14);
		terzoPannello.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("Pinne:");
		lblNewLabel_14.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(259, 249, 46, 14);
		terzoPannello.add(lblNewLabel_14);

		lblNewLabel_15 = new JLabel("Collo:");
		lblNewLabel_15.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(433, 181, 46, 14);
		terzoPannello.add(lblNewLabel_15);

		btnNewButton_3 = new JButton("Indietro");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(terzoPannello, secondoPannello);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(10, 11, 100, 23);
		terzoPannello.add(btnNewButton_3);
		textFieldVisual.setVisible(false);
		textFieldVisual.setEditable(false);

		lblNewLabel_16 = new JLabel("Clicca qui per aggiungere una");
		lblNewLabel_16.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_16.setBounds(30, 252, 259, 32);
		primoPannello.add(lblNewLabel_16);

		lblNewLabel_17 = new JLabel("tartaruga al DataBase.");
		lblNewLabel_17.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_17.setBounds(65, 279, 185, 35);
		primoPannello.add(lblNewLabel_17);

		buttonCartClin = new JButton("Aggiungi tartaruga");
		buttonCartClin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(primoPannello, aggPannello);
			}
		});
		buttonCartClin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonCartClin.setBounds(45, 318, 217, 23);
		primoPannello.add(buttonCartClin);

		lblNewLabel_18 = new JLabel("Visualizza statistiche.");
		lblNewLabel_18.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_18.setBounds(426, 280, 172, 32);
		primoPannello.add(lblNewLabel_18);

		btnNewButton_4 = new JButton("Statistiche");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartellaClinicaDao cartellaClinicaDao = new cartellaClinicaDao();
				textEntrate.setText(cartellaClinicaDao.selectStatistiche());
				controller.cambioPanel(primoPannello, statPannello);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(436, 318, 151, 23);
		primoPannello.add(btnNewButton_4);

		lblNewLabel_24 = new JLabel("Personale");
		lblNewLabel_24.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_24.setBounds(23, 11, 80, 23);
		primoPannello.add(lblNewLabel_24);

		lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setIcon(new ImageIcon("images\\WorkerIcon (2) (1) (1).png"));
		lblNewLabel_25.setBounds(33, 32, 50, 62);
		primoPannello.add(lblNewLabel_25);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(170, 142, 291, 105);
		primoPannello.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		tartarugaDao tartarugaDao = new tartarugaDao();
		table_1.setModel(tartarugaDao.sceltaTartaruga());

		lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table_1.setModel(tartarugaDao.sceltaTartaruga());
			}
		});
		lblNewLabel_27.setIcon(new ImageIcon("images\\Ref (1) (1).png"));
		lblNewLabel_27.setBounds(139, 142, 21, 32);
		primoPannello.add(lblNewLabel_27);

	}
}

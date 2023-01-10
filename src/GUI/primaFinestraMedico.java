package GUI;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.dao;

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

public class primaFinestraMedico extends JFrame {

	private JPanel primoPannello, secondoPannello, backGroundPanel;
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
	/**
	 * Create the frame.
	 */
	public primaFinestraMedico(finestraLOGIN m1) {
		finestraMain = m1;
		finestraRiammPrimoacc finestramezzo = new finestraRiammPrimoacc(this);
		dao controllore = new dao();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 704, 506);
		backGroundPanel = new JPanel();
		backGroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backGroundPanel);
		backGroundPanel.setLayout(new CardLayout(0, 0));
		
		primoPannello = new JPanel();
		primoPannello.setForeground(new Color(0, 0, 0));
		primoPannello.setBackground(new Color(172, 205, 210));
		primoPannello.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setBounds(600, 300, 704, 506);
		secondoPannello = new JPanel();
		secondoPannello.setForeground(new Color(0, 0, 0));
		secondoPannello.setBackground(new Color(172, 205, 210));
		secondoPannello.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		backGroundPanel.add(primoPannello);
		backGroundPanel.add(secondoPannello);
		primoPannello.setLayout(null);
		secondoPannello.setLayout(null);
		
		
		JButton buttonCartClin = new JButton("Crea cartella clinica");		
		buttonCartClin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				finestramezzo.setVisible(true);	
			}
		});
		buttonCartClin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonCartClin.setBounds(418, 266, 217, 23);
		primoPannello.add(buttonCartClin);
		
		textVisualizzaTarta = new JTextField();
		textVisualizzaTarta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textVisualizzaTarta.setBounds(58, 69, 291, 32);
		primoPannello.add(textVisualizzaTarta);
		textVisualizzaTarta.setColumns(10);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(controllore.selectTartaruga(textVisualizzaTarta.getText()))
				{
					textFieldVisual.setVisible(true);
					textFieldVisual.setText((textVisualizzaTarta.getText()));
				}
				else {
					JOptionPane.showMessageDialog(null, "Nessun id trovato.");
				}
				
			}
		});
		btnNewButton.setBounds(359, 69, 28, 32);
		primoPannello.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Inserisci l'ID della tartaruga da visualizzare");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel.setBounds(58, 26, 429, 32);
		primoPannello.add(lblNewLabel);
		
		textFieldVisual = new JTextField();
		textFieldVisual.addMouseListener(new MouseAdapter() {
			@Override	//display delle statistiche della tartaruga che selezioni
			public void mouseClicked(MouseEvent e) {
				primoPannello.setVisible(false);
				secondoPannello.setVisible(true);
				dispNomeTart.setText(controllore.displayNomeTartaruga(textFieldVisual.getText()));
				dispIdTart.setText(controllore.displayIDTartaruga(textFieldVisual.getText()));
				dispIdCartClinica.setText(controllore.displayNumeroCartellaTartaruga(textFieldVisual.getText()));
				dispPeso.setText(controllore.displayPesoDellaTartaruga(textFieldVisual.getText()));
				dispLarghezza.setText(controllore.displayLarghezzaDellaTartaruga(textFieldVisual.getText()));
				dispLunghezza.setText(controllore.displayLunghezzaDellaTartaruga(textFieldVisual.getText()));
				dispSpecie.setText(controllore.displaySpecieDellaTartaruga(textFieldVisual.getText()));
				dispLuogoRitrova.setText(controllore.displayLuogoRitrovamentoDellaTartaruga(textFieldVisual.getText()));
			}
		});
		textFieldVisual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldVisual.setBounds(58, 112, 291, 32);
		primoPannello.add(textFieldVisual);
		textFieldVisual.setColumns(10);
		textFieldVisual.setVisible(false);
		textFieldVisual.setEditable(false);
		
		btnIndietro2 = new JButton("Indietro");
		btnIndietro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondoPannello.setVisible(false);
				primoPannello.setVisible(true);
			}
		});
		btnIndietro2.setBounds(10, 11, 89, 23);
		secondoPannello.add(btnIndietro2);
		
		lblNewLabel_1 = new JLabel("Cartella clinica di: ");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 58, 124, 23);
		secondoPannello.add(lblNewLabel_1);
		
		dispNomeTart = new JTextField();
		dispNomeTart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispNomeTart.setBounds(134, 62, 96, 20);
		secondoPannello.add(dispNomeTart);
		dispNomeTart.setColumns(10);
		dispNomeTart.setEditable(false);
		
		lblNewLabel_2 = new JLabel("ID_Tartaruga:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(240, 59, 94, 21);
		secondoPannello.add(lblNewLabel_2);
		
		dispIdTart = new JTextField();
		dispIdTart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispIdTart.setBounds(334, 62, 86, 20);
		secondoPannello.add(dispIdTart);
		dispIdTart.setColumns(10);
		dispIdTart.setEditable(false);
		
		JLabel lblNewLabel_3 = new JLabel("Id Cartella clinica:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(449, 62, 130, 14);
		secondoPannello.add(lblNewLabel_3);
		
		dispIdCartClinica = new JTextField();
		dispIdCartClinica.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispIdCartClinica.setColumns(10);
		dispIdCartClinica.setBounds(570, 62, 86, 20);
		secondoPannello.add(dispIdCartClinica);
		dispIdCartClinica.setEditable(false);
		
		lblNewLabel_4 = new JLabel("Peso:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(97, 110, 37, 14);
		secondoPannello.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Larghezza:");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(262, 102, 72, 30);
		secondoPannello.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Lunghezza:");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(490, 105, 77, 24);
		secondoPannello.add(lblNewLabel_6);
		
		dispPeso = new JTextField();
		dispPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispPeso.setEditable(false);
		dispPeso.setColumns(10);
		dispPeso.setBounds(134, 110, 102, 20);
		secondoPannello.add(dispPeso);
		dispPeso.setEditable(false);
		
		dispLarghezza = new JTextField();
		dispLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLarghezza.setEditable(false);
		dispLarghezza.setColumns(10);
		dispLarghezza.setBounds(334, 110, 86, 20);
		secondoPannello.add(dispLarghezza);
		dispLarghezza.setEditable(false);
		
		dispLunghezza = new JTextField();
		dispLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLunghezza.setEditable(false);
		dispLunghezza.setColumns(10);
		dispLunghezza.setBounds(570, 110, 86, 20);
		secondoPannello.add(dispLunghezza);
		dispLunghezza.setEditable(false);
		
		lblNewLabel_7 = new JLabel("Specie:");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(86, 153, 48, 23);
		secondoPannello.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Luogo di ritrovamento:");
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(266, 153, 164, 23);
		secondoPannello.add(lblNewLabel_8);
		
		dispSpecie = new JTextField();
		dispSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispSpecie.setEditable(false);
		dispSpecie.setColumns(10);
		dispSpecie.setBounds(134, 157, 102, 20);
		secondoPannello.add(dispSpecie);
		dispSpecie.setEditable(false);
		
		dispLuogoRitrova = new JTextField();
		dispLuogoRitrova.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dispLuogoRitrova.setEditable(false);
		dispLuogoRitrova.setColumns(10);
		dispLuogoRitrova.setBounds(429, 157, 150, 20);
		secondoPannello.add(dispLuogoRitrova);
		dispLuogoRitrova.setEditable(false);
	}
}

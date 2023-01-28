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
	private JTextField textFieldNascosto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String stringa;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the frame.
	 */
	public finestraRiammPrimoacc() {

		finestraCartellaClinica1 cartmedica1 = new finestraCartellaClinica1(this);
		finestraCartellaClinicaRiammissione cartellaRiammissione = new finestraCartellaClinicaRiammissione(this);
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
				controller.tastoIndietro(pannelloSecondo, pannelloPrimo);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 11, 89, 23);
		pannelloSecondo.add(btnNewButton_2);

		JLabel lblNewLabel_2 = new JLabel("Testa:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(50, 77, 49, 26);
		pannelloSecondo.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Occhi:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(50, 122, 49, 26);
		pannelloSecondo.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Naso:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(53, 162, 46, 23);
		pannelloSecondo.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Becco:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(270, 128, 52, 14);
		pannelloSecondo.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Coda:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(276, 83, 46, 14);
		pannelloSecondo.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Pinne:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(50, 207, 49, 23);
		pannelloSecondo.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Collo:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(276, 171, 46, 14);
		pannelloSecondo.add(lblNewLabel_8);

		textField = new JTextField();
		textField.setBounds(100, 80, 115, 26);
		pannelloSecondo.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Aggiungere una descrizione:");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(124, 21, 252, 32);
		pannelloSecondo.add(lblNewLabel_9);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 122, 115, 26);
		pannelloSecondo.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 162, 115, 26);
		pannelloSecondo.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 208, 115, 26);
		pannelloSecondo.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(326, 77, 115, 26);
		pannelloSecondo.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(326, 125, 115, 26);
		pannelloSecondo.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(326, 166, 115, 26);
		pannelloSecondo.add(textField_6);

		JButton btnNewButton_3 = new JButton("Invia");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(326, 242, 115, 23);
		pannelloSecondo.add(btnNewButton_3);

		inserimentoVasca = new JTextField();
		inserimentoVasca.setBounds(303, 213, 167, 20);
		pannelloPrimo.add(inserimentoVasca);
		inserimentoVasca.setColumns(10);

		textFieldNascosto = new JTextField();
		textFieldNascosto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textFieldNascosto.setBounds(23, 241, 212, 31);
		pannelloPrimo.add(textFieldNascosto);
		textFieldNascosto.setColumns(10);
		textFieldNascosto.setVisible(false);
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

		JLabel lblSCRITTURA = new JLabel("Inserisci l'ID della targhetta");
		lblSCRITTURA.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblSCRITTURA.setBounds(23, 157, 242, 23);
		pannelloPrimo.add(lblSCRITTURA);
		lblSCRITTURA.setVisible(false);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.inserisciTarghetta(cartellaRiammissione, textFieldRicerca, stringa);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("images\\Cattura (1).png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(245, 212, 28, 23);
		pannelloPrimo.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);

		JLabel lblSCRITTURA2 = new JLabel("della tartaruga riammessa.");
		lblSCRITTURA2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblSCRITTURA2.setBounds(23, 181, 242, 23);
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

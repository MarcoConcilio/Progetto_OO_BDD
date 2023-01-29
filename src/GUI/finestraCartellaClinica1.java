package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.*;
import dao.tartarugaDao;
import dao.vascaDao;

import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JRadioButton;

public class finestraCartellaClinica1 extends JFrame {

	private JPanel pannelloPrimo, pannelloSecondo, backGroundPanel;
	public finestraRiammPrimoacc finestra1;
	private JTextField textIdTartaruga;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblSpecie;
	private JLabel lblLunghezza;
	private JLabel lblLarghezza;
	private JLabel lblPeso;
	private JLabel lblLuogoRitrovamento;
	private JTextField textPeso;
	private JTextField textLarghezza;
	private JTextField textLunghezza;
	private JTextField textLuogoRitrovamento;
	private JTextField textSpecie;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNumeroCartella;
	private JTextField textNumCart;
	private JButton Indietro2;
	private JLabel lblTesta;
	private JLabel lblOcchi;
	private JLabel lblNaso;
	private JLabel lblBecco;
	private JLabel lblCollo;
	private JLabel lblPinne;
	private JLabel lblCoda;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel;
	private JTextField textTesta;
	private JTextField textOcchi;
	private JTextField textNaso;
	private JTextField textBecco;
	private JTextField textCoda;
	private JTextField textPinne;
	private JTextField textCollo;
	private JLabel lblNewLabel_1;
	private String stringa;
	private JTextField textDataIns;

	public finestraCartellaClinica1(finestraRiammPrimoacc p1) {
		finestra1 = p1;
		controller controller = new controller();

		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 200, 635, 582);
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

		Indietro2 = new JButton("Indietro");
		Indietro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cambioPanel(pannelloSecondo, pannelloPrimo);
			}
		});
		Indietro2.setBounds(10, 11, 89, 23);
		pannelloSecondo.add(Indietro2);

		lblTesta = new JLabel("Testa:");
		lblTesta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTesta.setBounds(50, 156, 49, 14);
		pannelloSecondo.add(lblTesta);

		lblOcchi = new JLabel("Occhi:");
		lblOcchi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOcchi.setBounds(50, 204, 49, 14);
		pannelloSecondo.add(lblOcchi);

		lblNaso = new JLabel("Naso:");
		lblNaso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNaso.setBounds(50, 253, 45, 14);
		pannelloSecondo.add(lblNaso);

		lblBecco = new JLabel("Becco:");
		lblBecco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBecco.setBounds(50, 300, 57, 14);
		pannelloSecondo.add(lblBecco);

		lblCollo = new JLabel("Collo:");
		lblCollo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCollo.setBounds(54, 439, 45, 14);
		pannelloSecondo.add(lblCollo);

		lblPinne = new JLabel("Pinne:");
		lblPinne.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPinne.setBounds(50, 392, 49, 14);
		pannelloSecondo.add(lblPinne);

		lblCoda = new JLabel("Coda:");
		lblCoda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCoda.setBounds(50, 346, 49, 14);
		pannelloSecondo.add(lblCoda);

		lblNewLabel_13 = new JLabel("Indicare con una piccola descrizione");
		lblNewLabel_13.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(121, 51, 314, 31);
		pannelloSecondo.add(lblNewLabel_13);

		textNumCart = new JTextField();
		textNumCart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNumCart.setBounds(180, 137, 86, 26);
		pannelloPrimo.add(textNumCart);
		textNumCart.setColumns(10);

		lblNewLabel = new JLabel("Invia al DataBase");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.inviaCC(controller, stringa, textNumCart, textIdTartaruga, textNome, textTesta, textOcchi,
						textNaso, textBecco, textCollo, textPinne, textCoda, textLunghezza, textLarghezza, textPeso,
						textSpecie, textLuogoRitrovamento, textDataIns, pannelloSecondo, pannelloPrimo);
			}
		});
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(211, 479, 114, 14);
		pannelloSecondo.add(lblNewLabel);

		textTesta = new JTextField();
		textTesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTesta.setColumns(10);
		textTesta.setBounds(107, 148, 161, 28);
		pannelloSecondo.add(textTesta);

		textOcchi = new JTextField();
		textOcchi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textOcchi.setColumns(10);
		textOcchi.setBounds(107, 198, 161, 28);
		pannelloSecondo.add(textOcchi);

		textNaso = new JTextField();
		textNaso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNaso.setColumns(10);
		textNaso.setBounds(107, 247, 161, 28);
		pannelloSecondo.add(textNaso);

		textBecco = new JTextField();
		textBecco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textBecco.setColumns(10);
		textBecco.setBounds(107, 294, 161, 28);
		pannelloSecondo.add(textBecco);

		textCoda = new JTextField();
		textCoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textCoda.setColumns(10);
		textCoda.setBounds(107, 340, 161, 28);
		pannelloSecondo.add(textCoda);

		textPinne = new JTextField();
		textPinne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPinne.setColumns(10);
		textPinne.setBounds(107, 386, 161, 28);
		pannelloSecondo.add(textPinne);

		textCollo = new JTextField();
		textCollo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textCollo.setColumns(10);
		textCollo.setBounds(109, 433, 161, 28);
		pannelloSecondo.add(textCollo);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("images\\CatturaMINECRAFT (1).png"));
		lblNewLabel_1.setBounds(290, 221, 286, 167);
		pannelloSecondo.add(lblNewLabel_1);

		JLabel lblNewLabel_13_1 = new JLabel("la condizione delle varie parti.");
		lblNewLabel_13_1.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblNewLabel_13_1.setBounds(146, 79, 265, 31);
		pannelloSecondo.add(lblNewLabel_13_1);

		JLabel lblIdTartaruga = new JLabel("ID Targhetta:");

		lblIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdTartaruga.setBounds(286, 136, 108, 26);
		pannelloPrimo.add(lblIdTartaruga);

		textIdTartaruga = new JTextField();
		textIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIdTartaruga.setBounds(404, 136, 105, 24);
		pannelloPrimo.add(textIdTartaruga);
		textIdTartaruga.setColumns(10);

		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(122, 182, 58, 18);
		pannelloPrimo.add(lblNome);

		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNome.setBounds(180, 178, 86, 24);
		pannelloPrimo.add(textNome);
		textNome.setColumns(10);

		lblSpecie = new JLabel("Specie:");
		lblSpecie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpecie.setBounds(337, 261, 57, 26);
		pannelloPrimo.add(lblSpecie);

		lblLunghezza = new JLabel("Lunghezza:");
		lblLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLunghezza.setBounds(305, 215, 89, 35);
		pannelloPrimo.add(lblLunghezza);

		lblLarghezza = new JLabel("Larghezza:");
		lblLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLarghezza.setBounds(308, 173, 86, 26);
		pannelloPrimo.add(lblLarghezza);

		lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPeso.setBounds(133, 222, 47, 20);
		pannelloPrimo.add(lblPeso);

		lblLuogoRitrovamento = new JLabel("Luogo di ritrovamento:");
		lblLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLuogoRitrovamento.setBounds(22, 280, 187, 36);
		pannelloPrimo.add(lblLuogoRitrovamento);

		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPeso.setBounds(180, 217, 86, 26);
		pannelloPrimo.add(textPeso);
		textPeso.setColumns(10);

		textLarghezza = new JTextField();
		textLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLarghezza.setBounds(404, 176, 105, 26);
		pannelloPrimo.add(textLarghezza);
		textLarghezza.setColumns(10);

		textLunghezza = new JTextField();
		textLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLunghezza.setBounds(404, 217, 105, 26);
		pannelloPrimo.add(textLunghezza);
		textLunghezza.setColumns(10);

		textLuogoRitrovamento = new JTextField();
		textLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLuogoRitrovamento.setBounds(22, 318, 187, 26);
		pannelloPrimo.add(textLuogoRitrovamento);
		textLuogoRitrovamento.setColumns(10);

		textSpecie = new JTextField();
		textSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textSpecie.setBounds(404, 259, 105, 26);
		pannelloPrimo.add(textSpecie);
		textSpecie.setColumns(10);

		JButton btnSuccessivo = new JButton("Successivo");
		btnSuccessivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				controller.controlloStringaVuota(textIdTartaruga, textNome, textSpecie, textNumCart, textPeso,
						textLarghezza, textLuogoRitrovamento, textLunghezza, pannelloPrimo, pannelloSecondo);
			}
		});
		btnSuccessivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSuccessivo.setBounds(417, 495, 136, 20);
		pannelloPrimo.add(btnSuccessivo);

		lblNewLabel_3 = new JLabel("tutti i parametri. ");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(194, 76, 215, 26);
		pannelloPrimo.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Cartella clinica ");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(194, 9, 165, 36);
		pannelloPrimo.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Inserire correttamente ");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(194, 56, 256, 26);
		pannelloPrimo.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Clicca qui sotto per procedere al ");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(294, 421, 241, 26);
		pannelloPrimo.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("controllo dello stato della tartaruga.");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(290, 458, 263, 26);
		pannelloPrimo.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("images\\bandiera-Tartalove-e1558685413181-700x490 (2) (1) (1).png"));
		lblNewLabel_8.setBounds(0, 386, 241, 167);
		pannelloPrimo.add(lblNewLabel_8);

		lblNumeroCartella = new JLabel("Numero Cartella:");
		lblNumeroCartella.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumeroCartella.setBounds(44, 137, 136, 23);
		pannelloPrimo.add(lblNumeroCartella);

		textDataIns = new JTextField();
		textDataIns.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDataIns.setBounds(404, 304, 105, 26);
		pannelloPrimo.add(textDataIns);
		textDataIns.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Data Accesso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(284, 313, 110, 14);
		pannelloPrimo.add(lblNewLabel_2);

	}
}

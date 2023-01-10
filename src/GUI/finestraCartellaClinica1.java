package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.*;

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
	private JLabel statoTart_1;
	private JTextField textIdStato;
	private JTextField textTesta;
	private JTextField textOcchi;
	private JTextField textNaso;
	private JTextField textBecco;
	private JTextField textCoda;
	private JTextField textPinne;
	private JTextField textCollo;
	
	
	/**
	 * Create the frame.
	 */
	public finestraCartellaClinica1(finestraRiammPrimoacc p1) {
		finestra1 = p1;
		
		dao dao = new dao();
		controller controller = new controller();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 200, 635, 582);
		backGroundPanel = new JPanel();
		backGroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backGroundPanel);
		backGroundPanel.setLayout(new CardLayout(0, 0));
		
		pannelloPrimo = new JPanel();
		pannelloPrimo.setBackground(new Color(172, 205, 210));
		pannelloPrimo.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		pannelloSecondo = new JPanel();
		pannelloSecondo.setForeground(new Color(0, 0, 0));
		pannelloSecondo.setBackground(new Color(172, 205, 210));
		pannelloSecondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		backGroundPanel.add(pannelloPrimo);
		backGroundPanel.add(pannelloSecondo);
		pannelloPrimo.setLayout(null);
		pannelloSecondo.setLayout(null);
		
		Indietro2 = new JButton("Indietro");
		Indietro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pannelloSecondo.setVisible(false);
				pannelloPrimo.setVisible(true);
			}
		});
		Indietro2.setBounds(10, 11, 89, 23);
		pannelloSecondo.add(Indietro2);
		
		lblTesta = new JLabel("Testa");
		lblTesta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTesta.setBounds(53, 156, 46, 14);
		pannelloSecondo.add(lblTesta);
		
		lblOcchi = new JLabel("Occhi");
		lblOcchi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOcchi.setBounds(53, 201, 46, 14);
		pannelloSecondo.add(lblOcchi);
		
		lblNaso = new JLabel("Naso");
		lblNaso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNaso.setBounds(53, 247, 46, 14);
		pannelloSecondo.add(lblNaso);
		
		lblBecco = new JLabel("Becco");
		lblBecco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBecco.setBounds(53, 294, 46, 14);
		pannelloSecondo.add(lblBecco);
		
		lblCollo = new JLabel("Collo");
		lblCollo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCollo.setBounds(53, 433, 46, 14);
		pannelloSecondo.add(lblCollo);
		
		lblPinne = new JLabel("Pinne");
		lblPinne.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPinne.setBounds(53, 386, 46, 14);
		pannelloSecondo.add(lblPinne);
		
		lblCoda = new JLabel("Coda");
		lblCoda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCoda.setBounds(53, 340, 46, 14);
		pannelloSecondo.add(lblCoda);
		
		lblNewLabel_13 = new JLabel("Indicare la condizione delle componenti su una scala da 1 a 10.");
		lblNewLabel_13.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(21, 114, 457, 31);
		pannelloSecondo.add(lblNewLabel_13);
		
		lblNewLabel = new JLabel("Invia al DataBase");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.invioDBSTATO(textTesta.getText(), textOcchi.getText(), textNaso.getText(), textBecco.getText(), textCollo.getText(), textPinne.getText(), textCoda.getText(), textIdStato.getText());
//				dao.insertVasca(textVasca.getText());
				dao.insertTarta(textIdTartaruga.getText(), textNome.getText());
				controller.invioDB(textNumCart.getText(), textIdTartaruga.getText(), textNome.getText(), textLunghezza.getText(), textLarghezza.getText(), textPeso.getText(), textSpecie.getText(), textLuogoRitrovamento.getText());										
				setVisible(false);
			}
		});
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(211, 479, 114, 14);
		pannelloSecondo.add(lblNewLabel);
		
		statoTart_1 = new JLabel("Id Stato");
		statoTart_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statoTart_1.setBounds(35, 59, 64, 26);
		pannelloSecondo.add(statoTart_1);
		
		textIdStato = new JTextField();
		textIdStato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIdStato.setColumns(10);
		textIdStato.setBounds(107, 63, 161, 20);
		pannelloSecondo.add(textIdStato);
		
		textTesta = new JTextField();
		textTesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTesta.setColumns(10);
		textTesta.setBounds(107, 156, 161, 20);
		pannelloSecondo.add(textTesta);
		
		textOcchi = new JTextField();
		textOcchi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textOcchi.setColumns(10);
		textOcchi.setBounds(107, 201, 161, 20);
		pannelloSecondo.add(textOcchi);
		
		textNaso = new JTextField();
		textNaso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNaso.setColumns(10);
		textNaso.setBounds(107, 247, 161, 20);
		pannelloSecondo.add(textNaso);
		
		textBecco = new JTextField();
		textBecco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textBecco.setColumns(10);
		textBecco.setBounds(107, 294, 161, 20);
		pannelloSecondo.add(textBecco);
		
		textCoda = new JTextField();
		textCoda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textCoda.setColumns(10);
		textCoda.setBounds(107, 340, 161, 20);
		pannelloSecondo.add(textCoda);
		
		textPinne = new JTextField();
		textPinne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPinne.setColumns(10);
		textPinne.setBounds(107, 386, 161, 20);
		pannelloSecondo.add(textPinne);
		
		textCollo = new JTextField();
		textCollo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textCollo.setColumns(10);
		textCollo.setBounds(109, 433, 161, 20);
		pannelloSecondo.add(textCollo);
		
		JLabel lblIdTartaruga = new JLabel("ID Tartaruga"); //piu avanti bisogna controllare se è gia presente nel database
		lblIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdTartaruga.setBounds(286, 136, 108, 26);
		pannelloPrimo.add(lblIdTartaruga);
		
		textIdTartaruga = new JTextField();
		textIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIdTartaruga.setBounds(404, 140, 105, 20);
		pannelloPrimo.add(textIdTartaruga);
		textIdTartaruga.setColumns(10);
		
		lblNome = new JLabel("Nome ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(112, 182, 58, 18);
		pannelloPrimo.add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNome.setBounds(180, 182, 86, 20);
		pannelloPrimo.add(textNome);
		textNome.setColumns(10);
		
		lblSpecie = new JLabel("Specie");
		lblSpecie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpecie.setBounds(380, 282, 57, 26);
		pannelloPrimo.add(lblSpecie);
		
		lblLunghezza = new JLabel("Lunghezza");
		lblLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLunghezza.setBounds(308, 215, 86, 35);
		pannelloPrimo.add(lblLunghezza);
		
		lblLarghezza = new JLabel("Larghezza");
		lblLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLarghezza.setBounds(308, 173, 86, 26);
		pannelloPrimo.add(lblLarghezza);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPeso.setBounds(123, 222, 47, 20);
		pannelloPrimo.add(lblPeso);
		
		lblLuogoRitrovamento = new JLabel("Luogo di ritrovamento");
		lblLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLuogoRitrovamento.setBounds(84, 277, 175, 36);
		pannelloPrimo.add(lblLuogoRitrovamento);
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPeso.setBounds(180, 223, 86, 20);
		pannelloPrimo.add(textPeso);
		textPeso.setColumns(10);
		
		textLarghezza = new JTextField();
		textLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLarghezza.setBounds(404, 182, 105, 20);
		pannelloPrimo.add(textLarghezza);
		textLarghezza.setColumns(10);
		
		textLunghezza = new JTextField();
		textLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLunghezza.setBounds(404, 223, 105, 20);
		pannelloPrimo.add(textLunghezza);
		textLunghezza.setColumns(10);
		
		textLuogoRitrovamento = new JTextField();
		textLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLuogoRitrovamento.setBounds(84, 324, 175, 20);
		pannelloPrimo.add(textLuogoRitrovamento);
		textLuogoRitrovamento.setColumns(10);
		
		textSpecie = new JTextField();
		textSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textSpecie.setBounds(357, 324, 105, 20);
		pannelloPrimo.add(textSpecie);
		textSpecie.setColumns(10);
		
		
		
		JButton btnSuccessivo = new JButton("Successivo");
		btnSuccessivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textIdTartaruga.getText().equals("") || textNome.getText().equals("") || textSpecie.getText().equals("") || textNumCart.getText().equals("") || textPeso.getText().equals("") || textLarghezza.getText().equals("") || textLuogoRitrovamento.getText().equals("") || textLunghezza.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Devi inserire tutti i parametri.");
				}
				else {
					
					pannelloPrimo.setVisible(false);
					pannelloSecondo.setVisible(true);
				}			
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
		
		lblNumeroCartella = new JLabel("Numero Cartella");
		lblNumeroCartella.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumeroCartella.setBounds(34, 138, 136, 23);
		pannelloPrimo.add(lblNumeroCartella);
		
		textNumCart = new JTextField();
		textNumCart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNumCart.setBounds(180, 142, 86, 20);
		pannelloPrimo.add(textNumCart);
		textNumCart.setColumns(10);
	}
}

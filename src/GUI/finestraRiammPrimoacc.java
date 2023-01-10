package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Controller.*;

public class finestraRiammPrimoacc extends JFrame {

	private JPanel pannelloPrimo, pannelloSecondo, backGroundPanel;
	public primaFinestraMedico finestraMezzo;
	private JTextField textFieldRicerca;
	private JTextField inserimentoVasca;
	dao dao = new dao();
	/**
	 * Create the frame.
	 */
	public finestraRiammPrimoacc(primaFinestraMedico f1) {
		finestraMezzo = f1;
		finestraCartellaClinica1 cartmedica1 = new finestraCartellaClinica1(this);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 300, 526, 390);
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
				dao.insertNumeroVasca(inserimentoVasca.getText(), inserimentoVasca.getText());
				setVisible(false);
				cartmedica1.setVisible(true);
			}
		});
		successivo.setForeground(new Color(0, 64, 128));
		successivo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		successivo.setBounds(399, 231, 71, 14);
		pannelloPrimo.add(successivo);
		successivo.setVisible(false);
		
		JButton btnPrimoAccesso = new JButton("Primo Accesso");
		btnPrimoAccesso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrimoAccesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SCRITTURA3.setVisible(true);
				SCRITTURA4.setVisible(true);
				SCRITTURA5.setVisible(true);
				successivo.setVisible(true);	
				inserimentoVasca.setVisible(true);
//				setVisible(false);
//				cartmedica1.setVisible(true);
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
		lblNewLabel_1.setBounds(200, 242, 118, 99);
		pannelloPrimo.add(lblNewLabel_1);
		
		textFieldRicerca = new JTextField();
		textFieldRicerca.setBounds(23, 212, 212, 23);
		pannelloPrimo.add(textFieldRicerca);
		textFieldRicerca.setColumns(10);
		textFieldRicerca.setVisible(false);
		
		JLabel lblSCRITTURA = new JLabel("Inserisci l'ID della targhetta");
		lblSCRITTURA.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblSCRITTURA.setBounds(23, 157, 242, 23);
		pannelloPrimo.add(lblSCRITTURA);
		lblSCRITTURA.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("");
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
		
		
		JButton btnNewButton = new JButton("Riammessa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldRicerca.setVisible(true);
				lblSCRITTURA.setVisible(true);
				lblSCRITTURA2.setVisible(true);
				btnNewButton_1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(43, 102, 140, 23);
		pannelloPrimo.add(btnNewButton);
		
		inserimentoVasca = new JTextField();																		
		inserimentoVasca.setBounds(303, 213, 167, 20);
		pannelloPrimo.add(inserimentoVasca);
		inserimentoVasca.setColumns(10);
		inserimentoVasca.setVisible(false);
		

		
	}

}

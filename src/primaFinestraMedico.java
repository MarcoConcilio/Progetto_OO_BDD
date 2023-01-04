import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	/**
	 * Create the frame.
	 */
	public primaFinestraMedico(finestraLOGIN m1) {
		finestraMain = m1;
		finestraRiammPrimoacc finestramezzo = new finestraRiammPrimoacc(this);
		controller controllore = new controller();
		
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
		buttonCartClin.setBounds(461, 71, 217, 23);
		primoPannello.add(buttonCartClin);
		
		textVisualizzaTarta = new JTextField();
		textVisualizzaTarta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textVisualizzaTarta.setBounds(58, 69, 291, 32);
		primoPannello.add(textVisualizzaTarta);
		textVisualizzaTarta.setColumns(10);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\Uni Marco\\Tartarughe_Marine\\images\\Cattura (1).png"));
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
			@Override
			public void mouseClicked(MouseEvent e) {
				primoPannello.setVisible(false);
				secondoPannello.setVisible(true);
			}
		});
		textFieldVisual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldVisual.setBounds(58, 112, 291, 32);
		primoPannello.add(textFieldVisual);
		textFieldVisual.setColumns(10);
		textFieldVisual.setVisible(false);
		textFieldVisual.setEditable(false);
		
		btnIndietro2 = new JButton("New button");
		btnIndietro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondoPannello.setVisible(false);
				primoPannello.setVisible(true);
			}
		});
		btnIndietro2.setBounds(10, 11, 89, 23);
		secondoPannello.add(btnIndietro2);
	}
}

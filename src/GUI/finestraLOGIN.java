package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.personaleDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import Controller.*;

public class finestraLOGIN extends JFrame {

	private JPanel pannelloBase;
	private JTextField textUsername;
	private String stringa;

	public finestraLOGIN() {
		setResizable(false);
		primaFinestraMedico finestra2 = new primaFinestraMedico(this);
		finestraAltriLavoratori finestraAltri = new finestraAltriLavoratori(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 499, 449);
		pannelloBase = new JPanel();
		pannelloBase.setBackground(new Color(165, 206, 218));
		pannelloBase.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pannelloBase);
		pannelloBase.setLayout(null);

		JLabel jlabelMatricola = new JLabel("Matricola");
		jlabelMatricola.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlabelMatricola.setBounds(35, 196, 92, 20);
		pannelloBase.add(jlabelMatricola);

		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textUsername.setBounds(113, 192, 172, 28);
		pannelloBase.add(textUsername);
		textUsername.setColumns(10);

		JButton accedi = new JButton("Accedi");
		accedi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		accedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller controller = new controller();
				controller.cambioFinestraLOG(finestra2, finestraAltri, stringa, textUsername);
			}
		});
		accedi.setBounds(134, 231, 122, 28);
		pannelloBase.add(accedi);

		JLabel lblNomeAzienda = new JLabel("TURTPLANET");
		lblNomeAzienda.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNomeAzienda.setBounds(29, 59, 227, 71);
		pannelloBase.add(lblNomeAzienda);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("images\\202691-illustrazione-di-tartarughe-vettoriale.png"));
		lblNewLabel_1.setBounds(294, 17, 201, 169);
		pannelloBase.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("images\\6UCP6P7T2hdXq6fMoAAAAAElFTkSuQmCC (1) (1) (1).png"));
		lblNewLabel_2.setBounds(10, 328, 67, 71);
		pannelloBase.add(lblNewLabel_2);
	}
}

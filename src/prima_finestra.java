import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prima_finestra extends JFrame {

	private JPanel pannello_base;
	private JPasswordField passwordField;
	private JTextField textUsername;
	public finestra_medico finestra2;
	String nome_utente;
	boolean flag = false;
	/**
	 * Create the frame.
	 */
	public prima_finestra() {
		finestra2 = new finestra_medico(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 483, 396);
		pannello_base = new JPanel();
		pannello_base.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pannello_base);
		pannello_base.setLayout(null);
		pannello_base.setBackground(Color.pink);
		
		JLabel lblNewLabel = new JLabel("RECUPERO DI MAMME");
		lblNewLabel.setBounds(146, 23, 163, 14);
		pannello_base.add(lblNewLabel);
		
		JLabel username = new JLabel("USERNAME");
		username.setBounds(69, 77, 67, 14);
		pannello_base.add(username);
		
		JLabel password = new JLabel("PASSWORD");
		password.setBounds(61, 134, 75, 14);
		pannello_base.add(password);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 131, 138, 20);
		pannello_base.add(passwordField);
		
		textUsername = new JTextField();
		textUsername.setBounds(146, 74, 138, 20);
		pannello_base.add(textUsername);
		textUsername.setColumns(10);
		
		JButton accesso = new JButton("Accedi");
		accesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				finestra2.setVisible(true);
				/*do{
					nome_utente = textUsername.getText();
					
					if(nome_utente == "Admin") {
						setVisible(false);
						finestra2.setVisible(true);
					}
					else {
						System.out.println("Inserisci nome adatto");
					}
				}while(flag == true);*/
			}
		});
		accesso.setBounds(220, 162, 89, 23);
		pannello_base.add(accesso);
	}

}

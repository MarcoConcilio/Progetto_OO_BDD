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

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	public seconda_finestra finestra2;
	
	
	/**
	 * Create the frame.
	 */
	public prima_finestra() {
		finestra2 = new seconda_finestra(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 483, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RECUPERO DI MAMME");
		lblNewLabel.setBounds(146, 23, 163, 14);
		contentPane.add(lblNewLabel);
		
		JLabel USERNAME = new JLabel("USERNAME");
		USERNAME.setBounds(69, 77, 67, 14);
		contentPane.add(USERNAME);
		
		JLabel password = new JLabel("PASSWORD");
		password.setBounds(61, 134, 75, 14);
		contentPane.add(password);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 131, 138, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(146, 74, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton accesso = new JButton("Accedi");
		accesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				finestra2.setVisible(true);
			}
		});
		accesso.setBounds(220, 162, 89, 23);
		contentPane.add(accesso);
	}

}

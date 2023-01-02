import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFrame extends JFrame {

	private JPanel pannelloBase;
	private JTextField textUsername;
	private JPasswordField passwordField;
	public String nomeDottore = "Dott Admin";
	public String passDottore = "Dott Pass";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		finestra_dottore finestra2 = new finestra_dottore(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 524, 437);
		pannelloBase = new JPanel();
		pannelloBase.setBackground(new Color(255, 128, 128));
		pannelloBase.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pannelloBase);
		pannelloBase.setLayout(null);
		
		JLabel jlabelUsername = new JLabel("Username");
		jlabelUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlabelUsername.setBounds(64, 80, 74, 14);
		pannelloBase.add(jlabelUsername);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUsername.setBounds(168, 79, 162, 20);
		pannelloBase.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(64, 131, 74, 14);
		pannelloBase.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(168, 130, 162, 20);
		pannelloBase.add(passwordField);
		
		JButton accedi = new JButton("Accedi");
		accedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				//finestra2.setVisible(true);
				
				//METODO DA PORTARE POI NEL CONTROLLER
				if(nomeDottore.equalsIgnoreCase(textUsername.getText())) {
					if(passDottore.equals(passwordField.getText())) {
						setVisible(false);
						finestra2.setVisible(true);
					}
					else {
						System.out.println("Password errata");
					}
				}
				else {
					System.out.println("Nome utente errato");
				}
				//FINE METODO DA PORTARE NEL CONTROLLER
			
			}	
		});
		accedi.setBounds(209, 174, 89, 23);
		pannelloBase.add(accedi);
	}
}


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class MainFrame extends JFrame {

	private JPanel pannelloBase;
	private JTextField textUsername;
	private JPasswordField passwordField;
	public String nomeDottore = "a";
	public String passDottore = "a";

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
		setResizable(false);
		finestraMedicaPrincipale finestra2 = new finestraMedicaPrincipale(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 499, 449);
		pannelloBase = new JPanel();
		pannelloBase.setBackground(new Color(165, 206, 218));
		pannelloBase.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pannelloBase);
		pannelloBase.setLayout(null);
		
		JLabel jlabelUsername = new JLabel("Username");
		jlabelUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlabelUsername.setBounds(23, 192, 92, 20);
		pannelloBase.add(jlabelUsername);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textUsername.setBounds(113, 188, 172, 28);
		pannelloBase.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(31, 231, 84, 20);
		pannelloBase.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(113, 227, 172, 28);
		pannelloBase.add(passwordField);
		
		JButton accedi = new JButton("Accedi");
		accedi.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
						JOptionPane.showMessageDialog(null, "Password errata");					
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Nome utente errato");
				}
				//FINE METODO DA PORTARE NEL CONTROLLER
			
			}	
		});
		accedi.setBounds(142, 266, 122, 28);
		pannelloBase.add(accedi);
		
		JLabel lblNomeAzienda = new JLabel("TURTLANET");
		lblNomeAzienda.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNomeAzienda.setBounds(29, 59, 208, 71);
		pannelloBase.add(lblNomeAzienda);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gaeco\\OneDrive\\Desktop\\202691-illustrazione-di-tartarughe-vettoriale.png"));
		lblNewLabel_1.setBounds(294, 17, 201, 169);
		pannelloBase.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\gaeco\\OneDrive\\Desktop\\6UCP6P7T2hdXq6fMoAAAAAElFTkSuQmCC (1) (1) (1).png"));
		lblNewLabel_2.setBounds(10, 328, 67, 71);
		pannelloBase.add(lblNewLabel_2);
	}
}


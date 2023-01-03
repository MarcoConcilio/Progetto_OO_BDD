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
		
		JLabel jlabelMatricola = new JLabel("Matricola");
		jlabelMatricola.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlabelMatricola.setBounds(35, 196, 92, 20);
		pannelloBase.add(jlabelMatricola);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textUsername.setBounds(113, 192, 172, 28);
		pannelloBase.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(35, 227, 84, 20);
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
						JOptionPane.showMessageDialog(null, "Credenziali errate");					
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Credenziali errate");
				}
				//FINE METODO DA PORTARE NEL CONTROLLER
			
			}	
		});
		accedi.setBounds(136, 266, 122, 28);
		pannelloBase.add(accedi);
		
		JLabel lblNomeAzienda = new JLabel("TURTLANET");
		lblNomeAzienda.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNomeAzienda.setBounds(29, 59, 208, 71);
		pannelloBase.add(lblNomeAzienda);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Uni Marco\\Tartarughe_Marine\\images\\202691-illustrazione-di-tartarughe-vettoriale.png"));
		lblNewLabel_1.setBounds(294, 17, 201, 169);
		pannelloBase.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Uni Marco\\Tartarughe_Marine\\images\\6UCP6P7T2hdXq6fMoAAAAAElFTkSuQmCC (1) (1) (1).png"));
		lblNewLabel_2.setBounds(10, 328, 67, 71);
		pannelloBase.add(lblNewLabel_2);
	}
}


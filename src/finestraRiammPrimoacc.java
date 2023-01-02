import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class finestraRiammPrimoacc extends JFrame {

	private JPanel contentPane;
	public finestraMedicaPrincipale finestraMezzo;
	/**
	 * Create the frame.
	 */
	public finestraRiammPrimoacc(finestraMedicaPrincipale f1) {
		finestraMezzo = f1;
		cartellaMedica1 cartmedica1 = new cartellaMedica1(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPrimoAccesso = new JButton("Primo Accesso");
		btnPrimoAccesso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrimoAccesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				cartmedica1.setVisible(true);
			}
		});
		btnPrimoAccesso.setBounds(257, 134, 167, 23);
		contentPane.add(btnPrimoAccesso);
		
		JButton btnIndietro = new JButton("Indietro");
		btnIndietro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				f1.setVisible(true);
			}
		});
		btnIndietro.setBounds(0, 11, 105, 23);
		contentPane.add(btnIndietro);
	}

}

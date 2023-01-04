import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class finestraCartellaClinica2 extends JFrame {

	public finestraCartellaClinica1 cartellaMedica1;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public finestraCartellaClinica2(finestraCartellaClinica1 c1) {
		cartellaMedica1 = c1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIndietro = new JButton("Indietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				c1.setVisible(true);
			}
			
		});
		btnIndietro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIndietro.setBounds(21, 418, 106, 23);
		contentPane.add(btnIndietro);
	}

}

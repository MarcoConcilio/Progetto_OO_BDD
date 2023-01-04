import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class finestraAltriLavoratori extends JFrame {

	private JPanel contentPane;
	public MainFrame finestraMain;

	/**
	 * Create the frame.
	 */
	public finestraAltriLavoratori(MainFrame m1) {
		finestraMain = m1;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class seconda_finestra extends JFrame {

	private JPanel contentPane;
	public prima_finestra finestra1;
	/**
	 * Create the frame.
	 */
	public seconda_finestra(prima_finestra p1) {
		finestra1 = p1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}

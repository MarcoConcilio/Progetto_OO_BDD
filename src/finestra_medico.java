import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JRadioButton;

public class finestra_medico extends JFrame {

	private JPanel pannello_base;
	public prima_finestra finestra1;
	/**
	 * Create the frame.
	 */
	public finestra_medico(prima_finestra p1) {
		finestra1 = p1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 714);
		pannello_base = new JPanel();
		pannello_base.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pannello_base);
		pannello_base.setLayout(null);
	}
}

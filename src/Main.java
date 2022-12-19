import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
	public Main() {
	}

	private JPanel contentPane;
	public prima_finestra frame = new prima_finestra();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					prima_finestra frame = new prima_finestra(); 
					frame.setVisible(true);
			}
		});		
	}
}

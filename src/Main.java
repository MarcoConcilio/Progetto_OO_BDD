import java.awt.EventQueue;

import CollegamentoDataBase.collegamentoDB;
import GUI.finestraLOGIN;

public class Main {
	
	public static void main(String[] args) {
		collegamentoDB collegamento = new collegamentoDB();
		
		collegamento.getConnection();
		
		System.out.println(collegamento.getDBConnection());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finestraLOGIN frame = new finestraLOGIN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

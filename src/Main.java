import java.awt.EventQueue;

public class Main {
	
	public static void main(String[] args) {
		collegamentoDB collegamento = new collegamentoDB();
		
		collegamento.getConnection();
		
		System.out.println(collegamento.getDBConnection());
		
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
}

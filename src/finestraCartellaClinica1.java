import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class finestraCartellaClinica1 extends JFrame {

	private JPanel contentPane;
	public finestraRiammPrimoacc finestra1;
	private JTextField textIdTartaruga;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblSpecie;
	private JLabel lblLunghezza;
	private JLabel lblLarghezza;
	private JLabel lblPeso;
	private JLabel lblLuogoRitrovamento;
	private JTextField textPeso;
	private JTextField textLarghezza;
	private JTextField textLunghezza;
	private JTextField textLuogoRitrovamento;
	private JTextField textSpecie;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNumeroCartella;
	private JTextField textNumCart;
	private JLabel lblinvia;
	private JTextField textVasca;
	private JLabel lblNewLabel_10;
	
	/**
	 * Create the frame.
	 */
	public finestraCartellaClinica1(finestraRiammPrimoacc p1) {
		finestra1 = p1;
		finestraCartellaClinica2 finestraMedica2 = new finestraCartellaClinica2(this);
		controller controllore = new controller();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 595, 638);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(172, 205, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdTartaruga = new JLabel("ID Tartaruga"); //piu avanti bisogna controllare se è gia presente nel database
		lblIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdTartaruga.setBounds(286, 136, 108, 26);
		contentPane.add(lblIdTartaruga);
		
		textIdTartaruga = new JTextField();
		textIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIdTartaruga.setBounds(404, 140, 105, 20);
		contentPane.add(textIdTartaruga);
		textIdTartaruga.setColumns(10);
		
		lblNome = new JLabel("Nome ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(112, 182, 58, 18);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNome.setBounds(180, 182, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		lblSpecie = new JLabel("Specie");
		lblSpecie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpecie.setBounds(330, 257, 58, 26);
		contentPane.add(lblSpecie);
		
		lblLunghezza = new JLabel("Lunghezza");
		lblLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLunghezza.setBounds(84, 253, 86, 35);
		contentPane.add(lblLunghezza);
		
		lblLarghezza = new JLabel("Larghezza");
		lblLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLarghezza.setBounds(301, 219, 93, 26);
		contentPane.add(lblLarghezza);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPeso.setBounds(123, 222, 47, 20);
		contentPane.add(lblPeso);
		
		lblLuogoRitrovamento = new JLabel("Luogo di ritrovamento");
		lblLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLuogoRitrovamento.setBounds(208, 307, 175, 36);
		contentPane.add(lblLuogoRitrovamento);
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPeso.setBounds(180, 223, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textLarghezza = new JTextField();
		textLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLarghezza.setBounds(404, 223, 105, 20);
		contentPane.add(textLarghezza);
		textLarghezza.setColumns(10);
		
		textLunghezza = new JTextField();
		textLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLunghezza.setBounds(180, 261, 86, 20);
		contentPane.add(textLunghezza);
		textLunghezza.setColumns(10);
		
		textLuogoRitrovamento = new JTextField();
		textLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLuogoRitrovamento.setBounds(194, 354, 200, 20);
		contentPane.add(textLuogoRitrovamento);
		textLuogoRitrovamento.setColumns(10);
		
		textSpecie = new JTextField();
		textSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textSpecie.setBounds(401, 261, 108, 20);
		contentPane.add(textSpecie);
		textSpecie.setColumns(10);
		
		
		
		JButton btnSuccessivo = new JButton("Successivo");
		btnSuccessivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textIdTartaruga.getText().equals("") || textNome.getText().equals("") || textSpecie.getText().equals("") || textNumCart.getText().equals("") || textVasca.getText().equals("") || textPeso.getText().equals("") || textLarghezza.getText().equals("") || textLuogoRitrovamento.getText().equals("") || textLunghezza.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Devi inserire i parametri obbligatori.");
				}
				else {
					
					setVisible(false);
					finestraMedica2.setVisible(true);
				}			
			}
		});
		btnSuccessivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSuccessivo.setBounds(417, 537, 136, 20);
		contentPane.add(btnSuccessivo);
		
		lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(512, 132, 18, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(268, 173, 18, 20);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(507, 242, 46, 26);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("i parametri obbligatori che sono indicati da  '*'. ");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(119, 83, 342, 26);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Cartella clinica ");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(208, 9, 165, 36);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Si prega di inserire almeno");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(186, 56, 241, 26);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Clicca qui sotto per procedere al ");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(289, 450, 241, 26);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("controllo dello stato della tartaruga.");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(279, 485, 263, 26);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\Uni Marco\\Tartarughe_Marine\\images\\bandiera-Tartalove-e1558685413181-700x490 (2) (1) (1).png"));
		lblNewLabel_8.setBounds(-14, 421, 241, 167);
		contentPane.add(lblNewLabel_8);
		
		lblNumeroCartella = new JLabel("Numero Cartella");
		lblNumeroCartella.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumeroCartella.setBounds(34, 138, 136, 23);
		contentPane.add(lblNumeroCartella);
		
		textNumCart = new JTextField();
		textNumCart.setBounds(180, 142, 86, 20);
		contentPane.add(textNumCart);
		textNumCart.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("*");
		lblNewLabel_9.setForeground(new Color(128, 0, 0));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(268, 132, 18, 20);
		contentPane.add(lblNewLabel_9);
		
		lblinvia = new JLabel("Invia al DataBase");
		lblinvia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				controllore.insertVasca(textVasca.getText());
				controllore.insertTarta(textIdTartaruga.getText(), textNome.getText(), textVasca.getText());
				controllore.invioDB(textNumCart.getText(), textIdTartaruga.getText(), textNome.getText(), textLunghezza.getText(), textLarghezza.getText(), textPeso.getText(), textSpecie.getText(), textLuogoRitrovamento.getText());
		
			}
		});
		lblinvia.setForeground(new Color(0, 64, 128));
		lblinvia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblinvia.setBounds(404, 384, 121, 26);
		contentPane.add(lblinvia);
		
		textVasca = new JTextField();
		textVasca.setBounds(404, 184, 105, 20);
		contentPane.add(textVasca);
		textVasca.setColumns(10);
		
		JLabel lblIdVasca = new JLabel("Id Vasca");
		lblIdVasca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdVasca.setBounds(305, 184, 89, 14);
		contentPane.add(lblIdVasca);
		
		lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(new Color(128, 0, 0));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(512, 173, 18, 20);
		contentPane.add(lblNewLabel_10);
	}
}

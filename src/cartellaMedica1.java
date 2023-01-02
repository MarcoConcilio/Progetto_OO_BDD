import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cartellaMedica1 extends JFrame {

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
	/**
	 * Create the frame.
	 */
	public cartellaMedica1(finestraRiammPrimoacc p1) {
		finestra1 = p1;
		cartellaMedica2 finestraMedica2 = new cartellaMedica2(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 420, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdTartaruga = new JLabel("ID Tartaruga"); //piu avanti bisogna controllare se è gia presente nel database
		lblIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdTartaruga.setBounds(64, 179, 108, 26);
		contentPane.add(lblIdTartaruga);
		
		textIdTartaruga = new JTextField();
		textIdTartaruga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIdTartaruga.setBounds(182, 183, 86, 20);
		contentPane.add(textIdTartaruga);
		textIdTartaruga.setColumns(10);
		
		lblNome = new JLabel("Nome ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(112, 216, 58, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNome.setBounds(182, 216, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		lblSpecie = new JLabel("Specie");
		lblSpecie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpecie.setBounds(258, 403, 58, 26);
		contentPane.add(lblSpecie);
		
		lblLunghezza = new JLabel("Lunghezza");
		lblLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLunghezza.setBounds(84, 299, 86, 35);
		contentPane.add(lblLunghezza);
		
		lblLarghezza = new JLabel("Larghezza");
		lblLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLarghezza.setBounds(84, 272, 93, 26);
		contentPane.add(lblLarghezza);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPeso.setBounds(122, 241, 47, 20);
		contentPane.add(lblPeso);
		
		lblLuogoRitrovamento = new JLabel("Luogo di ritrovamento");
		lblLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLuogoRitrovamento.setBounds(27, 398, 189, 36);
		contentPane.add(lblLuogoRitrovamento);
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPeso.setBounds(182, 244, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textLarghezza = new JTextField();
		textLarghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLarghezza.setBounds(182, 278, 86, 20);
		contentPane.add(textLarghezza);
		textLarghezza.setColumns(10);
		
		textLunghezza = new JTextField();
		textLunghezza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLunghezza.setBounds(182, 309, 86, 20);
		contentPane.add(textLunghezza);
		textLunghezza.setColumns(10);
		
		textLuogoRitrovamento = new JTextField();
		textLuogoRitrovamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLuogoRitrovamento.setBounds(27, 440, 176, 20);
		contentPane.add(textLuogoRitrovamento);
		textLuogoRitrovamento.setColumns(10);
		
		textSpecie = new JTextField();
		textSpecie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textSpecie.setBounds(243, 440, 86, 20);
		contentPane.add(textSpecie);
		textSpecie.setColumns(10);
		
		JButton btnSuccessivo = new JButton("Successivo");
		btnSuccessivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				finestraMedica2.setVisible(true);
			}
		});
		btnSuccessivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSuccessivo.setBounds(258, 568, 136, 20);
		contentPane.add(btnSuccessivo);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditRecordFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the frame.
	 */
	public EditRecordFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 420);
		setTitle("Szerkesztés");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbljNyomtatHozzadsa = new JLabel("Nyomtató adatainak szerkesztése");
		lbljNyomtatHozzadsa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbljNyomtatHozzadsa.setBounds(15, 16, 422, 25);
		contentPane.add(lbljNyomtatHozzadsa);
		
		JLabel lblNv = new JLabel("Név:");
		lblNv.setBounds(25, 88, 33, 20);
		contentPane.add(lblNv);
		
		textField = new JTextField();
		textField.setBounds(124, 85, 200, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTpus = new JLabel("Típus:");
		lblTpus.setBounds(25, 124, 45, 20);
		contentPane.add(lblTpus);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 121, 200, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSzriaszm = new JLabel("Szériaszám");
		lblSzriaszm.setBounds(25, 160, 84, 20);
		contentPane.add(lblSzriaszm);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 157, 200, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIpcm = new JLabel("IP-cím:");
		lblIpcm.setBounds(25, 196, 52, 20);
		contentPane.add(lblIpcm);
		
		JLabel lblNewLabel = new JLabel("Fekete ár:");
		lblNewLabel.setBounds(25, 232, 70, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSznesr = new JLabel("Színes ár:");
		lblSznesr.setBounds(25, 268, 69, 20);
		contentPane.add(lblSznesr);
		
		textField_3 = new JTextField();
		textField_3.setBounds(124, 229, 200, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 265, 200, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(124, 193, 200, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnHozzads = new JButton("Mentés");
		btnHozzads.setBounds(450, 85, 200, 45);
		contentPane.add(btnHozzads);
		
		JButton btnMgse = new JButton("Mégse");
		btnMgse.setBounds(450, 157, 200, 45);
		contentPane.add(btnMgse);
		
		this.setVisible(true);
	}

}

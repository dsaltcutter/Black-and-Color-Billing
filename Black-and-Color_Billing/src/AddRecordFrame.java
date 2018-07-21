import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddRecordFrame extends JFrame {

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
	public AddRecordFrame(int index) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 420);
		setTitle("Új nyomtató felvétele");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbljNyomtatHozzadsa = new JLabel("Új nyomtató felvétele az adatbázisba");
		lbljNyomtatHozzadsa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbljNyomtatHozzadsa.setBounds(15, 16, 422, 25);
		contentPane.add(lbljNyomtatHozzadsa);
		
		JLabel lblNv = new JLabel("Név:");
		lblNv.setBounds(15, 125, 33, 20);
		contentPane.add(lblNv);
		
		textField = new JTextField();
		textField.setBounds(114, 122, 200, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTpus = new JLabel("Típus:");
		lblTpus.setBounds(15, 161, 45, 20);
		contentPane.add(lblTpus);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 158, 200, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSzriaszm = new JLabel("Szériaszám");
		lblSzriaszm.setBounds(15, 197, 84, 20);
		contentPane.add(lblSzriaszm);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 194, 200, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIpcm = new JLabel("IP-cím:");
		lblIpcm.setBounds(15, 233, 52, 20);
		contentPane.add(lblIpcm);
		
		JLabel lblNewLabel = new JLabel("Fekete ár:");
		lblNewLabel.setBounds(15, 269, 70, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSznesr = new JLabel("Színes ár:");
		lblSznesr.setBounds(15, 305, 69, 20);
		contentPane.add(lblSznesr);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 266, 200, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(114, 302, 200, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(114, 230, 200, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMindenMezKitltse = new JLabel("Minden mezõ kitöltése szükséges!");
		lblMindenMezKitltse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMindenMezKitltse.setBounds(450, 305, 207, 20);
		contentPane.add(lblMindenMezKitltse);
		
		JButton btnHozzads = new JButton("Hozzáadás");
		btnHozzads.setBounds(450, 85, 200, 45);
		contentPane.add(btnHozzads);
		
		JButton btnMgse = new JButton("Mégse");
		btnMgse.setBounds(450, 158, 200, 45);
		contentPane.add(btnMgse);
		
		JLabel lblTbla = new JLabel("Tábla:");
		lblTbla.setBounds(16, 89, 69, 20);
		contentPane.add(lblTbla);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Budapest", "Sárvár", "Sárvár Lenovo", "Zalaegerszeg", "Gyál", "Páty"}));
		comboBox.setSelectedIndex(index);
		comboBox.setBounds(114, 86, 200, 26);
		contentPane.add(comboBox);
		
		addWindowListener( new WindowAdapter() {
			   public void windowOpened( WindowEvent e ){
			        btnHozzads.requestFocus();
			   }
		}); 
		
		this.setVisible(true);
	}
}

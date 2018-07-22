package ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.AddRecord;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddRecordFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textNev;
	private JTextField textTipus;
	private JTextField textSerialNumber;
	private JTextField textFekete;
	private JTextField textSzines;
	private JTextField textIP;
	private JComboBox comboTabla;

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
		
		JLabel lblTbla = new JLabel("Tábla:");
		lblTbla.setBounds(16, 89, 69, 20);
		contentPane.add(lblTbla);
		
		comboTabla = new JComboBox();
		comboTabla.setModel(new DefaultComboBoxModel(new String[] {"Budapest", "Sárvár", "Sárvár Lenovo", "Zalaegerszeg", "Gyál", "Páty"}));
		comboTabla.setSelectedIndex(index);
		comboTabla.setBounds(114, 86, 200, 26);
		contentPane.add(comboTabla);
		
		JLabel lblNv = new JLabel("Név:");
		lblNv.setBounds(15, 125, 33, 20);
		contentPane.add(lblNv);
		
		textNev = new JTextField();
		textNev.setBounds(114, 122, 200, 26);
		contentPane.add(textNev);
		textNev.setColumns(10);
		
		JLabel lblTpus = new JLabel("Típus:");
		lblTpus.setBounds(15, 161, 45, 20);
		contentPane.add(lblTpus);
		
		textTipus = new JTextField();
		textTipus.setBounds(114, 158, 200, 26);
		contentPane.add(textTipus);
		textTipus.setColumns(10);
		
		JLabel lblSzriaszm = new JLabel("Szériaszám");
		lblSzriaszm.setBounds(15, 197, 84, 20);
		contentPane.add(lblSzriaszm);
		
		textSerialNumber = new JTextField();
		textSerialNumber.setBounds(114, 194, 200, 26);
		contentPane.add(textSerialNumber);
		textSerialNumber.setColumns(10);
		
		JLabel lblIpcm = new JLabel("IP-cím:");
		lblIpcm.setBounds(15, 233, 52, 20);
		contentPane.add(lblIpcm);
		
		JLabel lblNewLabel = new JLabel("Fekete ár:");
		lblNewLabel.setBounds(15, 269, 70, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSznesr = new JLabel("Színes ár:");
		lblSznesr.setBounds(15, 305, 69, 20);
		contentPane.add(lblSznesr);
		
		textFekete = new JTextField();
		textFekete.setBounds(114, 266, 200, 26);
		contentPane.add(textFekete);
		textFekete.setColumns(10);
		
		textSzines = new JTextField();
		textSzines.setBounds(114, 302, 200, 26);
		contentPane.add(textSzines);
		textSzines.setColumns(10);
		
		textIP = new JTextField();
		textIP.setBounds(114, 230, 200, 26);
		contentPane.add(textIP);
		textIP.setColumns(10);
		
		JLabel lblMindenMezKitltse = new JLabel("Minden mezõ kitöltése szükséges!");
		lblMindenMezKitltse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMindenMezKitltse.setBounds(450, 305, 207, 20);
		contentPane.add(lblMindenMezKitltse);
		
		JButton btnHozzads = new JButton("Hozzáadás");
		btnHozzads.setBounds(450, 85, 200, 45);
		btnHozzads.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboTabla.getSelectedItem().toString().isEmpty() || textNev.getText().isEmpty() || textTipus.getText().isEmpty() || textSerialNumber.getText().isEmpty() || textIP.getText().isEmpty() || textFekete.getText().isEmpty() || textSzines.getText().isEmpty()) {
					new ErrorFrame();
				} else {
					String[] adatok = {comboTabla.getSelectedItem().toString(), textNev.getText(), textTipus.getText(), textSerialNumber.getText(), textIP.getText(), textFekete.getText(), textSzines.getText()};
					new AddRecord(adatok);
					dispose();
				}
			}
		});
		contentPane.add(btnHozzads);
		
		JButton btnMgse = new JButton("Mégse");
		btnMgse.setBounds(450, 158, 200, 45);
		btnMgse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnMgse);
		
		addWindowListener( new WindowAdapter() {
			   public void windowOpened( WindowEvent e ){
			        btnHozzads.requestFocus();
			   }
		}); 
		
		this.setVisible(true);
	}
}

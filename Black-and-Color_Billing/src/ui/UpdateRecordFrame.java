package ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import database.UpdateRecord;

public class UpdateRecordFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textNev;
	private JTextField textTipus;
	private JTextField textSerialNumber;
	private JTextField textFekete;
	private JTextField textSzines;
	private JTextField textIP;

	/**
	 * Create the frame.
	 */
	public UpdateRecordFrame(String[] record) {
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
		
		textNev = new JTextField();
		textNev.setBounds(124, 85, 200, 26);
		textNev.setText(record[1]);
		contentPane.add(textNev);
		textNev.setColumns(10);
		
		JLabel lblTpus = new JLabel("Típus:");
		lblTpus.setBounds(25, 124, 45, 20);
		contentPane.add(lblTpus);
		
		textTipus = new JTextField();
		textTipus.setBounds(124, 121, 200, 26);
		textTipus.setText(record[2]);
		contentPane.add(textTipus);
		textTipus.setColumns(10);
		
		JLabel lblSzriaszm = new JLabel("Szériaszám");
		lblSzriaszm.setBounds(25, 160, 84, 20);
		contentPane.add(lblSzriaszm);
		
		textSerialNumber = new JTextField();
		textSerialNumber.setBounds(124, 157, 200, 26);
		textSerialNumber.setText(record[3]);
		contentPane.add(textSerialNumber);
		textSerialNumber.setColumns(10);
		
		JLabel lblIpcm = new JLabel("IP-cím:");
		lblIpcm.setBounds(25, 196, 52, 20);
		contentPane.add(lblIpcm);
		
		JLabel lblNewLabel = new JLabel("Fekete ár:");
		lblNewLabel.setBounds(25, 232, 70, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSznesr = new JLabel("Színes ár:");
		lblSznesr.setBounds(25, 268, 69, 20);
		contentPane.add(lblSznesr);
		
		textFekete = new JTextField();
		textFekete.setBounds(124, 229, 200, 26);
		textFekete.setText(record[4]);
		contentPane.add(textFekete);
		textFekete.setColumns(10);
		
		textSzines = new JTextField();
		textSzines.setBounds(124, 265, 200, 26);
		textSzines.setText(record[5]);
		contentPane.add(textSzines);
		textSzines.setColumns(10);
		
		textIP = new JTextField();
		textIP.setBounds(124, 193, 200, 26);
		textIP.setText(record[6]);
		contentPane.add(textIP);
		textIP.setColumns(10);
		
		JButton btnHozzads = new JButton("Mentés");
		btnHozzads.setBounds(450, 85, 200, 45);
		btnHozzads.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ujadatok = {textNev.getText(), textTipus.getText(), textSerialNumber.getText(), textIP.getText(), textFekete.getText(), textSzines.getText()};
				new UpdateRecord(record, ujadatok);
				dispose();
			}
		});
		contentPane.add(btnHozzads);
		
		JButton btnMgse = new JButton("Mégse");
		btnMgse.setBounds(450, 157, 200, 45);
		btnMgse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnMgse);
		
		this.setVisible(true);
	}

}

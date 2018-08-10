package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.BillingGeneratePDF;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;

public class NewBillFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public NewBillFrame(String tab) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Új számla generálása");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(15, 16, 192, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblSzmlaNeve = new JLabel("Számla neve:");
		lblSzmlaNeve.setBounds(15, 65, 94, 20);
		contentPane.add(lblSzmlaNeve);
		
		textField = new JTextField("szamla_" + tab + "_" + getDate());
		textField.setBounds(124, 62, 239, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aktuális állások rögzítése elõzõ haviként");
		chckbxNewCheckBox.setToolTipText("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(15, 119, 315, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Számla generálása >>>");
		btnNewButton.setBounds(15, 188, 398, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BillingGeneratePDF(textField.getText());			
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblpdf = new JLabel(".pdf");
		lblpdf.setBounds(366, 65, 47, 20);
		contentPane.add(lblpdf);
		
		
		this.setVisible(true);
	}
	
	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		return dateFormat.format(date);
	}
}

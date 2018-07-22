package ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.AddRecord;
import database.DeleteRecord;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class DeleteRecordFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public DeleteRecordFrame(String[] record) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		setTitle("Nyomtató törlése!");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBiztosanTorEzt = new JLabel("<html><b>Biztosan törölni szeretnéd ezt a nyomtatót az adatbázisból?</b><br><br>A mûvelet visszavonhatatlan!</html>");
		lblBiztosanTorEzt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBiztosanTorEzt.setBounds(15, 16, 298, 138);
		contentPane.add(lblBiztosanTorEzt);
		
		JButton buttonIgen = new JButton("IGEN");
		buttonIgen.setBounds(15, 170, 130, 40);
		buttonIgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteRecord(record);
				dispose();
			}
		});
		contentPane.add(buttonIgen);
		
		JButton buttonMegse = new JButton("MÉGSE");
		buttonMegse.setBounds(183, 170, 130, 40);
		buttonMegse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(buttonMegse);
		
		addWindowListener( new WindowAdapter() {
			   public void windowOpened( WindowEvent e ){
				   buttonMegse.requestFocus();
			   }
		});
		
		this.setVisible(true);
	}

}

package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class SqlErrorFrame extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public SqlErrorFrame(Exception e) {
		setBounds(100, 100, 500, 400);
		setTitle("Hibaüzenet");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblV = new JLabel("<html>Sikertelen mûvelet!<br>Hiba történt az SQL adatbázis frissítésekor!</html>");
		lblV.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblV.setBounds(15, 78, 448, 40);
		contentPanel.add(lblV);
		{
			JLabel lblNewLabel = new JLabel("! ! !  H I B A  ! ! !");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel.setBounds(15, 16, 448, 30);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblB = new JLabel("<html>Ha nem sikerül megoldást találnod, kérlek vedd fel a kapcsolatot a program készítõivel (Súgó > Névjegy)</html>");
			lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblB.setBounds(15, 255, 448, 34);
			contentPanel.add(lblB);
		}
		{
			JLabel lblHiba = new JLabel("Hibaüzenet:");
			lblHiba.setBounds(15, 134, 448, 20);
			contentPanel.add(lblHiba);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 170, 448, 79);
		contentPanel.add(scrollPane);
		{
			JTextArea txtrVa = new JTextArea();
			txtrVa.setLineWrap(true);
			txtrVa.setWrapStyleWord(true);
			txtrVa.setEditable(false);
			txtrVa.setFont(new Font("Monospaced", Font.PLAIN, 16));
			txtrVa.setText(e.toString());
			scrollPane.setViewportView(txtrVa);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	
	}
}

package ui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ErrorFrame extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public ErrorFrame() {
		setBounds(100, 100, 400, 300);
		setTitle("Hibaüzenet");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblV = new JLabel("<html>Valami nem stimmel! Ellenõrizd az adatok helyességét és hogy mindent kitöltöttél-e megfelelõen.</html>");
		lblV.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblV.setBounds(15, 50, 348, 89);
		contentPanel.add(lblV);
		{
			JLabel lblNewLabel = new JLabel("! ! !  H I B A  ! ! !");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel.setBounds(15, 16, 348, 30);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblB = new JLabel("<html>Ha nem sikerül megoldást találnod, kérlek vedd fel a kapcsolatot a program készítõivel (Súgó > Névjegy)</html>");
			lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblB.setBounds(15, 155, 348, 34);
			contentPanel.add(lblB);
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

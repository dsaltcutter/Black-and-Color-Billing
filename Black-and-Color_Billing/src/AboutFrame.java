import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class AboutFrame extends JDialog {

	private final JPanel contentPanel = new JPanel();


	/**
	 * Create the dialog.
	 */
	public AboutFrame() {
		setBounds(100, 100, 410, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblBlackColor = new JLabel("<html><b>Black & Color Sz�ml�z� Program</b><br/><br/>K�sz�tett�k:<br/> - S�v�g� D�vid<br/> - Pusztai Csaba<br/><br/>Kapcsolat (hibabejelent�s): <br/> - david.sovago@gmail.com<br/> - p.csaba998@gmail.com<br/><br/>All rights reserved / Minden jog fenntartva &copy; 2018</html>");
		lblBlackColor.setBounds(15, 16, 361, 223);
		contentPanel.add(lblBlackColor);
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

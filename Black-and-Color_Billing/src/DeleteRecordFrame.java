import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class DeleteRecordFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public DeleteRecordFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setTitle("Nyomtató törlése!");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBiztosanTorEzt = new JLabel("<html>Biztosan t\u00F6r\u00F6lni szeretn\u00E9 ezt a nyomtat\u00F3t az <br/>adatb\u00E1zisb\u00F3l?</html>");
		lblBiztosanTorEzt.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBiztosanTorEzt.setBounds(15, 16, 394, 68);
		contentPane.add(lblBiztosanTorEzt);
		
		JButton buttonIgen = new JButton("IGEN");
		buttonIgen.setBounds(15, 125, 200, 40);
		contentPane.add(buttonIgen);
		
		JButton buttonMegse = new JButton("MÉGSE");
		buttonMegse.setBounds(250, 125, 200, 40);
		contentPane.add(buttonMegse);
		
		addWindowListener( new WindowAdapter() {
			   public void windowOpened( WindowEvent e ){
				   buttonMegse.requestFocus();
			   }
		});
		
		this.setVisible(true);
	}

}

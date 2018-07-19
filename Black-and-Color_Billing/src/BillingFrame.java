import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;

public class BillingFrame {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
						if ("Windows".equals(info.getName())) {
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
					
					BillingFrame window = new BillingFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BillingFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Black&Color számlázó program BÉTA v0.1");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1300, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelMain = new JPanel();
		frame.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);

		JLabel lblSzmlzProgramBta = new JLabel("Black&Color számlázó program BÉTA v0.1");
		lblSzmlzProgramBta.setBounds(34, 11, 332, 23);
		lblSzmlzProgramBta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelMain.add(lblSzmlzProgramBta);

		JLabel lblAllRightsReserved = new JLabel("All rights reserved. Sóvágó Dávid, Pusztai Csaba © 2018");
		lblAllRightsReserved.setBounds(969, 744, 291, 14);
		panelMain.add(lblAllRightsReserved);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(34, 45, 1226, 500);
		panelMain.add(tabbedPane);

		JPanel tabBudapest = new JPanel();
		tabBudapest.setBackground(Color.WHITE);
		tabbedPane.addTab("Budapest", null, tabBudapest, null);
		tabBudapest.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1221, 472);
		tabBudapest.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes" }));
		scrollPane.setViewportView(table);

		JPanel tabSarvar = new JPanel();
		tabSarvar.setBackground(Color.WHITE);
		tabbedPane.addTab("Sárvár", null, tabSarvar, null);
		tabSarvar.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1221, 472);
		tabSarvar.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes" }));
		scrollPane_1.setViewportView(table_1);
		
				JPanel tabLenovo = new JPanel();
				tabLenovo.setBackground(Color.WHITE);
				tabbedPane.addTab("Sárvár Lenovo", null, tabLenovo, null);
				tabLenovo.setLayout(null);
				
						JScrollPane scrollPane_5 = new JScrollPane();
						scrollPane_5.setBounds(0, 0, 1221, 472);
						tabLenovo.add(scrollPane_5);
						
								table_5 = new JTable();
								table_5.setModel(new DefaultTableModel(
										new Object[][] { { null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null },
												{ null, null, null, null, null, null, null, null, null, null }, },
										new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
												"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
												"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
												"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes" }));
								scrollPane_5.setViewportView(table_5);

		JPanel tabZala = new JPanel();
		tabZala.setBackground(Color.WHITE);
		tabbedPane.addTab("Zalaegerszeg", null, tabZala, null);
		tabZala.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1221, 472);
		tabZala.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes" }));
		scrollPane_2.setViewportView(table_2);

		JPanel tabGyal = new JPanel();
		tabGyal.setBackground(Color.WHITE);
		tabbedPane.addTab("Gyál", null, tabGyal, null);
		tabGyal.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1221, 472);
		tabGyal.add(scrollPane_3);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes" }));
		scrollPane_3.setViewportView(table_3);

		JPanel tabPaty = new JPanel();
		tabPaty.setBackground(Color.WHITE);
		tabbedPane.addTab("Páty", null, tabPaty, null);
		tabPaty.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 1221, 472);
		tabPaty.add(scrollPane_4);

		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes" }));
		scrollPane_4.setViewportView(table_4);

		JButton btnNewButton = new JButton("Hozzáadás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setIcon(new ImageIcon("D:\\workspace\\Szamlazo\\img\\add.png"));
		btnNewButton.setBounds(34, 569, 170, 50);
		panelMain.add(btnNewButton);

		JButton btnTrls = new JButton("Törlés");
		btnTrls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTrls.setIcon(new ImageIcon("D:\\workspace\\Szamlazo\\img\\remove.png"));
		btnTrls.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTrls.setBounds(244, 569, 170, 50);
		panelMain.add(btnTrls);

		JButton btnSzerkeszts = new JButton("Szerkesztés");
		btnSzerkeszts.setIcon(new ImageIcon("D:\\workspace\\Szamlazo\\img\\refresh.png"));
		btnSzerkeszts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSzerkeszts.setBounds(454, 569, 170, 50);
		panelMain.add(btnSzerkeszts);

		JButton btnSzlaGenerls = new JButton("Számla generálás  >>>");
		btnSzlaGenerls.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSzlaGenerls.setBounds(664, 569, 596, 50);
		panelMain.add(btnSzlaGenerls);
	}

}

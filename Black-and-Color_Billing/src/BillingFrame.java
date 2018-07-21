import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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

import database.ConnectDB;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.InputEvent;

import java.awt.Desktop;

public class BillingFrame {

	private JFrame frmBlackcolorSzamlazoProgram;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	
	private ConnectDB conn = new ConnectDB();

	/**
	 * Create the application.
	 */
	public BillingFrame() {
		initialize();
		frmBlackcolorSzamlazoProgram.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBlackcolorSzamlazoProgram = new JFrame();
		frmBlackcolorSzamlazoProgram.setTitle("Black&Color Szamlazo Program BETA v0.1");
		frmBlackcolorSzamlazoProgram.setResizable(false);
		frmBlackcolorSzamlazoProgram.setBounds(100, 100, 1600, 900);
		frmBlackcolorSzamlazoProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelMain = new JPanel();
		frmBlackcolorSzamlazoProgram.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);

		JLabel lblSzmlzProgramBta = new JLabel("Black&Color Szamlazo Program BETA v0.1");
		lblSzmlzProgramBta.setBounds(34, 11, 334, 23);
		lblSzmlzProgramBta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelMain.add(lblSzmlzProgramBta);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(34, 45, 1510, 620);
		panelMain.add(tabbedPane);

		JPanel tabBudapest = new JPanel();
		tabBudapest.setBackground(Color.WHITE);
		tabbedPane.addTab("Budapest", null, tabBudapest, null);
		tabBudapest.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1505, 586);
		tabBudapest.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setEditingRow(0);
		table.setModel(new DefaultTableModel(
				conn.getTableBudapest(),
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes", "Fekete Ár", "Színes ár" }));
		scrollPane.setViewportView(table);

		JPanel tabSarvar = new JPanel();
		tabSarvar.setBackground(Color.WHITE);
		tabbedPane.addTab("Sarvar", null, tabSarvar, null);
		tabSarvar.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1505, 586);
		tabSarvar.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				conn.getTableSarvar(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollPane_1.setViewportView(table_1);

		JPanel tabLenovo = new JPanel();
		tabLenovo.setBackground(Color.WHITE);
		tabbedPane.addTab("Sarvar Levono", null, tabLenovo, null);
		tabLenovo.setLayout(null);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 1505, 586);
		tabLenovo.add(scrollPane_5);

		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
				conn.getTableLenovo(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollPane_5.setViewportView(table_5);

		JPanel tabZala = new JPanel();
		tabZala.setBackground(Color.WHITE);
		tabbedPane.addTab("Zalaegerszeg", null, tabZala, null);
		tabZala.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1505, 586);
		tabZala.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
				conn.getTableZala(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollPane_2.setViewportView(table_2);

		JPanel tabGyal = new JPanel();
		tabGyal.setBackground(Color.WHITE);
		tabbedPane.addTab("Gyal", null, tabGyal, null);
		tabGyal.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1505, 586);
		tabGyal.add(scrollPane_3);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				conn.getTableGyal(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollPane_3.setViewportView(table_3);

		JPanel tabPaty = new JPanel();
		tabPaty.setBackground(Color.WHITE);
		tabbedPane.addTab("Paty", null, tabPaty, null);
		tabPaty.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 1505, 586);
		tabPaty.add(scrollPane_4);

		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
				conn.getTablePaty(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollPane_4.setViewportView(table_4);

		JButton btnNewButton = new JButton("Hozzáadas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddRecordFrame arf = new AddRecordFrame(tabbedPane.getSelectedIndex());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setIcon(new ImageIcon(BillingFrame.class.getResource("/img/add.png")));
		btnNewButton.setBounds(34, 723, 220, 60);
		panelMain.add(btnNewButton);

		JButton btnTrls = new JButton("Törlés");
		btnTrls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteRecordFrame drf = new DeleteRecordFrame();
			}
		});
		btnTrls.setIcon(new ImageIcon(BillingFrame.class.getResource("/img/remove.png")));
		btnTrls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTrls.setBounds(309, 722, 220, 60);
		panelMain.add(btnTrls);

		JButton btnSzerkeszts = new JButton("Szerkesztés");
		btnSzerkeszts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditRecordFrame erf = new EditRecordFrame();
			}
		});
		btnSzerkeszts.setIcon(new ImageIcon(BillingFrame.class.getResource("/img/refresh.png")));
		btnSzerkeszts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSzerkeszts.setBounds(584, 723, 220, 60);
		panelMain.add(btnSzerkeszts);

		JButton btnSzlaGenerls = new JButton(" Számla generálása >>>");
		btnSzlaGenerls.setIcon(new ImageIcon(BillingFrame.class.getResource("/img/bill.png")));
		btnSzlaGenerls.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSzlaGenerls.setBounds(859, 722, 685, 60);
		panelMain.add(btnSzlaGenerls);

		JMenuBar menuBar = new JMenuBar();
		frmBlackcolorSzamlazoProgram.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("Fájl");
		menuBar.add(mnFile);

		JMenuItem mntmAdatbzisFrisstse = new JMenuItem("Adatbázis frissítése");
		mntmAdatbzisFrisstse.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnFile.add(mntmAdatbzisFrisstse);

		JMenuItem mntmKorbbiSzmlk = new JMenuItem("Korábbi számlák");
		mntmKorbbiSzmlk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnFile.add(mntmKorbbiSzmlk);

		JMenuItem mntmKilps = new JMenuItem("Kilépés");
		mntmKilps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmKilps);

		JMenu mnSg = new JMenu("Súgó");
		menuBar.add(mnSg);

		JMenuItem mntmDokumentci = new JMenuItem("Dokumentáció");
		mntmDokumentci.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mntmDokumentci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (Desktop.isDesktopSupported()) {
			            try {
			                File myFile = new File("userdoc.pdf");
			                Desktop.getDesktop().open(myFile);
			            } catch (Exception ex) {}
			        }
				}
			});
		mnSg.add(mntmDokumentci);

		JMenuItem mntmNvjegy = new JMenuItem("Névjegy");
		mntmNvjegy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmNvjegy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutFrame dialog = new AboutFrame();
			}
		});
		mnSg.add(mntmNvjegy);
	}
}

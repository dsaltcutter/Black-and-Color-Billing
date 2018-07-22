package ui;
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
import javax.swing.table.TableModel;

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
	
	private JScrollPane scrollBudapest;
	private JScrollPane scrollSarvar;
	private JScrollPane scrollLenovo;
	private JScrollPane scrollZala;
	private JScrollPane scrollGyal;
	private JScrollPane scrollPaty;
	
	private JTable tableBudapest;
	private JTable tableSarvar;
	private JTable tableZala;
	private JTable tableGyal;
	private JTable tablePaty;
	private JTable tableLenovo;
	private JTabbedPane tabbedPane;
	
	private String[] tableHeader = { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
			"Elõzõ havi csak fekete", "Aktuális csak fekete",
			"Elõzõ havi színes fekete", "Aktuális színes fekete",
			"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"};
	
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

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(34, 45, 1510, 620);
		panelMain.add(tabbedPane);

		JPanel tabBudapest = new JPanel();
		tabBudapest.setBackground(Color.WHITE);
		tabbedPane.addTab("Budapest", null, tabBudapest, null);
		tabBudapest.setLayout(null);

		scrollBudapest = new JScrollPane();
		scrollBudapest.setBounds(0, 0, 1505, 586);
		tabBudapest.add(scrollBudapest);

		tableBudapest = new JTable();
		tableBudapest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tableBudapest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tableBudapest.setEditingRow(0);
		tableBudapest.setModel(new DefaultTableModel(
				conn.getTableBudapest(),
				new String[] { "Black&Color n\u00E9v", "Eszk\u00F6z t\u00EDpus", "Sz\u00E9riasz\u00E1m", "IP-c\u00EDm",
						"El\u0151z\u0151 havi csak fekete", "Aktu\u00E1lis csak fekete",
						"El\u0151z\u0151 havi sz\u00EDnes fekete", "Aktu\u00E1lis sz\u00EDnes fekete",
						"El\u0151z\u0151 havi sz\u00EDnes sz\u00EDnes", "Aktu\u00E1lis sz\u00EDnes sz\u00EDnes", "Fekete Ár", "Színes ár" }));
		scrollBudapest.setViewportView(tableBudapest);

		JPanel tabSarvar = new JPanel();
		tabSarvar.setBackground(Color.WHITE);
		tabbedPane.addTab("Sárvár", null, tabSarvar, null);
		tabSarvar.setLayout(null);

		scrollSarvar = new JScrollPane();
		scrollSarvar.setBounds(0, 0, 1505, 586);
		tabSarvar.add(scrollSarvar);

		tableSarvar = new JTable();
		tableSarvar.setModel(new DefaultTableModel(
				conn.getTableSarvar(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollSarvar.setViewportView(tableSarvar);

		JPanel tabLenovo = new JPanel();
		tabLenovo.setBackground(Color.WHITE);
		tabbedPane.addTab("Sárvár Levono", null, tabLenovo, null);
		tabLenovo.setLayout(null);

		scrollLenovo = new JScrollPane();
		scrollLenovo.setBounds(0, 0, 1505, 586);
		tabLenovo.add(scrollLenovo);

		tableLenovo = new JTable();
		tableLenovo.setModel(new DefaultTableModel(
				conn.getTableLenovo(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollLenovo.setViewportView(tableLenovo);

		JPanel tabZala = new JPanel();
		tabZala.setBackground(Color.WHITE);
		tabbedPane.addTab("Zalaegerszeg", null, tabZala, null);
		tabZala.setLayout(null);

		scrollZala = new JScrollPane();
		scrollZala.setBounds(0, 0, 1505, 586);
		tabZala.add(scrollZala);

		tableZala = new JTable();
		tableZala.setModel(new DefaultTableModel(
				conn.getTableZala(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollZala.setViewportView(tableZala);

		JPanel tabGyal = new JPanel();
		tabGyal.setBackground(Color.WHITE);
		tabbedPane.addTab("Gyál", null, tabGyal, null);
		tabGyal.setLayout(null);

		scrollGyal = new JScrollPane();
		scrollGyal.setBounds(0, 0, 1505, 586);
		tabGyal.add(scrollGyal);

		tableGyal = new JTable();
		tableGyal.setModel(new DefaultTableModel(
				conn.getTableGyal(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollGyal.setViewportView(tableGyal);

		JPanel tabPaty = new JPanel();
		tabPaty.setBackground(Color.WHITE);
		tabbedPane.addTab("Páty", null, tabPaty, null);
		tabPaty.setLayout(null);

		scrollPaty = new JScrollPane();
		scrollPaty.setBounds(0, 0, 1505, 586);
		tabPaty.add(scrollPaty);

		tablePaty = new JTable();
		tablePaty.setModel(new DefaultTableModel(
				conn.getTablePaty(),
				new String[] { "Black&Color név", "Eszköz típus", "Szériaszám", "IP-cím",
						"Elõzõ havi csak fekete", "Aktuális csak fekete",
						"Elõzõ havi színes fekete", "Aktuális színes fekete",
						"Elõzõ havi színes színes", "Aktuális színes színes", "Fekete ár", "Színes ár"}));
		scrollPaty.setViewportView(tablePaty);

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
				int row = getTable().getSelectedRow();
				TableModel tm = getTable().getModel();
				String[] adatok = {getTab(), tm.getValueAt(row, 0).toString(), tm.getValueAt(row, 1).toString(), tm.getValueAt(row, 2).toString()};
				DeleteRecordFrame drf = new DeleteRecordFrame(adatok);
			}
		});
		btnTrls.setIcon(new ImageIcon(BillingFrame.class.getResource("/img/remove.png")));
		btnTrls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTrls.setBounds(309, 722, 220, 60);
		panelMain.add(btnTrls);

		JButton btnSzerkeszts = new JButton("Szerkesztés");
		btnSzerkeszts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = getTable().getSelectedRow();
				TableModel tm = getTable().getModel();
				String[] adatok = {getTab(), tm.getValueAt(row, 0).toString(), tm.getValueAt(row, 1).toString(), tm.getValueAt(row, 2).toString(), tm.getValueAt(row, 3).toString(), tm.getValueAt(row, 10).toString(), tm.getValueAt(row, 11).toString()};
				UpdateRecordFrame erf = new UpdateRecordFrame(adatok);
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
		mntmAdatbzisFrisstse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTables();
			}
		});
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
	
	public JTable getTable() {
		int ind = tabbedPane.getSelectedIndex();
		
		switch (ind) {
		case 0:	return tableBudapest;
		case 1: return tableSarvar;
		case 2: return tableLenovo;
		case 3: return tableZala;
		case 4: return tableGyal;
		case 5: return tablePaty;
		}
		return null;
	}
	
	public String getTab() {
		int ind = tabbedPane.getSelectedIndex();
		String selectedTab = "";
		
		switch (ind) {
		case 0: selectedTab = "budapest"; break;
		case 1: selectedTab = "sarvar"; break;
		case 2: selectedTab = "lenovo"; break;
		case 3: selectedTab = "zalaegerszeg"; break;
		case 4: selectedTab = "gyal"; break;
		case 5: selectedTab = "paty"; break;
		}
		return selectedTab;
	}

	public void updateTables() {
		ConnectDB update = new ConnectDB();
		tableBudapest.setModel(new DefaultTableModel(update.getTableBudapest(), tableHeader));
		tableSarvar.setModel(new DefaultTableModel(update.getTableSarvar(), tableHeader));
		tableLenovo.setModel(new DefaultTableModel(update.getTableLenovo(), tableHeader));
		tableZala.setModel(new DefaultTableModel(update.getTableZala(), tableHeader));
		tableGyal.setModel(new DefaultTableModel(update.getTableGyal(), tableHeader));
		tablePaty.setModel(new DefaultTableModel(update.getTablePaty(), tableHeader));
		
		tableBudapest.repaint();
		tableSarvar.repaint();
		tableLenovo.repaint();
		tableZala.repaint();
		tableGyal.repaint();
		tablePaty.repaint();
		
	}
}

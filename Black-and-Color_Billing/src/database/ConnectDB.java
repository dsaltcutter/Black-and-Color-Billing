package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {

	Connection conn;
	String sqlQuerySelectBudapest, sqlQuerySelectSarvar, sqlQuerySelectLenovo, sqlQuerySelectZala, sqlQuerySelectGyal, sqlQuerySelectPaty;
	Object[][] tableBudapest, tableSarvar, tableLenovo, tableZala, tableGyal, tablePaty;
	
	
	public ConnectDB() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/black&color", // adatbázis kapcsolat
					"root", // felhasználónév
					""); // jelszó

			sqlQuerySelectBudapest = "SELECT * FROM budapest;";
			sqlQuerySelectSarvar = "SELECT * FROM sarvar;";
			sqlQuerySelectLenovo = "SELECT * FROM lenovo;";
			sqlQuerySelectZala = "SELECT * FROM zalaegerszeg;";
			sqlQuerySelectGyal = "SELECT * FROM gyal;";
			sqlQuerySelectPaty = "SELECT * FROM paty;";
			
			int i= 0;
			
			ResultSet result = result(conn, sqlQuerySelectBudapest);			
			result.last();
			int size = result.getRow();
			result.beforeFirst();
			tableBudapest = new Object[size][12];
			while (result.next()) {
				tableBudapest[i][0] = result.getString("Nev");
				tableBudapest[i][1] = result.getString("Tipus");
				tableBudapest[i][2] = result.getString("Serial_Number");
				tableBudapest[i][3] = result.getString("IP");
				tableBudapest[i][4] = result.getString("Elozo_fekete");
				tableBudapest[i][5] = result.getString("Aktualis_fekete");
				tableBudapest[i][6] = result.getString("Elozo_szines_fekete");
				tableBudapest[i][7] = result.getString("Aktualis_szines_fekete");
				tableBudapest[i][8] = result.getString("Elozo_szines_szines");
				tableBudapest[i][9] = result.getString("Aktualis_szines_szines");
				tableBudapest[i][10] = result.getString("Forint_fekete");
				tableBudapest[i][11] = result.getString("Forint_szines");
	            
	            i++;
	        }
			
			i= 0;
			result = result(conn, sqlQuerySelectSarvar);
			result.last();
			size = result.getRow();
			result.beforeFirst();
			tableSarvar = new Object[size][12];
			while (result.next()) {
				tableSarvar[i][0] = result.getString("Nev");
				tableSarvar[i][1] = result.getString("Tipus");
				tableSarvar[i][2] = result.getString("Serial_Number");
				tableSarvar[i][3] = result.getString("IP");
				tableSarvar[i][4] = result.getString("Elozo_fekete");
				tableSarvar[i][5] = result.getString("Aktualis_fekete");
				tableSarvar[i][6] = result.getString("Elozo_szines_fekete");
				tableSarvar[i][7] = result.getString("Aktualis_szines_fekete");
				tableSarvar[i][8] = result.getString("Elozo_szines_szines");
				tableSarvar[i][9] = result.getString("Aktualis_szines_szines");
				tableSarvar[i][10] = result.getString("Forint_fekete");
				tableSarvar[i][11] = result.getString("Forint_szines");
	            
	            i++;
	        }
			
			i = 0;
			result = result(conn, sqlQuerySelectLenovo);
			result.last();
			size = result.getRow();
			result.beforeFirst();
			tableLenovo = new Object[size][12];
			while (result.next()) {
				tableLenovo[i][0] = result.getString("Nev");
				tableLenovo[i][1] = result.getString("Tipus");
				tableLenovo[i][2] = result.getString("Serial_Number");
				tableLenovo[i][3] = result.getString("IP");
				tableLenovo[i][4] = result.getString("Elozo_fekete");
				tableLenovo[i][5] = result.getString("Aktualis_fekete");
				tableLenovo[i][6] = result.getString("Elozo_szines_fekete");
				tableLenovo[i][7] = result.getString("Aktualis_szines_fekete");
				tableLenovo[i][8] = result.getString("Elozo_szines_szines");
				tableLenovo[i][9] = result.getString("Aktualis_szines_szines");
				tableLenovo[i][10] = result.getString("Forint_fekete");
				tableLenovo[i][11] = result.getString("Forint_szines");
	            
	            i++;
	        }
			
			i = 0;
			result = result(conn, sqlQuerySelectZala);
			result.last();
			size = result.getRow();
			result.beforeFirst();
			tableZala = new Object[size][12];
			while (result.next()) {
				tableZala[i][0] = result.getString("Nev");
				tableZala[i][1] = result.getString("Tipus");
				tableZala[i][2] = result.getString("Serial_Number");
				tableZala[i][3] = result.getString("IP");
				tableZala[i][4] = result.getString("Elozo_fekete");
				tableZala[i][5] = result.getString("Aktualis_fekete");
				tableZala[i][6] = result.getString("Elozo_szines_fekete");
				tableZala[i][7] = result.getString("Aktualis_szines_fekete");
				tableZala[i][8] = result.getString("Elozo_szines_szines");
				tableZala[i][9] = result.getString("Aktualis_szines_szines");
				tableZala[i][10] = result.getString("Forint_fekete");
				tableZala[i][11] = result.getString("Forint_szines");
	            
	            i++;
	        }
			
			i = 0;
			result= result(conn, sqlQuerySelectGyal);
			result.last();
			size = result.getRow();
			result.beforeFirst();
			tableGyal = new Object[size][12];
			while (result.next()) {
				tableGyal[i][0] = result.getString("Nev");
				tableGyal[i][1] = result.getString("Tipus");
				tableGyal[i][2] = result.getString("Serial_Number");
				tableGyal[i][3] = result.getString("IP");
				tableGyal[i][4] = result.getString("Elozo_fekete");
				tableGyal[i][5] = result.getString("Aktualis_fekete");
				tableGyal[i][6] = result.getString("Elozo_szines_fekete");
				tableGyal[i][7] = result.getString("Aktualis_szines_fekete");
				tableGyal[i][8] = result.getString("Elozo_szines_szines");
				tableGyal[i][9] = result.getString("Aktualis_szines_szines");
				tableGyal[i][10] = result.getString("Forint_fekete");
				tableGyal[i][11] = result.getString("Forint_szines");
	            
	            i++;
	        }
			
			i = 0;
			result = result(conn, sqlQuerySelectPaty);
			result.last();
			size = result.getRow();
			result.beforeFirst();
			tablePaty = new Object[size][12];
			while (result.next()) {
				tablePaty[i][0] = result.getString("Nev");
				tablePaty[i][1] = result.getString("Tipus");
				tablePaty[i][2] = result.getString("Serial_Number");
				tablePaty[i][3] = result.getString("IP");
				tablePaty[i][4] = result.getString("Elozo_fekete");
				tablePaty[i][5] = result.getString("Aktualis_fekete");
				tablePaty[i][6] = result.getString("Elozo_szines_fekete");
				tablePaty[i][7] = result.getString("Aktualis_szines_fekete");
				tablePaty[i][8] = result.getString("Elozo_szines_szines");
				tablePaty[i][9] = result.getString("Aktualis_szines_szines");
				tablePaty[i][10] = result.getString("Forint_fekete");
				tablePaty[i][11] = result.getString("Forint_szines");
	            
	            i++;
	        }
			
			
			conn.close();
		} catch (Exception e) {
			System.out.println();
		}
	}

	public static ResultSet result(Connection conn, String query) {
		try {
			PreparedStatement st = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet result = st.executeQuery();
			return result;
		} catch (Exception e) {
			System.out.println("Hiba: " + e);
		}
		return null;
	}

	public Object[][] getTableBudapest() {
		return tableBudapest;
	}

	public Object[][] getTableSarvar() {
		return tableSarvar;
	}

	public Object[][] getTableLenovo() {
		return tableLenovo;
	}

	public Object[][] getTableZala() {
		return tableZala;
	}

	public Object[][] getTableGyal() {
		return tableGyal;
	}

	public Object[][] getTablePaty() {
		return tablePaty;
	}

	

}

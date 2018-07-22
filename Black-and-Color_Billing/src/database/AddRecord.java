package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.Main;
import ui.SqlErrorFrame;
import ui.SuccessFrame;

public class AddRecord extends Main{

	public AddRecord(String[] record) {
		String tabla = record[0];
		String nev = record[1];
		String tipus = record[2];
		String serialNumber = record[3];
		String ip = record[4];
		String fekete = record[5];
		String szines = record[6];
		
		switch (tabla) {
		case "Budapest": tabla = "budapest"; break;
		case "S�rv�r": tabla = "sarvar"; break;
		case "S�rv�r Lenovo": tabla = "lenovo"; break;
		case "Zalaegerszeg": tabla = "zalaegerszeg"; break;
		case "Gy�l": tabla = "gyal"; break;
		case "P�ty": tabla = "paty"; break;
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/black&color", "root", "");
			
			String sqlQueryAddRecord = "INSERT INTO " + tabla + " (`Nev`, `Tipus`, `Serial_number`, `IP`, `Elozo_fekete`, `Aktualis_fekete`, `Elozo_szines_fekete`, `Aktualis_szines_fekete`, `Elozo_szines_szines`, `Aktualis_szines_szines`, `Forint_fekete`, `Forint_szines`) "
					+ "VALUES ('" + nev + "', '" + tipus + "', '" + serialNumber + "', '" + ip + "', NULL, NULL, NULL, NULL, NULL, NULL, '" + fekete + "', '" + szines + "');";
			
			PreparedStatement st = conn.prepareStatement(sqlQueryAddRecord);
			st.executeUpdate();
			
			conn.close();
			
			new SuccessFrame("Nyomtat� hozz�ad�sa");
			getBillingFrame().updateTables();
		} catch (Exception e) {
			new SqlErrorFrame(e);
		}
		
	}
}

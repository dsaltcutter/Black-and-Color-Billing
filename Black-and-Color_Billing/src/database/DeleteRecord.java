package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import main.Main;
import ui.SqlErrorFrame;
import ui.SuccessFrame;

public class DeleteRecord extends Main{

	public DeleteRecord(String[] record) {
		String tabla = record[0];
		String nev = record[1];
		String tipus = record[2];
		String serialNumber = record[3];
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/black&color", "root", "");
			
			String sqlQueryAddRecord = "DELETE FROM " + tabla + " WHERE Nev = '" + nev + "' AND Tipus = '" + tipus + "' AND Serial_number = '" + serialNumber + "';";
			
			PreparedStatement st = conn.prepareStatement(sqlQueryAddRecord);
			st.executeUpdate();
			
			conn.close();
			
			new SuccessFrame("Nyomtató törlése");
			getBillingFrame().updateTables();
		} catch (Exception e) {
			new SqlErrorFrame(e);
		}
	}
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import main.Main;
import ui.SqlErrorFrame;
import ui.SuccessFrame;

public class UpdateRecord extends Main{

	public UpdateRecord(String[] record, String[] ujadatok) {
		String tabla = record[0];
		String nev = record[1];
		String tipus = record[2];
		String serialNumber = record[3];
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/black&color", "root", "");
			
			String sqlQueryAddRecord = "UPDATE " + tabla + " SET `Nev` = '" + ujadatok[0] + "', `Tipus` = '" + ujadatok[1] + "', `Serial_number` = '" + ujadatok[2] + "', `IP` = '" + ujadatok[3] + "', `Forint_fekete` = '" + ujadatok[4] +"', `Forint_szines` = '" + ujadatok[5] + "' WHERE `Nev` = '" + nev + "' AND `Tipus` = '" + tipus + "' AND `Serial_number` = '" + serialNumber + "';";
			
			PreparedStatement st = conn.prepareStatement(sqlQueryAddRecord);
			st.executeUpdate();
			
			conn.close();
			
			new SuccessFrame("Nyomtató adatmódosítása");
			getBillingFrame().updateTables();
		} catch (Exception e) {
			new SqlErrorFrame(e);
		}
	}
}

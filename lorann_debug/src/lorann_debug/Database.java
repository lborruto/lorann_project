package lorann_debug;

import java.sql.*;
import java.math.*;
import com.mysql.*;

public class Database {

	private ResultSet result;

	public Database() {
		
		int level = 1;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String USER = "root";
			String PASS = "";
			Connection conn = DriverManager.getConnection(URL, USER, PASS);

			if (level == 1) {
				CallableStatement cStmt = conn.prepareCall("{CALL level1}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}

			else if (level == 2) {
				CallableStatement cStmt = conn.prepareCall("{CALL level2}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}

			else if (level == 3) {
				CallableStatement cStmt = conn.prepareCall("{CALL level3}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}

			else if (level == 4) {
				CallableStatement cStmt = conn.prepareCall("{CALL level4}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}

			else if (level == 5) {
				CallableStatement cStmt = conn.prepareCall("{CALL level5}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}
			
			if (level == 1) {
				ResultSetMetaData resulMeta = result.getMetaData();
				
			}

			conn.close();
		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("ERROR! ");
			System.err.println(e.getMessage());
		}
	}
}
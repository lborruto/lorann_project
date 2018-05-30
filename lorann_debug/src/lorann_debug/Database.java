package lorann_debug;

import java.sql.*;
import java.math.*;
import com.mysql.*;

public class Database {

	public Database() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		
		String URL = "jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String USER = "root";
		String PASS = "";
			Connection conn = DriverManager.getConnection(URL, USER, PASS);		
			
			String query = "select ID, Structure, X, Y, NumNiveau from level";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
		      {
				int id = rs.getInt(1);
				String struc = rs.getString(2);
				int x = rs.getInt(3);
				int y = rs.getInt(4);
				int nm = rs.getInt(5);
		        System.out.print(id + "\n");
		        System.out.print(struc + "\n");
		        System.out.print(x + "\n");
		        System.out.print(y + "\n");
		        System.out.print(nm + "\n");
		      }
		      
	
			
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("ERROR! ");
		      System.err.println(e.getMessage());
		}
		
		
		
		
	}
}
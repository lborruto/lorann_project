package model;

import java.sql.*;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.*;
import com.mysql.*;

public class Catch {
	
	private ResultSet result;

	public Catch() {
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
				for (int a = 1; a <= resulMeta.getColumnCount(); a++) {
					System.out.print("\t" + resulMeta.getColumnName(a).toUpperCase() + "\t *");
				}

				System.out.println("\n");

				while (result.next()) {
					for (int a = 1; a <= resulMeta.getColumnCount(); a++) {
						System.out.print("\t" + result.getObject(a).toString() + "\t *");
						try {
							switch (result.getObject(a).toString()) {
							case "-":
								BufferedImage wallH;
								wallH = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\horizontal_bone.png"));
//								String g = result.getObject(2).toString();
//								int x = Integer.valueOf(g);
//								String t = result.getObject(3).toString();
//								int y = Integer.valueOf(t);
//								new WallHorizontal(wallH, x, y);
								break;

							default:
								break;
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					System.out.println("\n");
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

package model;

import java.sql.*;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.*;
import com.mysql.*;

import view.Window;

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

				ResultSetMetaData resulMeta = result.getMetaData();

				while (result.next()) {
						try {
							switch (result.getObject(1).toString()) {
							case "-":
								String rsltx = result.getObject(2).toString();
								int x = Integer.valueOf(rsltx);
								String rslty = result.getObject(3).toString();
								int y = Integer.valueOf(rslty);
								
								Window.debut = 1;
								
								Window.panel.img[x][y] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\horizontal_bone.png"));
								break;
								
							case ".":
								String rsltx1 = result.getObject(2).toString();
								int x1 = Integer.valueOf(rsltx1);
								String rslty1 = result.getObject(3).toString();
								int y1 = Integer.valueOf(rslty1);
								
								Window.debut = 1;
								
								Window.panel.img[x1][y1] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\bone.png"));
								break;
								
							case "|":
								String rsltx2 = result.getObject(2).toString();
								int x2 = Integer.valueOf(rsltx2);
								String rslty2 = result.getObject(3).toString();
								int y2 = Integer.valueOf(rslty2);
								
								Window.debut = 1;
								
								Window.panel.img[x2][y2] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\vertical_bone.png"));
								break;
								
							case "O":
								String rsltx3 = result.getObject(2).toString();
								int x3 = Integer.valueOf(rsltx3);
								String rslty3 = result.getObject(3).toString();
								int y3 = Integer.valueOf(rslty3);
								
								Window.debut = 1;
								
								Window.panel.img[x3][y3] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\crystal_ball.png"));
								break;
								
							case "i":
								String rsltx4 = result.getObject(2).toString();
								int x4 = Integer.valueOf(rsltx4);
								String rslty4 = result.getObject(3).toString();
								int y4 = Integer.valueOf(rslty4);
								
								Window.debut = 1;
								
								Window.panel.img[x4][y4] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\purse.png"));
								break;
								
							case "x":
								String rsltx5 = result.getObject(2).toString();
								int x5 = Integer.valueOf(rsltx5);
								String rslty5 = result.getObject(3).toString();
								int y5 = Integer.valueOf(rslty5);
								
								Window.debut = 1;
								
								Window.panel.img[x5][y5] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\monster_2.png"));
								break;
								
							case "p":
								String rsltx6 = result.getObject(2).toString();
								int x6 = Integer.valueOf(rsltx6);
								String rslty6 = result.getObject(3).toString();
								int y6 = Integer.valueOf(rslty6);
								
								Window.debut = 1;
								
								Window.panel.img[x6][y6] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\gate_closed.png"));
								break;
								
							case "H":
								String rsltx7 = result.getObject(2).toString();
								int x7 = Integer.valueOf(rsltx7);
								String rslty7 = result.getObject(3).toString();
								int y7 = Integer.valueOf(rslty7);
								
								Window.debut = 1;
								
								Window.panel.img[x7][y7] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\lorann_r.png"));
								break;
														
								
							default:
								break;
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

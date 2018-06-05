package model;

import java.sql.*;

import javax.imageio.ImageIO;

import contract.IDoor;
import contract.IKey;
import contract.IPurse;
import view.Panel;
import view.Window;


import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */

public class Catch{
	
	private ResultSet result;
	int arrayLevel[][] = new int [Window.panel.arrayx][Window.panel.arrayy];
	int x = 0;
	int  y = 0;
	private IKey key;
	private IPurse purse;
	private IDoor door;

/**
 * This function serve to catch the level you want.
 * By default it choose the level 1.
 */
	
	int l;
	public int level = 1;
	
	public Catch(IKey key, IPurse purse, IDoor door) {
		this.key = key;
		this.purse = purse;
		this.door = door;
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

				//ResultSetMetaData resulMeta = result.getMetaData();
			
			
/**
 * This function serve to read the database in wamp.
 * Each character is associate with a picture and this is how we design the level.
 */
				
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
								key.set_KeyX(x3);
								String rslty3 = result.getObject(3).toString();
								int y3 = Integer.valueOf(rslty3);
								key.set_KeyY(y3);
								
								Window.debut = 1;
								
								Window.panel.img[x3][y3] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\crystal_ball.png"));
								break;
								
							case "i":
								String rsltx4 = result.getObject(2).toString();
								int x4 = Integer.valueOf(rsltx4);
								purse.set_PurseX(x4);
								String rslty4 = result.getObject(3).toString();
								int y4 = Integer.valueOf(rslty4);
								purse.set_PurseY(y4);
								
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
								door.set_DoorX(x6);
								String rslty6 = result.getObject(3).toString();
								int y6 = Integer.valueOf(rslty6);
								door.set_DoorY(y6);
								
								Window.debut = 1;
								
								Window.panel.img[x6][y6] = ImageIO.read(new File("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\gate_closed.png"));
								break;
								
							case "H":
								String rsltx7 = result.getObject(2).toString();
								int x7 = Integer.valueOf(rsltx7);
								Panel.lorann1.setLorannX(x7);
								String rslty7 = result.getObject(3).toString();
								int y7 = Integer.valueOf(rslty7);
								Panel.lorann1.setLorannY(y7);
								
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

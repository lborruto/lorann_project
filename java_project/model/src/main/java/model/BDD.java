package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * 
 * @author guillaume
 *
 */
public class BDD {
	public BDD() {
		int level;
		for(level = 1; level <=2 ; level++) {                                        //
			ArrayList<String> list = new ArrayList<String>();
			
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
				Statement stmt = cnx.createStatement();
				
				if(level == 1) {                                                     //level 1 
					
					InputStream is = new FileInputStream("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/levels/lvl1.txt");                     // mettre le chemin dacces des fichier texte du niveau 1
																				  //mettre un nom relatif au lieu dun chemin absolu, 
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
				 
				 
					String ligne;
				
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					
					buff.close();
	
					stmt.executeUpdate("DROP TABLE lorann.level");
					stmt.executeUpdate("CREATE TABLE level(ID int not null auto_increment, Structure varchar (150) NOT NULL, X int(20) NOT NULL, Y int(20) NOT NULL, NumNiveau int(5) NOT NULL, PRIMARY KEY (ID))");
					
				}
				
				else if(level == 2) {
					
					InputStream is = new FileInputStream("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/levels/lvl2.txt");                     // mettre le chemin dacces des fichier texte du niveau 2
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
				 
				 
					String ligne;
				
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					
					buff.close();
					
				}
				
				else if(level == 3) {
					
					InputStream is = new FileInputStream("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/levels/lvl3.txt");                     // mettre le chemin dacces des fichier texte du niveau 3
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
				 
				 
					String ligne;
				
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					
					buff.close();
					
				}
				
				/**
				 * 
				 */
				
				else if(level == 4) {
					
					InputStream is = new FileInputStream("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/levels/lvl4.txt");                     // mettre le chemin dacces des fichier texte du niveau 4
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
				 
				 
					String ligne;
				
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					
					buff.close();
					
				}
				
				/*
				 * 
				 */
				
				else if(level == 5) {
					
					InputStream is = new FileInputStream("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/levels/lvl5.txt");                     // mettre le chemin dacces des fichier texte du niveau 5
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
				 
				 
					String ligne;
				
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					
					buff.close();
					
				}
				
					
					int x, y;
					for (y = 0; y <= 11; y++) {
						String temp = list.get(y);
					
						for (x = 0; x <= 19; x++) {
						
							char sprite = temp.charAt(x);
						
							switch(sprite) {
							case '|':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"|\"," + x + "," + y + ","+ level +")");
								break;
							case '-':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"-\"," + x + "," + y + ","+ level +" )");
								break;
							case 'O':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"O\"," + x + "," + y + ","+ level +" )");
								break;
							case '.':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\".\"," + x + "," + y + ","+ level +" )");
								break;
							case 'H':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"H\"," + x + "," + y + ","+ level +" )");
								break;
							case 'i':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"i\"," + x + "," + y + ","+ level +" )");
								break;
							case 'p':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"p\"," + x + "," + y + ","+ level +" )");
								break;
							case 'x':
								stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"x\"," + x + "," + y + ","+ level +" )");
								break;
							default:
								break;
								
							}
							
						}
							
							
					}
					
					stmt.close();
					cnx.close();
					list.clear();
					} catch (ClassNotFoundException | SQLException | IOException e) {
						e.printStackTrace();
				}
			}
		}
	
		
	}





package model;

import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class BDD {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
			java.sql.Statement stmt = cnx.createStatement();
			
			 InputStream is = new FileInputStream("");
			 InputStreamReader lire = new InputStreamReader(is);
			 BufferedReader buff = new BufferedReader(lire);
			 
			 
			String ligne;
			
			while ((ligne = buff.readLine()) != null) {
				list.add(ligne);
			}
			buff.close();
			
			int x, y;
			for (y = 0; y <= 16; y++) {
				String temp = list.get(y);
				
				for (x = 0; x <= 21; x++) {
					
					char sprite = temp.charAt(x);
					
					switch(sprite) {
					case '|':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"|\"," + x + "," + y + ", 1)");
						break;
					case '-':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"-\"," + x + "," + y + ", 1)");
						break;
					case 'O':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"O\"," + x + "," + y + ", 1)");
						break;
					case '.':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\".\"," + x + "," + y + ", 1)");
						break;
					case 'H':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"H\"," + x + "," + y + ", 1)");
						break;
					case 'i':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"i\"," + x + "," + y + ", 1)");
						break;
					case 'p':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"p\"," + x + "," + y + ", 1)");
						break;
					case 'x':
						stmt.executeUpdate("INSERT INTO level(Structure, X, Y, NumNiveau) VALUES(\"x\"," + x + "," + y + ", 1)");
						break;
					default:
						break;
						
					}
					
				}
					
					
			}
			
			stmt.close();
			cnx.close();
			} catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
}


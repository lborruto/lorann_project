package main;
import java.awt.Window;

import javax.swing.JFrame;
import model.BDD;
import model.Catch;
import model.Key;

/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */

public abstract class Main extends JFrame {
	
/**
 * Activate the programs
 * @param args 
 */
	
	private static Key key = new Key();
    public static void main(final String[] args) {
  
    	new Menu();
    	
    	new BDD();
    	
    	new Catch(key);
    	
    	new view.Window(key);

		
		
		
    }

}

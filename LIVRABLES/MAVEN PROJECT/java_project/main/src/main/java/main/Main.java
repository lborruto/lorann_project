package main;
import javax.swing.JFrame;
import model.BDD;
import model.Catch;
import model.Door;
import model.Key;
import model.Purse;

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
	private static Purse purse = new Purse();
	private static Door door = new Door();
    public static void main(final String[] args) {
  
    	new Menu();
    	
    	new BDD();
    	
    	new Catch(key, purse, door);
    	
    	new view.Window(key, purse, door);

		
		
		
    }

}

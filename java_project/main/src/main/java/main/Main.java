package main;
import java.awt.Window;

import javax.swing.JFrame;
import model.BDD;
import model.Catch;

/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */

public abstract class Main extends JFrame {

    public static void main(final String[] args) {
    	BDD bdd = new BDD();
    	
    	Window _window = new view.Window();

		Catch _catch = new Catch();
    }

}

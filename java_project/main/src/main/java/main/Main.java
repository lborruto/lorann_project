package main;
import java.awt.Window;
import java.util.Scanner;

import javax.swing.JFrame;
import model.BDD;
import model.Catch;

/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */

public abstract class Main extends JFrame {
	
<<<<<<< HEAD
	
    public static void main(final String[] args) {
    	
    	//Menu _menu = new Menu();
=======
/**
 * Activate the programs
 * @param args 
 */
	

    public static void main(final String[] args) {
    	
>>>>>>> bdbc56ea1b551ab85a0d906a0ef34f140ce77bac
    	
    	BDD bdd = new BDD();
    	
    	Window _window = new view.Window();

		Catch _catch = new Catch();
    }
}

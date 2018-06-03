package lorann_debug;

import java.awt.Window;

import javax.swing.JFrame;
import lorann_debug.BDD;
import lorann_debug.Catch;

public abstract class Main extends JFrame {

    public static void main(final String[] args) {
    	
    	BDD bdd = new BDD();
    	
    	Window _window = new lorann_debug.Window();

		Catch _catch = new Catch();
    }

}

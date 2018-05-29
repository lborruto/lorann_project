package lorann_debug;
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	Model _model = new Model();
	
	  public Window(){
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(800, 800);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    this.setBackground(Color.BLACK);        
	    this.setContentPane(new Panel (this));               
	    this.setVisible(true);
	  }       
	}


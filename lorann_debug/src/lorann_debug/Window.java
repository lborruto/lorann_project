package lorann_debug;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	
	private Panel panel = new Panel();
	
	  public Window(){
	    this.setTitle("Lorann");
	    this.setSize(650, 460);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    this.setResizable(false);
	    this.setContentPane(panel);               
	    this.setVisible(true);  
	  }

	@Override
	public void keyTyped(KeyEvent evt) {
		
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		
		if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
			panel.setLorannX(panel.getLorannX() + 10);
			
		}
		
		if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
			panel.setLorannY(panel.getLorannY() - 10);
			
		}
		
		if (evt.getKeyCode() == KeyEvent.VK_UP) {
			panel.setLorannY(panel.getLorannY() - 10);
			
		}
		
		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
			panel.setLorannX(panel.getLorannX() + 10);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent evt) {
		
	}
}


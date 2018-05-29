package lorann_debug;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Controller {

		    private int x = 40;
		    private int y = 60;
		    private int w;
		    private int h;
		    private Image image;

		    public Controller() {

		        loadImage();
		    }

		    private void loadImage() {
		        
		        ImageIcon ii = new ImageIcon("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\lorann_u.png");
		        image = ii.getImage(); 
		        
		        w = image.getWidth(null);
		        h = image.getHeight(null);
		    }

		    public void move() {
		        
		        x += x;
		        y += y;
		    }

		    public int getX() {
		        
		        return x;
		    }

		    public int getY() {
		        
		        return y;
		    }
		    
		    public int getWidth() {
		        
		        return w;
		    }
		    
		    public int getHeight() {
		        
		        return h;
		    }    

		    public Image getImage() {
		        
		        return image;
		    }

		    public void keyPressed(KeyEvent e) {

		        int key = e.getKeyCode();

		        if (key == KeyEvent.VK_LEFT) {
		            x = -2;
		        }

		        if (key == KeyEvent.VK_RIGHT) {
		            x = 2;
		        }

		        if (key == KeyEvent.VK_UP) {
		            y = -2;
		        }

		        if (key == KeyEvent.VK_DOWN) {
		            y = 2;
		        }
		    }

		    public void keyReleased(KeyEvent e) {
		        
		        int key = e.getKeyCode();

		        if (key == KeyEvent.VK_LEFT) {
		            x = 0;
		        }

		        if (key == KeyEvent.VK_RIGHT) {
		            x = 0;
		        }

		        if (key == KeyEvent.VK_UP) {
		            y = 0;
		        }

		        if (key == KeyEvent.VK_DOWN) {
		            y = 0;
		        }
		    }
		}

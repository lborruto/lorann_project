package lorann_debug;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Window extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	public static Panel panel = new Panel();
	public static Lorann lorann1 = new Lorann();
	public static int debut = 0;
	public static String spriteLorann = "C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\lorann_r.png";


	public Window() {
		this.setTitle("Lorann");
		this.setSize(650, 460);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		this.setResizable(false);
		
		setFocusable(true);
		addKeyListener(this);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

	public void keyTyped(KeyEvent evt) {

	}

	public void keyPressed(KeyEvent evt) {

		if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			
			
			lorann1.setLorannX(lorann1.getLorannX() + 1);
			try {
				Window.panel.img[lorann1.getLorannX()][lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
			lorann1.setLorannX(lorann1.getLorannX() - 1);
			try {
				Window.panel.img[lorann1.getLorannX()][lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		if (evt.getKeyCode() == KeyEvent.VK_UP) {
			lorann1.setLorannY(lorann1.getLorannY() - 1);
			try {
				Window.panel.img[lorann1.getLorannX()][lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
			lorann1.setLorannY(lorann1.getLorannY() + 1);
			try {
				Window.panel.img[lorann1.getLorannX()][lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void keyReleased(KeyEvent evt) {

	}
}
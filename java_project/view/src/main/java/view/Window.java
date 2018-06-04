package view;

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
	public static int debut = 0;
	public static String spriteLorann = "C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\lorann_r.png";
	public static String spriteBlack = "C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\black.png";
	Boolean square = Boolean.valueOf(spriteBlack);
	
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
			if(Window.panel.img[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] == null || square) {
				Panel.lorann1.setLorannX(Panel.lorann1.getLorannX() + 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
					Window.panel.img[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteBlack));
	
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
			if(Window.panel.img[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] == null) {
				Panel.lorann1.setLorannX(Panel.lorann1.getLorannX() - 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));	
					Window.panel.img[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteBlack));

				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
		}

		if (evt.getKeyCode() == KeyEvent.VK_UP) {
			if(Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() -1] == null) {
				Panel.lorann1.setLorannY(Panel.lorann1.getLorannY() - 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));	
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()+1] = ImageIO.read(new File(spriteBlack));

			}	 catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
			if(Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() +1] == null) {
				Panel.lorann1.setLorannY(Panel.lorann1.getLorannY() + 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() -1] = ImageIO.read(new File(spriteBlack));

			} 	catch (IOException e) {
					e.printStackTrace();
						panel.repaint();
				}
			}
		}
	}

	public void keyReleased(KeyEvent evt) {

	}
}
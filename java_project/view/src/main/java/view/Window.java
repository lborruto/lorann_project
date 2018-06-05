package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import contract.IDoor;
import contract.IKey;
import contract.IPurse;

public class Window extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	public static Panel panel = new Panel();
	public static int debut = 0;
	private IKey key;
	private IPurse purse;
	private IDoor door;
	public static String spriteLorann = "C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\lorann_r.png";
	public static String spriteBlack = "C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\black.png";
	Boolean square = Boolean.valueOf(spriteBlack);
	
	public Window(IKey key, IPurse purse, IDoor door) {
		this.key = key;
		this.purse = purse;
		this.door = door;
		this.setTitle("Lorann");
		this.setSize(850, 660);
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
			
			System.out.println(panel.lorann1.getLorannX() + 1 + "   " + purse.get_PurseX());
			
			if(Window.panel.img[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] == null || panel.lorann1.getLorannX() + 1 == panel.erasex[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] || panel.lorann1.getLorannX() + 1 == key.get_KeyX() || panel.lorann1.getLorannX() +1 == purse.get_PurseX()) {
				Panel.lorann1.setLorannX(Panel.lorann1.getLorannX() + 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
					Window.panel.img[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteBlack));
					panel.erasex[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannX() - 1;
					panel.erasey[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannY();
	
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
			if(Window.panel.img[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] == null || panel.lorann1.getLorannX() - 1 == panel.erasex[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] || panel.lorann1.getLorannX() - 1 == key.get_KeyX()) {
				Panel.lorann1.setLorannX(Panel.lorann1.getLorannX() - 1);
				if(Panel.lorann1.getLorannX() <= 0) {
					Panel.lorann1.setLorannX(Panel.lorann1.getLorannX() + 1);
				}
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));	
					Window.panel.img[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteBlack));
					panel.erasex[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannX() + 1;
					panel.erasey[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannY();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
		}

		if (evt.getKeyCode() == KeyEvent.VK_UP) {
			if(Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() -1] == null || panel.lorann1.getLorannY() - 1 == panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() - 1]  || panel.lorann1.getLorannY() -1 == key.get_KeyY()) {
				Panel.lorann1.setLorannY(Panel.lorann1.getLorannY() - 1);
				if(Panel.lorann1.getLorannY() <= 0) {
					Panel.lorann1.setLorannY(Panel.lorann1.getLorannY() + 1);
				}
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));	
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()+1] = ImageIO.read(new File(spriteBlack));
					panel.erasex[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() + 1] = Panel.lorann1.getLorannX();
					panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() + 1] = Panel.lorann1.getLorannY() + 1;

			}	 catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
			if(Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() +1] == null || panel.lorann1.getLorannY() + 1 == panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() + 1] || panel.lorann1.getLorannY() + 1 == key.get_KeyY()) {
				Panel.lorann1.setLorannY(Panel.lorann1.getLorannY() + 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(spriteLorann));
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() -1] = ImageIO.read(new File(spriteBlack));
					panel.erasex[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() - 1] = Panel.lorann1.getLorannX();
					panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() - 1] = Panel.lorann1.getLorannY() - 1;

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
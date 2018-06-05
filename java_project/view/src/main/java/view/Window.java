package view;
/**
 * Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 */
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import contract.IDoor;
import contract.IKey;
import contract.IPurse;

public class Window extends JFrame implements KeyListener {
/**
 * Create window to launch the game
 */
	private static final long serialVersionUID = 1L;
	public static Panel panel = new Panel();
	public static int debut = 0;
	private IKey key;
	private IPurse purse;
	private IDoor door;
	
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
/**
 * Lorann movements
 */
	public void keyPressed(KeyEvent evt) {

		if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println(door.get_DoorX() + "  " + Panel.lorann1.getLorannX() + 1);
			if(Window.panel.img[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] == null || panel.lorann1.getLorannX() + 1 == panel.erasex[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] || panel.lorann1.getLorannX() + 1 == key.get_KeyX() || panel.lorann1.getLorannX() +1 == purse.get_PurseX()|| panel.lorann1.getLorannX() + 1 == door.get_DoorX()) {
				if(panel.lorann1.getLorannX() + 1 == key.get_KeyX()) {
					door.setKeyState(false);
				}
				if(panel.lorann1.getLorannX() + 1 == door.get_DoorX()) {
					door.verifDoor();
				}
				Panel.lorann1.setLorannX(Panel.lorann1.getLorannX() + 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(getClass().getResource("/sprites/lorann_r.png").toURI()));
					Window.panel.img[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = ImageIO.read(new File(getClass().getResource("/sprites/black.png").toURI()));
					panel.erasex[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannX() - 1;
					panel.erasey[Panel.lorann1.getLorannX() - 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannY();
				} catch (IOException | URISyntaxException e) {
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
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(getClass().getResource("/sprites/lorann_r.png").toURI()));
					Window.panel.img[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = ImageIO.read(new File(getClass().getResource("/sprites/black.png").toURI()));
					panel.erasex[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannX() + 1;
					panel.erasey[Panel.lorann1.getLorannX() + 1][Panel.lorann1.getLorannY()] = Panel.lorann1.getLorannY();

				} catch (IOException | URISyntaxException e) {
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
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(getClass().getResource("/sprites/lorann_r.png").toURI()));
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()+1] = ImageIO.read(new File(getClass().getResource("/sprites/black.png").toURI()));
					panel.erasex[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() + 1] = Panel.lorann1.getLorannX();
					panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() + 1] = Panel.lorann1.getLorannY() + 1;

			}	 catch (IOException | URISyntaxException e) {
					e.printStackTrace();
				}
			}
		}

		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
			if(Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() +1] == null || panel.lorann1.getLorannY() + 1 == panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() + 1] || panel.lorann1.getLorannY() + 1 == key.get_KeyY()) {
				Panel.lorann1.setLorannY(Panel.lorann1.getLorannY() + 1);
				try {
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY()] = ImageIO.read(new File(getClass().getResource("/sprites/lorann_r.png").toURI()));
					Window.panel.img[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() -1] = ImageIO.read(new File(getClass().getResource("/sprites/black.png").toURI()));
					panel.erasex[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() - 1] = Panel.lorann1.getLorannX();
					panel.erasey[Panel.lorann1.getLorannX()][Panel.lorann1.getLorannY() - 1] = Panel.lorann1.getLorannY() - 1;

			} 	catch (IOException e) {
					e.printStackTrace();
						panel.repaint();
				} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

	public void keyReleased(KeyEvent evt) {

	}
}
package view;

import java.awt.Color;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;

	public static Panel panel = new Panel();
	public static int debut = 0;

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
			panel.setLorannX(panel.getLorannX() + 10);
			//System.out.print("ZUCC");
		}

		if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
			panel.setLorannX(panel.getLorannX() - 10);
			//System.out.print("ZUCC");

		}

		if (evt.getKeyCode() == KeyEvent.VK_UP) {
			panel.setLorannY(panel.getLorannY() - 10);
			//System.out.print("ZUCC");

		}

		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
		panel.setLorannY(panel.getLorannY() + 10);
			//System.out.print("ZUCC");

		}
	}

	public void keyReleased(KeyEvent evt) {

	}
}
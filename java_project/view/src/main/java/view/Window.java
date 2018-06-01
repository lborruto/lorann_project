package view;

import java.awt.Color;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

public class Window extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;

	public static Panel panel;
	public static int debut = 0;

	public Window() {
		this.setTitle("Lorann");
		this.setSize(650, 460);
		this.setLocationRelativeTo(null);
		panel = new Panel();
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

		Model model = new Model();
		
		}
	

	public void keyReleased(KeyEvent evt) {

	}
}
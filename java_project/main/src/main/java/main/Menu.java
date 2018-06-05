package main;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.Window;
/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */
public class Menu {
	
	/**
	 * Buttons to launch differents levels
	 */
	private JButton button1 = new JButton("Level 1");
	private JButton button2 = new JButton("Level 2");
	private JButton button3 = new JButton("Level 3");
	private JButton button4 = new JButton("Level 4");
	private JButton button5 = new JButton("Level 5");
	public Menu() {
	Window.panel.add(button1);
	Window.panel.add(button2);
	Window.panel.add(button3);
	Window.panel.add(button4);
	Window.panel.add(button5);
	}
}
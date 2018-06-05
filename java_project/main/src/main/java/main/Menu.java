package main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */
public class Menu extends JPanel{
	
//	private JButton button1 = new JButton("Level 1");
//		private JButton button2 = new JButton("Level 2");
//		private JButton button3 = new JButton("Level 3");
//		private JButton button4 = new JButton("Level 4");
//		private JButton button5 = new JButton("Level 5");
	
	public Menu() {
		
		
		String[] lvl = { "START PRE_ALPHA" };
		JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		int rang = jop.showOptionDialog(null, "Disclamer : This game is in early development and does not reflect the final game.", "WELCOMME TO LORANN", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, lvl, lvl);
		
//		Window.panel.add(button1);
//		Window.panel.add(button2);
//		Window.panel.add(button3);
//		Window.panel.add(button4);
//		Window.panel.add(button5);
//		
		
	}
} 
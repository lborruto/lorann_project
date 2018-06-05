package main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends JPanel{
	
	public Menu() {
		String[] lvl = { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5" };
		JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		int rang = jop.showOptionDialog(null, "Choose level", "Lorann Java", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, lvl, lvl[2]);
	}
}
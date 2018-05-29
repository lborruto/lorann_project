package lorann_debug;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Panel extends JPanel {

	public Window wnd;
	public int size = 32;

	public Panel(Window wnd) {
		this.wnd = wnd;
	}

	public void paintComponent(Graphics g) {
		int x = 0, y = 0;
		g.setColor(Color.WHITE);
		for (char[] tc : wnd._model.lvl.carac) {
			for (char a : tc) {
				Image img = wnd._model.getImage(a);
				g.drawImage(img, x*size, 20+y*size, null);
				y++;
			}
			x++;
			y=0;
		}

	}

}

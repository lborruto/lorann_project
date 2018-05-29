package lorann_debug;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public int size = 32;
	private Model _model = new Model();

	public Panel() {

	}

	private int LorannX = 50;
	private int LorannY = 50;

	public void paintComponent(Graphics g) {

		try {
			BufferedImage img = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_r.png"));
			g.drawImage(img, LorannX, LorannY, null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		int x = 0, y = 0;
		for (char[] tc : _model.lvl.carac) {
			for (char a : tc) {
				Image img = _model.getImage(a);
				g.drawImage(img, x * size, 20 + y * size, null);
				y++;
			}
			x++;
			y = 0;
		}

	}
	
	public int getLorannX() {
		return LorannX;
	}
	
	public int getLorannY() {
		return LorannY;
	}
	
	public void setLorannX(int LorannX) {
		this.LorannX = LorannX;
	}
	
	public void setLorannY(int LorannY) {
		this.LorannY = LorannY;
	}

}

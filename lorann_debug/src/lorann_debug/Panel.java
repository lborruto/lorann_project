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
	public BufferedImage img[][] = new BufferedImage[20][12];

	public Panel() {

	}

	public void paintComponent(Graphics g) {
		
		
		if(Window.debut == 1) {
			for (int x1 = 0; x1 < 20; x1++) {
				for (int y1 = 0; y1 < 12; y1++) {
					g.drawImage(img[x1][y1], x1 * 32, y1 * 32, null);
				} 
			} 
		}
		
		repaint();
	}

	public int getLorannX() {
		return LorannX;
	}

	public int getLorannY() {
		return LorannY ;
	}

	public void setLorannX(int LorannX) {
		this.LorannX = LorannX;
	}

	public void setLorannY(int LorannY) {
		this.LorannY = LorannY;
	}

}

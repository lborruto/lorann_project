package view;
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

	private int LorannX = 2;
	private int LorannY = 3;

	public void paintComponent(Graphics g) {
		
		
		if(Window.debut == 1) {
			for (int x1 = 0; x1 < 20; x1++) {
				for (int y1 = 0; y1 < 12; y1++) {
					g.drawImage(img[x1][y1], x1 * 32, y1 * 32, null);
				} 
			} 
		}
		
		try {
			BufferedImage lorannr = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_r.png"));
			g.drawImage(lorannr, LorannX, LorannY, null);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		repaint();
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

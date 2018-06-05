package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	public int size = 32;
	public int arrayx = 20;
	public int arrayy = 12;
	public BufferedImage img[][] = new BufferedImage[arrayx][arrayy];
	public static Lorann lorann1 = new Lorann();
	public static int erasex[][] = new int[20][12];
	public static int erasey[][] = new int[20][12];
	public int eraseKeyX[][] = new int[20][12];
	public int eraseKeyY[][] = new int[20][12];


	public Panel() {
	}

	public void paintComponent(Graphics g) {

		if (Window.debut == 1) {
			for (int x1 = 0; x1 < arrayx; x1++) {
				for (int y1 = 0; y1 < arrayy; y1++) {
					g.drawImage(img[x1][y1], x1 * size, y1 * size, null);
				}
			}
		}
		repaint();
	}
}
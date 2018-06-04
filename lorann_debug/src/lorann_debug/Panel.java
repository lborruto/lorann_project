package lorann_debug;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	public int size = 32;
	public int arrayx = 20;
	public int arrayy = 12;
	public BufferedImage img[][] = new BufferedImage[arrayx][arrayy];
	public static Lorann lorann1 = new Lorann();


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
		
//		try {
//			BufferedImage perso = ImageIO.read(new File ("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\lorann_r.png"));
//			g.drawImage(perso, lorann1.getLorannX(), lorann1.getLorannY(), null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			BufferedImage mob = ImageIO.read(new File ("C:\\Users\\lucab\\OneDrive\\Documents\\GitHub\\lorann_project\\sprites\\monster_1.png"));
//			g.drawImage(mob, lorann1.getLorannX(), lorann1.getLorannY(), null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
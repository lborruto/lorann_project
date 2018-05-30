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

	public Panel() {

	}

	private int LorannX = 50;
	private int LorannY = 50;

	public void paintComponent(Graphics g) {

		try {
			BufferedImage bg = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/background.png"));
			BufferedImage bone = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/bone.png"));
			BufferedImage crystal = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/crystal_ball.png"));
			BufferedImage fireball1 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/fireball_1.png"));
			BufferedImage fireball2 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/fireball_2.png"));
			BufferedImage fireball3 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/fireball_3.png"));
			BufferedImage fireball4 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/fireball_4.png"));
			BufferedImage fireball5 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/fireball_5.png"));
			BufferedImage gateclosed = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/gate_closed.png"));
			BufferedImage gateopen = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/gate_open.png"));
			BufferedImage horbone = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/horizontal_bone.png"));
			BufferedImage verbone = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/vertical_bone.png"));
			BufferedImage lorannb = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_b.png"));
			BufferedImage lorannbl = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_bl.png"));
			BufferedImage lorannbr = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_br.png"));
			BufferedImage lorannl = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_l.png"));
			BufferedImage lorannu = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_u.png"));
			BufferedImage lorannul = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_ul.png"));
			BufferedImage lorannur = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_ur.png"));
			BufferedImage monster1 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/monster_1.png"));
			BufferedImage monster2 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/monster_2.png"));
			BufferedImage monster3 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/monster_3.png"));
			BufferedImage monster4 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/monster_4.png"));
			BufferedImage monster5 = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/purse.png"));
			BufferedImage lorannr = ImageIO
					.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_r.png"));
			g.drawImage(bg, 0, 0, null);
			g.drawImage(lorannr, getLorannX(), getLorannY(), null);
			g.drawImage(bone, 10, 10, null);
			g.drawImage(crystal, 12, 13, null);
			g.drawImage(fireball1, 15, 18, null);
			g.drawImage(fireball2, 19, 36, null);
			g.drawImage(fireball3, 24, 65, null);
			g.drawImage(fireball4, 12, 89, null);
			g.drawImage(fireball5, 14, 17, null);
			g.drawImage(gateclosed, 26, 28, null);
			g.drawImage(gateopen, 48, 89, null);
			g.drawImage(horbone, 65, 74, null);
			g.drawImage(verbone, 01, 03, null);
			g.drawImage(lorannb, 56, 54, null);
			g.drawImage(lorannbl, 67, 45, null);
			g.drawImage(lorannbr, 43, 40, null);
			g.drawImage(lorannu, 96, 94, null);
			g.drawImage(lorannul, 92, 90, null);
			g.drawImage(lorannur, 74, 23, null);
			g.drawImage(monster1, 85, 65, null);
			g.drawImage(monster2, 85, 69, null);
			g.drawImage(monster3, 158, 848, null);
			g.drawImage(monster4, 177, 848, null);
			g.drawImage(monster5, 188, 848, null);
			g.drawImage(lorannl, 600, 600, null);
			
			

			
		} catch (IOException e) {
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

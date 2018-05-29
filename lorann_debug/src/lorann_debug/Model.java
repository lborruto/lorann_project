package lorann_debug;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Model {

	Maps lvl = new Maps("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/levels/lvl1.txt");
	BufferedImage bf;

	public Image getImage(char a) {
		if (a == '-') {
			try {
				bf = ImageIO.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/horizontal_bone.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			if (a == '|') {
				try {
					bf = ImageIO
							.read(new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/vertical_bone.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				if (a == '.') {
					try {
						bf = ImageIO.read(
								new File("C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/bone.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					if (a == 'H') {
						try {
							bf = ImageIO.read(new File(
									"C:/Users/lucab/OneDrive/Documents/GitHub/lorann_project/sprites/lorann_u.png"));
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						bf=null;
						
					}
				}
			}
		}
		return bf;
	}

}

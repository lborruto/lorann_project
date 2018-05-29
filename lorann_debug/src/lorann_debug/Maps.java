package lorann_debug;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Maps {

	public char[][] carac;

	public Maps(String path) {
		carac = new char[22][14];

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			int x = 0, y = 0;

			while ((line = br.readLine()) != null) {
				for (char a : line.toCharArray()) {
					carac[y][x] = a;
					y++;
				}
				x++;
				y=0;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

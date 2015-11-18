import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Cool303Halloween implements Cool303Theme {

	public void shapeButton(Cool303Button button) {
		try {
			Image img = ImageIO.read(getClass().getResource("resources/water.bmp"));
			button.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
	}
	
	public void shapeWindow(Cool303Container window) {
		
	}
	
	public void shapeWindow(Cool303Container window, String s) {
		
	}

}

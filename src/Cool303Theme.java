import java.awt.*;
import javax.swing.*;

public interface Cool303Theme {
	
	public void shapeButton(Cool303Button button);
	public void shapeWindow(Cool303Container window);
	public void shapeWindow(Cool303Container window, String s);

	public void shapePanel(Cool303Theme theme, Cool303Container window, String s);
}

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class Cool303Panel extends JPanel {

	String s = "";

	public Cool303Panel(Cool303Theme theme) {
		super(new GridBagLayout());
	}

	public Cool303Panel(Cool303Theme theme, String s) {
		super(new GridBagLayout());
		this.setBackground(Color.cyan);
		this.s = s;
	}
}

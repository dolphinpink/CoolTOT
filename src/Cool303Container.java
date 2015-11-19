import javax.swing.JFrame;

public class Cool303Container extends JFrame {

	private Cool303Theme theme;

	public Cool303Container(Cool303Theme theme) {
		super();
		this.theme = theme;
		this.theme.shapeWindow(this);
		setVisible(true);
	}

	public Cool303Container(Cool303Theme theme, String s) {
		super();
		this.theme = theme;
		this.theme.shapeWindow(this, s);
		this.theme.shapePanel(theme, this, s);
		
		setVisible(true);

	}

	public Cool303Container(Cool303Theme theme, int size, String str) {
	}

	private void calculateMinSize() {

	}

}

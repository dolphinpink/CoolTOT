import javax.swing.JFrame;

public class Cool303Container extends JFrame{
	
	public static Cool303Theme theme;
	
	public Cool303Container() {
		super();
		theme.shapeWindow(this);
	}
	
	public Cool303Container(String s) {
		super();
		theme.shapeWindow(this, s);
	}

	public Cool303Container(Cool303Theme theme, int size, String str) {
		
	}
	
	private void calculateMinSize() {
		
	}
	
}

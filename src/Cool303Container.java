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

}

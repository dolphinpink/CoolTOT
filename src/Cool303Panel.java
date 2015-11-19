import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Cool303Panel extends JPanel{
	
	String s = "";
	
	public Cool303Panel(Cool303Theme theme) {
		super();
		this.setSize(300, 400);
	}
	
	public Cool303Panel(Cool303Theme theme, String s) {
		super();
		this.s = s;
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(s, 0, 0);
    }
}

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Cool303Pastel implements Cool303Theme{

	// make round
	public void shapeButton(Cool303Button button) {
		button.setBounds(1/*x_pos*/, 1/*y_pos*/, 30, 25);
		button.setBorder(new RoundedBorder(10)); //10 is the radius
	    button.setForeground(Color.BLUE);
	}
	
	private static class RoundedBorder implements Border {
		
	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	
	public void shapeWindow(Cool303Container window) {
		window.setLayout(new GridBagLayout());
		 
		window.setUndecorated(true);
        window.setSize(300,200);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* allows window to be resized
        window.addComponentListener(new ComponentAdapter() {
            // Give the window an elliptical shape.
            // If the window is resized, the shape is recalculated here.
            @Override
            public void componentResized(ComponentEvent e) {
                window.setShape(new Ellipse2D.Double(0, 0, window.getWidth(), window.getHeight()));
            }
        });*/
	}
	
	public void shapeWindow(Cool303Container window, String s) {
		window.setLayout(new GridBagLayout());
		 
		window.setUndecorated(true);
        window.setSize(300,200);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	
	
}

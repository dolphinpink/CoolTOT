import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Cool303Pastel implements Cool303Theme {

	// make round
	public void shapeButton(Cool303Button button) {
		// button.setBounds(1/* x_pos */, 1/* y_pos */, 30, 25);
		// button.setBorder(new RoundedBorder(10)); // 10 is the radius
		// button.setForeground(Color.BLUE);
	}

	private static class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

	public void shapeWindow(Cool303Container window) {
		window.setLayout(new GridBagLayout());

		window.setUndecorated(true);
		window.setSize(300, 200);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setShape(new Ellipse2D.Double(0, 0, window.getWidth(), window.getHeight()));
	}

	public void shapeWindow(Cool303Container window, String s) {

		window.setUndecorated(true);
		window.setSize(1000, 500);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setShape(new Ellipse2D.Double(0, 0, window.getWidth(), window.getHeight()));

		// extra rectangle with text
		// window.getContentPane().add(new MyCanvas());
	}

	// string has not yet been added
	public void shapePanel(Cool303Theme theme, Cool303Container window, String s) {

		window.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;

		// configuring panel for buttons
		Cool303Panel ogpanel = new Cool303Panel(theme, "dododdododod");
		ogpanel.setPreferredSize(new Dimension(500, 300));
		ogpanel.setMaximumSize(new Dimension(500, 300)); // hardCoded sizing
		ogpanel.setMinimumSize(new Dimension(500, 300));
		window.add(ogpanel);

		// configuring buttons
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 5; x++) {
				c.gridy = y;
				c.gridx = x;
				ogpanel.add(new Cool303Button(theme), c);
				System.out.println("x is " + String.valueOf(x) + " and y is " + String.valueOf(y));
			}
			c.gridwidth = GridBagConstraints.REMAINDER; //end row
		}
		
		System.out.println("aoinsth");
	}
}

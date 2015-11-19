import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cool303Button extends JButton {
	private int number;
	

	public Cool303Button(Cool303Theme theme, int number) {
		super();
		this.number = number;
		theme.shapeButton(this);
		setText(String.valueOf(number));
		this.setBackground(Color.pink);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				if (ae.getSource() instanceof Cool303Button) {
					((Cool303Button)ae.getSource()).setBackground(Color.lightGray);
				}
				System.out.println(String.valueOf((int)((Cool303Button)ae.getSource()).getNum()));
			}

		});

	}
	
	public int getNum() {
		return number;
	}
}

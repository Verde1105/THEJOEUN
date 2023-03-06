package Java_2023_03_06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutEx extends Frame{
	public Button b1, b2, b3, b4, b5;
	public BorderLayoutEx() {
		b1 = new Button("1");
		b1 = new Button("2");
		b1 = new Button("3");
		b1 = new Button("4");
		b1 = new Button("5");
//		BorderLayout bl = new BorderLayout();
//		setLayout(bl);
//		setLayout(new BorderLayout());
		add(b1,"Center");
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.WEST);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}

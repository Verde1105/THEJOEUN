package Java_2023_03_06;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutEx extends Frame{
	
	public Button b1, b2, b3;
	public FlowLayoutEx() {
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}

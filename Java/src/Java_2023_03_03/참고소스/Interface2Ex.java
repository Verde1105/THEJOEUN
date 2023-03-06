package Java_2023_03_03.참고소스;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Interface2Ex extends WindowAdapter{
	
	Frame frame = new Frame();
	public Interface2Ex() {
		frame.setSize(400,600);
		frame.setVisible(true);
		frame.addWindowListener(this);
	}
	public static void main(String[] args) {
		new Interface2Ex();
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}

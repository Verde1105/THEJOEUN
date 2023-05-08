package 참고.AWT.source;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BankFrame extends WindowAdapter{
	
	Frame frame = new Frame();
	
	public BankFrame() {
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.addWindowListener(this);
	}
	
	public BankFrame(int width, int height) {
		frame.setSize(width,height);
		frame.setVisible(true);
		frame.addWindowListener(this);
		
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

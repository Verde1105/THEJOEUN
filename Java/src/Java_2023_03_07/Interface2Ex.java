package Java_2023_03_07;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Interface2Ex extends Frame implements WindowListener{
	
//	Frame frame = new Frame ();
	public Button b1, b2, b3;
	public Interface2Ex() {
		setSize(400,600);
		setVisible(true);
		addWindowListener(this);
	}
	public static void main(String[] args) {
		new Interface2Ex();
	}
	
//	에드 윈도우 리스너가 존재해야 이벤트 발생 유무 감지 가능
//	밑에 녀석이 이벤트같은데, 여기선
//	상속기반에선 this가 해결법
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

}

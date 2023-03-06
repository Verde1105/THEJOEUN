package Java_2023_03_06;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
//중첩레이아웃 = 카드레이아웃
//그리드 이걸로 버튼만들면 재미있겠다
public class GridLayoutEx extends Frame{
	public Button b1,b2,b3,b4,b5;
	public GridLayoutEx() {
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		setLayout(new GridLayout(2,3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}

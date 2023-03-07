package Java_2023_03_06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;

import 복습용.연습용20230305.User;

public class 난이제모른다 extends Frame{
	public Panel p1, p2, p3;
	public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	public TextArea ta;
	public 난이제모른다() {
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		ta = new TextArea("아이디를   입력하시오.", 20, 20);
		//뒤에 숫자는 대강 적을 수 있는 행과 열을 숫자만큼 준다는 뜻.

		
		p1.setLayout(new GridLayout(5,0));
		b1 = new Button("입금");
		b2 = new Button("출금");
		b3 = new Button("계좌이체");
		b4 = new Button("통장정리");
		b5 = new Button("종료");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);

		
		p2.setLayout(new BorderLayout());
		p2.add(ta, BorderLayout.CENTER);
		
		p3.setLayout(new GridLayout(5,1));
		b6 = new Button("신규등록");
		b7 = new Button("미정");
		b8 = new Button("뭘로");
		b9 = new Button("할까");
		b10 = new Button("두근");
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);
		p3.add(b10);
		
		
		setLayout(new GridLayout(1,3));
		add(p1, "West");
		add(p2, "Center");
		add(p3, "East");
		setSize(1200, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 난이제모른다();
		User u = new User();
		
	}
}

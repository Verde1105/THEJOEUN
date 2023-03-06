package Java_2023_03_06;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Scrollbar;
import java.awt.BorderLayout;

public class ScrollbarEx extends Frame{
	public Panel p1, p2;//컴포넌트라고 부름
	public Scrollbar sb_r, sb_g, sb_b;
	public TextField tf;
	public TextArea ta;
	public ScrollbarEx() {
		setTitle("ScrollbarEx");
		tf = new TextField();
		ta = new TextArea();
		p1 = new Panel();
		p2 = new Panel();
		sb_r=new Scrollbar(0,0,10,0,265);
		//가로,밸류,두께,미니멈,맥시멈.세로<얘는 어디냐 스크롤바 길이
		sb_g=new Scrollbar(0,0,10,0,265);
		sb_b=new Scrollbar(0,0,10,0,265);
		Label la1 = new Label("");
		Label la2 = new Label("");
		Label la3 = new Label("");
		Label la4 = new Label("");
		Label la5 = new Label("");
		Label la6 = new Label("");
		Label la7 = new Label("");
		Label la8 = new Label("");
		Label la9 = new Label("");
		Label la10 = new Label("현재색상");
		p1.setLayout(new GridLayout(10,1));
		p2.setLayout(new BorderLayout());
		setLayout(new GridLayout(1,2));
		p1.add(la1);
		p1.add(sb_r);
		p1.add(la2);
		p1.add(sb_g);
		p1.add(la3);
		p1.add(sb_b);
		p1.add(la4);
		p1.add(la10);
		p1.add(tf);
		p1.add(la5);

		p2.add(la6, "East");
//		p2.add(la6, BorderLayout.EAST);
		p2.add(la6, "West");
		p2.add(la6, "North");
		p2.add(la6, "South");
		p2.add(ta, "Center");
		
		this.add(p1);
		this.add(p2);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ScrollbarEx();
	}
}

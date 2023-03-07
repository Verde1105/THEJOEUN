package Java_2023_03_07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
//모든 컴포넌트에 J만 붙이면 스윙

public class EventEx2 extends Frame implements AdjustmentListener{
	public Scrollbar sb_r, sb_g, sb_b;
	public TextArea ta;
	public TextField tf;
	public Color color;
	public Panel p1,p2;
	public EventEx2() {
		sb_r = new Scrollbar(0, 0, 10, 0, 265);
		sb_g = new Scrollbar(0, 0, 10, 0, 265);
		sb_b = new Scrollbar(0, 0, 10, 0, 265);
		setSize(300, 300);
		setVisible(true);
		sb_r.addAdjustmentListener((AdjustmentListener) this);
		sb_g.addAdjustmentListener((AdjustmentListener) this);
		sb_b.addAdjustmentListener((AdjustmentListener) this);
		ta  = new TextArea();
		tf = new TextField("");
		p1 = new Panel();
		p2 = new Panel();
		Label la1 = new Label("");
		Label la2 = new Label("");
		Label la3 = new Label("");
		Label la4 = new Label("");
		Label la5 = new Label("");
		Label la6 = new Label("");
		Label la7 = new Label("");
		Label la8 = new Label("");
		Label la9 = new Label("");
		Label la10 = new Label("현재색상 : ");
		
		p1.setLayout(new GridLayout(10,1));
		p1.add(la1);
		p1.add(sb_r);
		p1.add(la2);
		p1.add(sb_g);
		p1.add(la3);
		p1.add(sb_b);
		p1.add(la4);
		p1.add(la10);
		p1.add(tf);
		p1.add(la9,BorderLayout.WEST);
		

		
		p2.setLayout(new BorderLayout());
		p2.add(la5,BorderLayout.NORTH);
		p2.add(ta,BorderLayout.CENTER);
		p2.add(la6,BorderLayout.SOUTH);
		p2.add(la7,BorderLayout.EAST);
		p2.add(la8,BorderLayout.WEST);
		
		
		this.add(p1);
		this.add(p2);
		setLayout(new GridLayout(1,2));
		
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
//		Color = color =new Color(r, g, b);
		System.out.println(e.getValue());
		int r = sb_r.getValue();
		int g = sb_g.getValue();
		int b = sb_b.getValue();
		Color color = new Color(r,g,b);
		ta.setBackground(color);
		tf.setText("R : " + r + "G : "+ g + " B : " + b);
	}
	public static void main(String[] args) {
		new EventEx2();
	}
}

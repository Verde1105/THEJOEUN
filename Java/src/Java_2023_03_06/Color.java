package Java_2023_03_06;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class Color extends Frame{
	public Color(){
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Scrollbar sb1 = new  Scrollbar(Scrollbar.HORIZONTAL, 200,100,0,255);
		Scrollbar sb2 = new  Scrollbar(Scrollbar.HORIZONTAL, 200,100,0,255);
		Scrollbar sb3 = new  Scrollbar(Scrollbar.HORIZONTAL, 200,100,0,255);
		TextField tf = new TextField("R : 255 G : 255 B : 255",50);
		TextArea ta = new TextArea("",20,10,3);
		Label la1 = new Label("");
		Label la2 = new Label("");
		Label la3 = new Label("");
		Label la4 = new Label("현재색상");
		Label la5 = new Label("");
		Label la6 = new Label("");
		Label la7 = new Label("");
		Label la8 = new Label("");
		Label la9 = new Label("");

		
		p1.setLayout(new GridLayout(9,1));
		setLayout(new GridLayout(1,2));
		
		p1.add(la1);
		p1.add(sb1);
		p1.add(la2);
		p1.add(sb2);
		p1.add(la3);
		p1.add(sb3);
		p1.add(la4);
		p1.add(tf);
		p1.add(la5);
		
		p2.setLayout(new BorderLayout());
		p2.add(la6,BorderLayout.NORTH);
		p2.add(ta,BorderLayout.CENTER);
		p2.add(la7,BorderLayout.EAST);
		p2.add(la8,BorderLayout.SOUTH);
		p2.add(la9,BorderLayout.WEST);

		add(p1);
		add(p2);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Color();
	}
}

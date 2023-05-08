package Java_2023_03_06;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Button;

public class 컨포넌트다써보자 extends Frame{
	public Checkbox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8;
	public 컨포넌트다써보자() {
		ch1 = new Checkbox();
		ch2 = new Checkbox("아침");
		ch3 = new Checkbox("점심");
		ch4 = new Checkbox("저녁");
		ch5 = new Checkbox();
		ch6 = new Checkbox("사과");
		ch7 = new Checkbox("딸기");
		ch8 = new Checkbox("배");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		TextField tf = new TextField("<<자바 수강생 식생활>>",50);
		Label la1 = new Label("");
		Label la2 = new Label("");
		Label la3 = new Label("");
		Label la4 = new Label("");
		Label la5 = new Label("");
		Label la6 = new Label("");
		Label la7 = new Label("");
		Label la8 = new Label("");
		p1.setLayout(new GridLayout(2,0));
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		p1.add(ch1);
		p1.add(ch2);
		p1.add(ch3);
		p1.add(ch4);
		
		p1.add(ch5);
		p1.add(ch6);
		p1.add(ch7);
		p1.add(ch8);
	
		p2.add(la1,BorderLayout.NORTH);
		p2.add(tf,BorderLayout.CENTER);
		p2.add(la2,BorderLayout.SOUTH);
		p2.add(la5,BorderLayout.EAST);
		p2.add(la6,BorderLayout.WEST);
		
		Choice cho = new Choice();
		cho.add("아침");
		cho.add("점심");
		cho.add("저녁");
		cho.add("사과");
		cho.add("딸기");
		cho.add("배");
	p3.add(la3,BorderLayout.NORTH);
	p3.add(cho,BorderLayout.CENTER);
	p3.add(la4,BorderLayout.SOUTH);
	p3.add(la7,BorderLayout.EAST);
	p3.add(la8,BorderLayout.WEST);
	
	setLayout(new GridLayout(3,1));
	add(p1);
	add(p2);
	add(p3);
	setSize(500,500);
	setVisible(true);
	}
	public static void main(String[] args) {
	new 컨포넌트다써보자();
	}
}

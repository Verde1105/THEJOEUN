package Java_2023_03_06;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.List;

public class GuiEx extends Frame {
	public GuiEx() {
		Panel p = new Panel();
		Button b = new Button("버튼");
		b.setLabel("변경된 라벨");
		Checkbox ch1 = new Checkbox("체크박스",true);
		Checkbox ch2 = new Checkbox("체크박스",false);
		Checkbox ch3 = new Checkbox("체크박스",false);
		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ch4 = new Checkbox("라디오 버튼",true, ch);
		Checkbox ch5 = new Checkbox("라디오 버튼",false, ch);
		Checkbox ch6 = new Checkbox("라디오 버튼",false, ch);
		Choice cho = new Choice();
		cho.add("학년선택");
		cho.add("1학년");
		cho.add("2학년");
		cho.add("3학년");
		cho.add("4학년");
		Label la = new Label("자바 수강생");
		List ls = new List(5,true);
		ls.add("List 1");
		ls.add("List 2");
		ls.add("List 3");
		ls.add("List 4");
		ls.add("List 5");
		Scrollbar sb = new  Scrollbar(Scrollbar.HORIZONTAL, 200,100,0,255);
		TextField tf = new TextField("TextField",50);
		TextArea ta = new TextArea("TextArea",20,10,3);
		//이하 추가할것을 반드시 넣어주어야 시각화
		p.add(b);
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(ch4);
		p.add(ch5);
		p.add(ch6);
		p.add(cho);
		p.add(la);
		p.add(ls);
		p.add(sb);
		p.add(tf);
		p.add(ta);
		add(p);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiEx();
	}
}

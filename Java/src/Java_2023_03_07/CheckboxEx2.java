package Java_2023_03_07;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
//라디오버튼은 트루펄스
//초이스는 아침 점심 저녁이랑 연동
//버튼 선택에 따라 텍스트 바뀌도록
//창닫기 연습
import java.awt.event.AdjustmentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CheckboxEx2 extends Frame implements ItemListener{
	public Panel p1, p2, p3, p4;
	public Label la[] = new Label[10];
	public CheckboxGroup cg;
	public Checkbox ch1, ch2, ch3, ch4, ch5, ch6;
	public TextArea ta;
	public Choice cho;

	public CheckboxEx2() {
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		for (int i = 0; i < la.length; i++) {
			la[i] = new Label("");
		}
		cg = new CheckboxGroup();
		ch1 = new Checkbox("아침", cg, true);
		ch2 = new Checkbox("점심", cg, false);
		ch3 = new Checkbox("저녁", cg, false);
		ch4 = new Checkbox("사과",false);
		ch5 = new Checkbox("딸기",false);
		ch6 = new Checkbox("배",false);
		ta = new TextArea("", 20, 20, TextArea.SCROLLBARS_NONE);
		cho = new Choice();
		cho.add("아침");
		cho.add("점심");
		cho.add("저녁");
		p1.setLayout(new GridLayout(2, 4));
		p1.add(la[8]);		p1.add(ch1);		p1.add(ch2);		p1.add(ch3);
		p1.add(la[9]);		p1.add(ch4);		p1.add(ch5);		p1.add(ch6);
		
		p2.setLayout(new BorderLayout());
		p2.add(ta, BorderLayout.CENTER);
		p2.add(la[0], BorderLayout.NORTH);
		p2.add(la[1], BorderLayout.SOUTH);
		p2.add(la[2], BorderLayout.WEST);
		p2.add(la[3], BorderLayout.EAST);

		p3.setLayout(new BorderLayout());
		p3.add(cho, BorderLayout.CENTER);
		p3.add(la[4], BorderLayout.SOUTH);
		p3.add(la[5], BorderLayout.NORTH);
		p3.add(la[6], BorderLayout.WEST);
		p3.add(la[7], BorderLayout.EAST);

		add(p1, "North");
		add(p2, "Center");
		add(p3, "South");
		setSize(300, 300);
		setVisible(true);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		ch4.addItemListener(this);
		ch5.addItemListener(this);
		ch6.addItemListener(this);
		cho.addItemListener(this);

	}
	
	public static void main(String[] args) {
		new CheckboxEx2();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o == cho) {
			String str = cho.getSelectedItem();
			if(str.equals("아침")) {
				ch1.setState(true);
			}else if(str.equals("점심")) {
				ch2.setState(true);
			}else if(str.equals("저녁")) {
			ch3.setState(true);
			}
		}
		Checkbox temp = cg.getSelectedCheckbox();
		ta.setText("<<"  + temp.getLabel() + ">>\n\n");
		ta.append("1. 사과  : " + ch4.getState()+"\n");
		ta.append("2. 딸기  : " + ch5.getState()+"\n");
		ta.append("3. 배  : " + ch6.getState()+"\n");
		cho.select(temp.getLabel());
	}
	
}
package Java_2023_03_07;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx extends Frame implements ActionListener{
	public Button b1, b2, b3;
	public EventEx() {
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		setLayout(new FlowLayout()); //얘 중요. 레이아웃
		add(b1);//버튼 만듦
		add(b2);
		add(b3);
		setSize(300,300);
		setVisible(true); //버튼 누름
		b1.addActionListener(this);//감지
		b2.addActionListener(this);//감지
		b3.addActionListener(this);//감지
	}
	public void actionPerformed(ActionEvent e) {//이벤트 호출
		/*
		 * 1.이퀄쓰는법
		 * string str = b1.getlabel();
		 * if(str.equals("b1")) 이퀄 쓰는 법.
		 */
		
		/*
		 * 2.오브젝트와 겟 소스 사용, 근본적인 객체를 물어볼 수 있는 방법
		 * Object obj = e.getSource
		 * obj == b1
		 * obj.equals
		 * 
		 * 2.자동형변환 사용한다면
		 * Button button = (Button)obj;
		 * 모든건 객체화 될 수 있다 /자동 형변환.
		 * 
		 * obj.getLabel();
		 * 
		 * e.getSource()
		 * 
		 * 
		 * String str = b1.getLabel(); x b1

		4.이벤트 발생 감지하는 신경같은 녀석
		if (e.getActionCommand()==b1.getLabel()) {
		 *이벤트 발생 객체를 감지 
		 */
		 if (e.getActionCommand()==b1.getLabel()) {
			 System.out.println("이벤트 발생!");
		}else if (e.getActionCommand()==b2.getLabel()) {
			System.out.println("두번째 나오드나");
			
		}else if(e.getActionCommand()==b3.getLabel()){
			System.out.println("이게 전공자껀데 되나? 되네");
			
		}
	}
	public static void main(String[] args) {
		new EventEx();
	}
}

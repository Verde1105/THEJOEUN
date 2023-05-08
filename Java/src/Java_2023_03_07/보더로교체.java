package Java_2023_03_07;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import 복습용.연습용20230305.User;

public class 보더로교체 extends Frame implements ActionListener{
	/* 변수 선언부 */
	public Panel p1, p2, p3;
	public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	public TextArea ta;
	public 보더로교체() {
		setLayout(new FlowLayout());
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		ta = new TextArea("ㅅpㅅ", 20, 20, 3);
		//뒤에 숫자는 대강 적을 수 있는 행과 열을 숫자만큼 준다는 뜻.
		//20,20 뒤에 숫자 3이 붙으면 안보임. 0이면 둘 다 있음, 1이나 2면 가로나 세로에 스크롤바가 존재.
		
		Label la1 =new Label("                                                아이디를 입력하시오");
		Label la2 =new Label("");
		Label la3 =new Label("");
		Label la4 =new Label("");
		Label la5 =new Label("안녕");
		
		b1 = new Button("입금");
		b2 = new Button("출금");
		b3 = new Button("계좌이체");
		b4 = new Button("통장정리");
		b5 = new Button("종료");
		p1.setLayout(new GridLayout(5,1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		
		b11 = new Button("터치패드들어갈곳");
		p2.setLayout(new BorderLayout());
		p2.add(b11);
		p2.add(la1, BorderLayout.NORTH);
		p2.add(ta, BorderLayout.CENTER);
		p2.add(la2, BorderLayout.EAST);
		p2.add(la3, BorderLayout.WEST);
		p2.add(la4, BorderLayout.SOUTH);
		p2.add(b11, BorderLayout.SOUTH);
		
		b6 = new Button("신규등록");//=회원가입
		b7 = new Button("로그인");
		b8 = new Button("공과금수납");//자동이제를 여기서 되도록
		b9 = new Button("대출확인");//마이너스 통장 매꾸기용
		b10 = new Button("보이스피싱 신고");//112텍스트나 금감원홈페이지라도 접속되게 해볼까
		
		p3.setLayout(new GridLayout(5,1));
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);
		p3.add(b10);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		
		
		setLayout(new GridLayout(1,3));
		add(p1, "West");
		add(p2, "Center");
		add(p3, "East");
		setSize(1200, 500);
		setVisible(true);
		
		// 종료창
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.out.println("종료버튼 클릭");
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new 보더로교체();
		User u = new User();
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		System.out.println("패스워드를 입력하시오.");
		String password = scan.nextLine();

		
		u.setId(id);
		u.setPassword(password);
		u.setNum(0);
		
		User[] userArr = new User[10];
		userArr[0] = u;
		
		System.out.println(userArr[0].toString());

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()==b1.getLabel()) {
//			ta = new TextArea("ㅇㅇㅇ", 20, 20, 3);//얘까지는 된다.
		}else if (e.getActionCommand()==b2.getLabel()) {
		}else if (e.getActionCommand()==b3.getLabel()) {
		}else if (e.getActionCommand()==b4.getLabel()) {
		}else if (e.getActionCommand()==b5.getLabel()) {
		}else if (e.getActionCommand()==b6.getLabel()) {
		}else if (e.getActionCommand()==b7.getLabel()) {
		}else if (e.getActionCommand()==b8.getLabel()) {
		}else if (e.getActionCommand()==b9.getLabel()) {
		}else if (e.getActionCommand()==b10.getLabel()) {
		}else if (e.getActionCommand()==b11.getLabel()) {
		}

	}
}

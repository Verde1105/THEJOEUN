package 참고.AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import 참고.BANK.source.A1_회원가입;
import 참고.BANK.source.A2_회원정보;
import 참고.BANK.source.A3_로그인;
import 참고.BANK.source.A4_자산관리;



public class MainFrame {
	
	private Frame mainFrame;
	private Panel headerPanel, contentsPanel, footerPanel;
	private Button btn4_1,btn4_2,btn4_3,btn4_4;
	private Label headerLabel;
	private Label statusLabel;
	final TextField userText = new TextField(6);
	final TextField passwordText = new TextField(6);
	
	public MainFrame(String[][] database, String[] session) {
		gui();
		buttenEvent(database, session);
	}

	public void gui() {
		
		/* Body */
		int width = 400;
		int height = 500;
		mainFrame = new Frame("BANK SYSTEM");
		mainFrame.setSize(width, height);
		mainFrame.setLayout(new GridLayout(4, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		/* HEADER */
		headerPanel = new Panel();
//		panel01.setLayout(new GridLayout(4,0));
		btn4_1 = new Button("회원가입");
		btn4_2 = new Button("회원관리");
		btn4_3 = new Button("자산관리");
		btn4_4 = new Button("종료");
		headerPanel.add(btn4_1);
		headerPanel.add(btn4_2);
		headerPanel.add(btn4_3);
		headerPanel.add(btn4_4);
		
		/*CONTENTS*/
		contentsPanel = new Panel();
		contentsPanel.setLayout(new FlowLayout());
		Label namelabel = new Label("아이디 : ", Label.RIGHT);
		Label passwordLabel = new Label("패스워드 : ", Label.CENTER);
		
		passwordText.setEchoChar('*');
		contentsPanel.add(namelabel);
		contentsPanel.add(userText);
		contentsPanel.add(passwordLabel);
		contentsPanel.add(passwordText);
		
		/*Footer*/
		footerPanel = new Panel();
		footerPanel.setLayout(new FlowLayout());
		footerPanel.setSize(400,200);
		
		// 조립
		mainFrame.add(headerPanel);
		mainFrame.add(contentsPanel);
		mainFrame.add(footerPanel);
		mainFrame.setVisible(true);
		
	}// The end of method
	
	public void buttenEvent(String[][] database, String[] session) {
		
		/* 클래스 instance 생성 */
		A1_회원가입	회원가입_instance 	= new A1_회원가입();
		A2_회원정보	회원정보_instance 	= new A2_회원정보();
		A3_로그인 	로그인_instance		= new A3_로그인();
		A4_자산관리	자산관리_instance	= new A4_자산관리();
		
		
		btn4_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입 버튼 클릭");
				System.out.println("[AWT] ID : "+userText.getText());
				System.out.println("[AWT] PW : "+passwordText.getText());
				회원가입_instance.회원가입(database, userText.getText(), passwordText.getText());
			}
		});
		btn4_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원관리 버튼 클릭");
				for (int i = 0; i < database.length; i++) {
					Label idLable = new Label(database[i][0], Label.LEFT);
					Label pwLabel = new Label(database[i][1], Label.CENTER);
					Label balanceLabel = new Label(database[i][2], Label.CENTER);
					Label acnumLabel = new Label(database[i][3], Label.RIGHT);
					
					// 하단 페널에 회원정보 인입
					footerPanel.add(idLable);
					footerPanel.add(pwLabel);
					footerPanel.add(balanceLabel);
					footerPanel.add(acnumLabel);
				}// The end of for
			}// The end of method
		});
		btn4_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("자산관리 버튼 클릭");
			}
		});
		btn4_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료 버튼 클릭");
			}
		});
		
		
	}// The end of method
}

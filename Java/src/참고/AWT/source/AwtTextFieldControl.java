package 참고.AWT.source;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtTextFieldControl {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel, buttonPanel;

	public AwtTextFieldControl() {
		prepareGUI();
	}

	public static void main(String[] args) {
		AwtTextFieldControl awtControlDemo = new AwtTextFieldControl();
		awtControlDemo.showTextField();
	}

	private void prepareGUI() {
		// Frame 에 대한 셋팅
		mainFrame = new Frame("Java AWT 샘플");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(4, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		// 상단에 있는 라벨
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		headerLabel.setText("Control Test : TextField");

		// 하단 상태값 라벨
		statusLabel = new Label();
		statusLabel.setText("Status Lable");
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350, 100);

		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());

		buttonPanel = new Panel();
		buttonPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(buttonPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showTextField() {
		Label namelabel = new Label("아이디 : ", Label.RIGHT);
		Label passwordLabel = new Label("패스워드 : ", Label.CENTER);
		final TextField userText = new TextField(6);
		final TextField passwordText = new TextField(6);
		passwordText.setEchoChar('*');

		Button loginButton = new Button("Login");

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "아이디 : " + userText.getText();
				data += ", 패스워드 : " + passwordText.getText();
				statusLabel.setText(data);
			}
		});

		userText.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				//statusLabel.setText("key Typed");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				statusLabel.setText("key release");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				statusLabel.setText("key press");
			}
		});
		
		controlPanel.add(namelabel);
		controlPanel.add(userText);
		controlPanel.add(passwordLabel);
		controlPanel.add(passwordText);
		controlPanel.add(loginButton);
		mainFrame.setVisible(true);
	}
}
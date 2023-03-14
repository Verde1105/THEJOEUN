package Java_2023_03_14;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable, ActionListener{
	private BufferedReader i;
	private PrintWriter o;
	private JTextArea output;
	private JTextField input;
	private JLabel label;
	private Thread listener;
	private String host;
	JScrollBar jb;
	JScrollPane jp;
	public ChatClient ( String server) {
		super("채팅프로그램");
		host = server;
		listener = new Thread(this);
		listener.start();
		output = new JTextArea ();
		jp = new JScrollPane(output);
		jb = jp.getVerticalScrollBar();
		add(jp,"Center");//스크롤 바 대신 스크롤 패널
		output.setEditable(false);
		Panel bottom = new Panel(new BorderLayout());
		label = new JLabel("사용자 이름");
		bottom.add(label, "West");
		input = new JTextField();
		input.addActionListener(this);
		bottom.add(input, "Center");
		add(bottom, "South");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	
	public void run() {
		try {
			Socket s = new Socket(host,7979);
			InputStream ins = s.getInputStream();
			OutputStream os = s.getOutputStream();
			i = new BufferedReader(new InputStreamReader(ins));
			o = new PrintWriter(new OutputStreamWriter(os),true);
			while (true) {
				String line = i.readLine();
				output.append(line + "\n");
//				jb.getMaximum();
				jb.setValue(jb.getMaximum());
			}
		}
		catch (IOException ex) {	}
		}
	
	public void actionPerformed(ActionEvent e) {
		Object c = e.getSource();
		if ( c == input) {
			label.setText("메세지");
			o.println(input.getText());
			input.setText("");
		}
	}
	
	public static void main(String[] args) {
		if (args.length > 0) {
			new ChatClient(args[0]);
		}else {
			new ChatClient("localhost");
		}
	}
}

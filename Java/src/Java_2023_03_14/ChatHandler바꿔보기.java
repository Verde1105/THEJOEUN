package Java_2023_03_14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.regex.Pattern;

public class ChatHandler바꿔보기 extends Thread{
	private Socket s;
	private BufferedReader i;
	private PrintWriter o;
	private ChatServer server;
	public ChatHandler바꿔보기(ChatServer server, Socket s) throws Exception{
		this.s = s;
		this.server = server;
		InputStream ins = s.getInputStream();
		OutputStream os = s.getOutputStream();
		InputStreamReader isr = new InputStreamReader(ins);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		o = new PrintWriter(osw, true);
		i = new BufferedReader(isr);
	}
	
	public void run() {
		String name = "";
		String 유효성 ="d{1,12}";
		try {
			name = i.readLine();//첫번째 줄이 아이디 생성
//			boolean result = Pattern.matches(유효성, name);
			boolean result = false;
			
			if (name.length() > 0 ) {
				result = true;
			}
			
			if (result) {
				System.out.println("사용가능한 아이디입니다.");
			}else {
				System.out.println("사용하실 아이디를 입력해주세요.");
			}
			server.register(this);
			broadcast (name + "님이 방문하셨습니다.");
			while (true) {
				String msg = i.readLine();
				broadcast (name + "-" +msg);
			}
		} catch (Exception e) { }
			server.unregister(this);
			broadcast (name + "님이 나가셨습니다.");
			try {
				i.close();
				o.close();
				s.close();
			} catch (Exception ex) { }
		}
	protected void println(String message) {
	o.println(message);
	}
	protected void broadcast(String message) {
		server.broadcast(message);
	}
}

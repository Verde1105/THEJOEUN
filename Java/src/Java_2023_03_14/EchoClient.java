package Java_2023_03_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//아이피 입력이 아규먼츠(서버에게 아이피를 줘야함)ㅇㅇㅇ
//인풋 > 리더 >와이더 >아웃풋
public class EchoClient {
	private Socket socket;
	public EchoClient(String host, int port) throws Exception{
		System.out.println("PORT : "+port);
		System.out.println("HOST : "+host);
		socket = new Socket(host,port);
		System.out.println(socket.getInetAddress().getHostAddress() + "에 연결됨");
	}
	public void echo() throws IOException{
		System.out.println("echo()");
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(is));//인풋 시스템(is)를 버퍼로 읽기
		PrintWriter out = new PrintWriter(os,true);//자동계행,출력도움
		BufferedReader con = new BufferedReader(new InputStreamReader(System.in));//시스템에서 입력한것을 바로 버퍼로 읽기
		
		while (true) {
			String msg = con.readLine();
			out.println(msg);//서버로 다시 보냄
			if (msg.equals("bye")) {
				break;
			}
			System.out.println(in.readLine());//서버에서 다시 되돌려보냄
		}
	}
	public void close() throws IOException{
		System.out.println("close()");
		socket.close();
	}
	
	public static void main(String[] args) {
		
		try {
			EchoClient ec;
			System.out.println("메세지를 입력하세요.");
			if (args.length > 0) {
//				ec = new EchoClient(args[0], 80);
				ec = new EchoClient("127.0.0.0", 80);
			}else {
				ec = new EchoClient("localhost", 80);
			}
			ec.echo();
			ec.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

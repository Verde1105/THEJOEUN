package Java_2023_03_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//서버부터 열어야한다.

//1. 스레드로 접속 유지
//2. 컬렉션(리스트)으로 인원 담기
//3. 반복문(모두에게 전달해야하니까)//브로드캐스트
//4. 입퇴장 알림
//5. 동기화처리(싱크로).영역구분 가능 바디만들기.
//
public class EchoServer {
	public ServerSocket server;
	
	public EchoServer(int port) throws IOException{
		System.out.println("PORT : "+port);
		server = new ServerSocket(port);//여기서 만들어진 서버가 통신장치
	}// The end of Constructor
	
	public void Service() throws IOException{
		
		System.out.println("Service()");
		String connIp = server.getInetAddress().getHostAddress();
		System.out.println(connIp + "에서 연결 시도.");
		
		Socket client = server.accept(); //client = 통신가능 소켓 //얘 단독 스레드 필요함..
		InputStream is = client.getInputStream(); //넣고 뺄때는 바이트
		OutputStream os = client.getOutputStream();
		InputStreamReader isr = new InputStreamReader(is);//요 빨간 라인이 스트링으로 바꿔주는 애들
		BufferedReader in = new BufferedReader(isr);//읽는 애(클라이언트에서 보낸것을)
		PrintWriter out = new PrintWriter(os,true);//출력하는 애
		
		while (true) {
			String msg = in.readLine();//메세지 받아들이기(서버가)
			System.out.println(msg);//모니터에 출력
			if (msg.equals("bye")) {
				break;
			}
			out.println(">>" + msg);
		}// The end of while
		
	}// The end of method
	
	public void close() throws IOException { //통신준비를 마침
		System.out.println("close()");
		server.close();
	}// The end of method
	
	public static void main(String[] args) {
		System.out.println("EchoServer START");
		try {
			EchoServer es = new EchoServer(80);//임의의 포트지정
			es.Service();
			es.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//객체를 스트링으로 변환했다가 랜선망 이동 후(객체직렬화) 다시 객체화

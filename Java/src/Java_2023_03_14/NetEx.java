package Java_2023_03_14;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
포트는 0번에서 65,535번까지 16비트 정수의 형태를 가집니다.
abstract대개 0~1024 까지는 시스템이나 기존 서비스에서 사용하는 포트(상용화) 이고 1024 이상의 포트는 여러분들이 임의로 쓰셔도 좋습니다.
*/
public class NetEx {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
			System.err.println("hostname" + ip.getHostName());
			System.out.println("ip : " + ip.getHostAddress());
			
			InetAddress[] ips = InetAddress.getAllByName("www.google.co.kr");
			for (InetAddress i : ips) {
				System.out.println("ip 주소 : " + i);
			}
			byte[] ipAddr = ip.getAddress();
			for(byte b : ipAddr) {
				System.out.println(((b<0) ? b + 256 : b) + ".");
			}
			System.out.println();
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP" + local);
			
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress()+"주소"+ip2);
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}
}

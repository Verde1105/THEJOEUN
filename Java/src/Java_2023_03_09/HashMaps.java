package Java_2023_03_09;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class HashMaps {
	public static void main(String[] args) throws Exception{
		Map<String,String> map = new HashMap();
		
		Properties properties = null;
		properties = new Properties();
		
		String path = HashMaps.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8");
		properties.load(new FileReader(path));//파일 읽어오는 장치
		
		String driver = properties.getProperty("driver");
		String ur1 = properties.getProperty("ur1");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("ur1 : " + ur1);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
		String adminId = properties.getProperty("username");
		String adminPw = properties.getProperty("password");
		
		map.put(adminId, adminPw);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디 : ");
			String id = scanner.next();
			System.out.println("비밀번호 : ");
			String pw = scanner.next();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다");
					break;
				}else{
					System.out.println("비밀번호를 다시 입력해주세요");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		}
		scanner.close();
	}
}

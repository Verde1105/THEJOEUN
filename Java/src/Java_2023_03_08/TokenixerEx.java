package Java_2023_03_08;

import java.io.StreamTokenizer;
import java.util.Iterator;
import java.util.StringTokenizer;

public class TokenixerEx {//트림은 메소드지만 얘는 객체라 메소드에는 없는 기능들이 있다.
	public static void main(String[] args) {
		String str = "자바 SE, 자바 EE, 자바 ME";
		String delim = ","; //args[0]
		StringTokenizer st;//자른것은 토큰으로 부른다.
//		st = new StringTokenizer(str);//디폴트가 공백(스페이스) 기준으로 컷.
		st = new StringTokenizer(str,delim);//딜림 기준으로 컷.
		st = new StringTokenizer(str,delim,true);//리턴 딜림. , 까지 토큰으로 계산
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {//자를 대상이 끝날때까지 기동
			String token = st.nextToken();//토큰은 자른 대상을 스트링으로 반환 / 엘리먼트는 오브젝트로 반환한다.
			System.out.println(token);
		}
		int temp = st.countTokens();
		for (int i = 0; i < temp; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

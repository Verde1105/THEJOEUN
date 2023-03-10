package Java_2023_03_09;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

import sun.text.resources.zh.CollationData_zh_TW;

public class VectorEx {
	/*
	 * Collation 	//null체크 가능
	객체를 담을 수 있는 기억장소, 여러가지 자료를 
	적절한 형태로 처리하고
	저장하는 저장형태(묶음)의 자료구조.
	*/
	
	public static void main(String[] args) {
		Vector vc = new Vector();
//		Object add
		
		vc.add("홍길동1");
		vc.add("홍길동2");
		vc.add("홍길동3");
		String str1 = (String) vc.get(0);//컬랙션은 오브젝트만 가능. 들어가는 순간부터 오브젝트. ()안은 캐스팅
		String str2 = (String) vc.get(0);
		String str3 = (String) vc.get(0);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("이름을 입력하세요 :  ");
		String name =new Scanner(System.in).next();
		int index= vc.indexOf(name);
		if (vc.contains(name)) {
			System.out.println("검색결과 있음 :" + vc.get(index));
			if (vc.remove(name)) {
				System.out.println("삭제 완료!!!");
			}
			System.out.println("<< 출력 결과 표현 1 >>");
			for (int i = 0; i < vc.size(); i++) {
				Object obj = vc.get(i);
				String str = (String)obj;
				System.out.println(str);
				
			}
			System.out.println("<<출력 결과 - 표현 2 >>");
			Iterator it = vc.iterator();
			
			while (it.hasNext()) {
				String n = (String) it.next();
				System.out.println(n);
			}
			System.out.println("<<출력 결과 - 표현 3 >>");
			Enumeration e = vc.elements();
				while (e.hasMoreElements()) {
				Object obj = e.nextElement();
				String str = (String) obj;
				System.out.println(str);
			}
			System.out.println("<<출력 결과 - 표현 4 >>");
			for (Object obj : vc) {
				String str = (String)obj;
				System.out.println(str);
				
			}
//				type type = (type) it.nextElement();
				
		}else {
		System.out.println("검색결과없음!");
		}
		
	}
}

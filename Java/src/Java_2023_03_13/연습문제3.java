package Java_2023_03_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//뱅크에 사용자(회원) 데이터를 파일로 기록하는 프로그램을 작성하시오.
//껐다 다시 키더라도 사용정보 유지(영속성)
//내가 하던 리스트에 얘만 넣으면 될것같은데
//텍스트에 정보가 들어가게 만들고
//그걸 다시 불러오도록 = 이럼 영속성 가능할것같아.
public class 연습문제3 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		문제3 a = new 문제3();
		
		String 아이디 = scan.nextLine();
		String 비밀번호 = scan.nextLine();
		a.setId(아이디);
		a.setPw(비밀번호);
		a.setNum(0);
		List<ArrayList<문제3>> l = new ArrayList<>();//리스트의 시작
		ArrayList<문제3> l1 = new ArrayList<>();//리스트 하나 추가
		
		
		
		
		BufferedReader br = new BufferedReader(new FileReader("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13\\IO.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13\\De.txt"));

//		while (condition) {
			
//		}
			System.out.println(아이디);
			bw.write(아이디 + "\n");
			
			      br.close();
			      bw.close();
			   
		l.add(l1);//리스트의 끝
		
	
	}
}


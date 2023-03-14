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
		
		/* 변수선언부 */
		List<문제3> list = new ArrayList<문제3>();
		Scanner scan = new Scanner(System.in);
		
		boolean run =  true;
		do {
			System.out.println("1. 회원정보 입력, 0. 입력 종료");
			int select = new Scanner(System.in).nextInt();
			switch (select) {
			case 1:
				System.out.print("ID : ");
				String 아이디 = scan.nextLine();
				System.out.print("PW : ");
				String 비밀번호 = scan.nextLine();
				
				문제3 a = new 문제3();
				a.setId(아이디);
				a.setPw(비밀번호);
				a.setNum(0);
				
				list.add(a);
				
				break;

			case 0:
				System.out.println("입력종료");
				run = false;
				break;
			}
			
		} while (run);
		
		
//		List<ArrayList<문제3>> l = new ArrayList<>();//리스트의 시작
//		ArrayList<문제3> l1 = new ArrayList<>();//리스트 하나 추가
		
//		BufferedReader br = new BufferedReader(new FileReader("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13\\IO.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13\\De.txt"));
		
		// 파일을 읽어온다.
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\Java_2023_03_13\\IO.txt"));
		
		// 파일 쓰기
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\src\\Java_2023_03_13\\De.txt"));
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i).getId()+"\t"+list.get(i).getPw()+"\t"+list.get(i).getNum()+"\n");
		}
		
		br.close();
		bw.close();
			   
	}
}


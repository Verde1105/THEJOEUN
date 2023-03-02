package Java_2023_03_02;

import java.util.Scanner;

class Bank시도 {
	public static void main(String[] args) {
		Bank시도 a = new Bank시도();
		a.내역();
		boolean run = true;
		int balance = 30000;
		
	}
	
	public static void 내역() {
		Scanner scan = new Scanner(System.in);
		String answer =scan.nextLine();
		answer = "";
		String[] 선택지 = new String[5];
		System.out.println("1. 오늘 //2. 1일전 //3. 2일전 //4. 3일전");
		System.out.println("0. 전체내역");
		System.out.println("선택> ...▽");
		System.out.println("돌아가려면 아무 키나 눌러주세요.");
	
		for (int i = 1; i < 선택지.length;) {
			if (i == 4)/*3일전을 선택 시*/ {
				System.out.println(" 티르의 날 : 퀘스트 완료 보상 " + "+"+12000 + "G");
				System.out.println(" 티르의 날 : 무기 수리비 " + "-"+10000 + "G");
				System.out.println(" 티르의 날 : 치료비 " + "-"+5000 + "G");
				System.out.println(" 티르의 날 : 식비 " + "-"+1000 + "G");
				//	이걸 이프가 아니라 상속으로 하면 총액을 볼수있지않을까?
			}else if(i == 3)/*2일전을 선택 시*/{
				System.out.println(" 오딘의 날 : 숙박비 " + "-"+1500 + "G");
				System.out.println(" 오딘의 날 : 식비 " + "-"+800 + "G");
			}else if(i == 2)/*1일전을 선택 시*/ {
				System.out.println(" 토르의 날 : 퀘스트 완료 보상 " + "+"+8000 + "G");
				System.out.println(" 토르의 날 : 무기 수리비 " + "-"+5000 + "G");
				System.out.println(" 토르의 날 : 식비 " + "-"+1200 + "G");
			}else if(i == 1)/*오늘 내역 보기*/{
				System.out.println(" 프레이야의 날 : 무기 수리비 " + "-"+10000 + "G");
				System.out.println(" 프레이야의 날 : 치료비 " + "-"+5000 + "G");
				System.out.println(" 프레이야의 날 : 식비 " + "-"+500 + "G");
			}else if(i == 0)/*전체내역보기*/ {
				System.out.println("전체내역");
			}else/*돌아가기*/ {
				System.out.println("돌아가기");
			}
		}
	}

class 조회기능{
//	계좌조회 함 해보자
//	고정출금 월급이 들어왔어요~ 월급이 로그아웃했어요~
//	마이너스 통장이라 상황하는 칸도 있어야 함.	
}
}
package Java_2023_03_02;

import java.util.Scanner;

class Bank시도 {
	public static void main(String[] args) {
		Bank시도 a = new Bank시도();
		boolean run = true;
		int balance = 30000;
		a.내역(balance);
		
	}
	
	public static void 내역(int balance) {
		System.out.println("1. 오늘 //2. 1일전 //3. 2일전 //4. 3일전");
		System.out.println("0. 전체내역");
		System.out.println("돌아가려면 아무 키나 눌러주세요.");
		System.out.print("선택> ...▽");
		Scanner scan = new Scanner(System.in);
		int answer =scan.nextInt();
//		answer = "";
		
		System.out.println("입력한 값 : "+answer);
		int 식비 = -800;
		int 숙박비 = -1500;
		int 수리비 = -10000;
		int 치료비 = -5000;
		int 보상 = +10000;
		int 추가비a = -2000;
		int 추가비b = +2000;
		String[] 선택지 = new String[5];
	
		if (answer == 4)/*3일전을 선택 시*/ {
			System.out.println(" 티르의 날 : 퀘스트 완료 보상 +" +(보상+ 추가비b)+ "G");
			System.out.println(" 티르의 날 : 무기 수리비 " +수리비 + "G");
			System.out.println(" 티르의 날 : 치료비 " +치료비 + "G");
			System.out.println(" 티르의 날 : 식비 " +식비 + "G");
			System.out.println("총액 : "+(balance + 보상 + 수리비 + 치료비 + 식비)+"G");
			balance += 보상 + 수리비 + 치료비 + 식비;
//			balance = balance + 보상 + 수리비 + 치료비 + 식비;
//			System.out.println("balance : "+balance);
			//	이걸 이프가 아니라 상속으로 하면 총액을 볼수있지않을까?
		}else if(answer == 3)/*2일전을 선택 시*/{
			System.out.println(" 오딘의 날 : 숙박비 " + 숙박비 + "G");
			System.out.println(" 오딘의 날 : 식비 " + 식비 + "G");
			System.out.println(" 총액 : "+(balance + 숙박비 + 식비)+"G");
			balance += 숙박비 + 식비;
		}else if(answer == 2)/*1일전을 선택 시*/ {
			System.out.println(" 토르의 날 : 퀘스트 완료 보상 " + 보상 + "G");
			System.out.println(" 토르의 날 : 무기 수리비 " + 수리비 + "G");
			System.out.println(" 토르의 날 : 식비 " + 식비 + "G");
			System.out.println(" 총액 : "+(balance + 보상 + 수리비 + 식비)+"G");
			balance += 보상 + 수리비 + 식비;
		}else if(answer == 1)/*오늘 내역 보기*/{
			System.out.println(" 프레이야의 날 : 무기 수리비 " + 수리비 + "G");
			System.out.println(" 프레이야의 날 : 치료비 " + 치료비 + "G");
			System.out.println(" 프레이야의 날 : 식비 " + 식비 + "G");
			System.out.println(" 총액 : "+(balance + 수리비 + 치료비 + 식비)+"G");
			balance += 수리비 + 치료비 + 식비;
		}else if(answer == 0)/*전체내역보기*/ {
			for (int i = 4; i == 0; --i) {
			}
			System.out.println(" 티르의 날 : 퀘스트 완료 보상 +" +(보상+ 추가비b)+ "G");
			System.out.println(" 티르의 날 : 무기 수리비 " +수리비 + "G");
			System.out.println(" 티르의 날 : 치료비 " +치료비 + "G");
			System.out.println(" 티르의 날 : 식비 " +식비 + "G");
			System.out.println(" 오딘의 날 : 숙박비 " + 숙박비 + "G");
			System.out.println(" 오딘의 날 : 식비 " + 식비 + "G");
			System.out.println(" 토르의 날 : 퀘스트 완료 보상 +" + 보상 + "G");
			System.out.println(" 토르의 날 : 무기 수리비 " + 수리비 + "G");
			System.out.println(" 토르의 날 : 식비 " + 식비 + "G");
			System.out.println(" 프레이야의 날 : 무기 수리비 " + 수리비 + "G");
			System.out.println(" 프레이야의 날 : 치료비 " + 치료비 + "G");
			System.out.println(" 프레이야의 날 : 식비 " + 식비 + "G");
			System.out.println("이번주 총액 : "+(balance + 보상*2 + 수리비*3 + 치료비*2 + 식비*4 + 숙박비)+"G");
			balance += 보상*2 + 수리비*3 + 치료비*2 + 식비*4 + 숙박비;
//			System.out.println("전체내역");
		}else/*돌아가기*/ {
			System.out.println("돌아가기");
		}
		
	}

}// The end of class

class 조회기능{
//	계좌조회 함 해보자
//	고정출금 월급이 들어왔어요~ 월급이 로그아웃했어요~
//	마이너스 통장이라 상환하는 칸도 있어야 함.	
}
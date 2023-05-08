package 복습용.연습용20230308;

public class IF_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (로그인성공()) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}
	
	public static boolean 로그인성공() {
		System.out.println("무조건 로그인 성공");
		return false;
	}
}

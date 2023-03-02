package Java_2023_02_28.예습;

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A 라는 String 데이터를 보내겠습니다.
		ITestServce service = new ITestServce();
		System.out.println(service.dataA("A 데이터 보냅니다."));;
		
	}

}

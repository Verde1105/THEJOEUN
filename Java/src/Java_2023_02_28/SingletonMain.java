package Java_2023_02_28;

public class SingletonMain {

		public static void main(String[] args) {
			//Singleton s = new Singleton(); // 에러 발생
			
			Singleton s1 = Singleton.getInstance(); 		//하나의 객체들임
			Singleton s2 = Singleton.getInstance();	 	 	//하나의 객체들임
			Singleton s3 = Singleton.getInstance();			//하나의 객체들임
			System.out.println(s1 == s2);
// 													계속 똑같은 객체를 생성하는 건 메모리를 불필요하게 잡아먹는 일이라서
// 													생성을 한 번만 하고 그 뒤로는 쭉 리턴만 할 수 있게끔 하자 (생성-리턴-생성-리턴은 비효율적)
			
		}
}

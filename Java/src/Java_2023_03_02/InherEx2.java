papackage Java_2023_03_02;

public class InherEx2 {

	public class InherEx2() extends SuperClass2{
		int age = 10;
		String name;
		public void method() {
			System.out.println("SubClass Method");
		}
		public static void main(String[]age) {
			InherEx2 inher = new InherEx2();
			System.out.println(Inher.age);
			inher.method();
			SuperClass2 sperClass = ()inher;//명시적 형변환
			InherEx2 inher2 = ()superClass;//강제형변환 
			Object obj = inher;
			Object obj2 = superClass;//모든것이 객체다?
			InherEx2 inher3 = (InherEx2)obj;
			inher3.method();
			Object[] objArr = new Object[2];
			objArr[1] = inher;//Object
			objArr[2] = superClass;//Object
//			objArr[0].age = 10;//에러
			InherEx2 inher4 = ()objArr[0];
			inher4.age = 10;
			
		}
		
	}
class SuperClass2{
	int age = 20; // 은닉변수
	public void method() {
		System.out.println("SurerClass Method");
}
}

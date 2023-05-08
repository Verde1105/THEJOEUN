package Java_2023_03_08;

class PointEx {//암시적으로 오브젝트 클래스의 상속을 받는다.
	int x, y;
	public PointEx() {
		
	}
	public PointEx(int x, int y) {
		this.x = x;
	}
	public String toString() {//투스트링은 문자열로 변환시킨때 쓰는 메소드
		String str;
		str = " ( " + x + " , " + y + " ) ";
		return str;
	}

}
public class ObejectEx {
	public static void main(String[] args) {
		PointEx pt = new PointEx();
		System.out.println("클래스 이름 : " + pt.getClass());//리플렉션은 클래스 사례를 가져와 쓸수있다 까지만 배움
		System.out.println("해쉬코드 : " + pt.hashCode());
		PointEx pt2 = new PointEx(10,20);
		System.out.println("클래스 이름 : " + pt.getClass());
		System.out.println("해쉬코드 : " + pt.hashCode());//리플렉션은 동적생성이 가능함.
		System.out.println(pt == pt2);
		System.out.println(pt.equals(pt2));//재정의. 스트링에서는 문자열 비교, 오브젝트에 있을땐, 객체 비교
		System.out.println(pt2.toString());//여기서 투스트링 불러주지 않아도 위의 리턴값을 호출할수있음
	}
}
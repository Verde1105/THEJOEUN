package Java_2023_03_08;
//잦은 문자열 변경을 해야하는 스트링 클래스를 만들때 유용, 내부에서 만들어진건 새 객체를 생성하지 않음
//아이디나 비번, 주소 만들때 이거 사용하면 중복이라던가 없앨수있겠네

public class BufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("환영");//append 는 버퍼 안에 추가한다는 것.
		sb.append("힙니다");
		sb.append("java");
		sb.append("application programming");
		String result = sb.toString();
		System.out.println("결과 : " + result);
		System.out.println("길이 : " + sb.length());
		System.out.println("용량 : " + sb.capacity());
	}
}

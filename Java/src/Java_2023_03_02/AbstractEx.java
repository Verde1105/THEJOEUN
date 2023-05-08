package Java_2023_03_02;
/*
 * 추상 (abstract)
객체의 모호함을 class로 표현하기 위함.
특징
class에 사용시 추상 class의 의미 (ex : abstract class).
일반 메소드와 추상 메소드 사용 가능 함.
객체를 생성 할 수 없음/
상속 관계에서 재정의 함
내부 익명 클래스(무명 anonymous class)로 객체 생성 할 수는 있음.
추상 메소드는 구현하지 않는다.class추상 메소드는 재정의(Override)하여 사용함
상속시 extends keyword를 사용함.

표현)
class AbstractEx {
	int a;
	ex) abstract void setA();
	void setB(){};
}
*/

public abstract class Shape1{
	protected int x, y;
	public abstract double area();
	public abstract double circumference();
	
}

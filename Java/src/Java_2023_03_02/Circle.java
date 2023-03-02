package Java_2023_03_02;

public class Circle extends Shape{
	protected int r;
	public Circle(int r) {
	this.r =r;
}
	@Override
	public double area() {
		return pi*r*r; //수학적 개념을 모델링한것 =클래스
	}
	@Override
	public double circumference() {
		return pi*2*r;
	}
	public int getRedius() {
		return r;
	}
	public void setRedius(int r) {
		this.r = r;
	}
}

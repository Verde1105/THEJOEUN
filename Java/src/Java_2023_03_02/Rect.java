package Java_2023_03_02;

public class Rect extends Shape {

	protected int width, height;

	public Rect() {
		this(0, 0);
	}

	public Rect(int w, int h) {
		width = w;
		height = h;
		x = getwiwidth();
		y = getheight();
	}

	@Override // 에너테이션 > 주석
	public double circumference() {
		return 2 * (width + height);
	}

	@Override
	public double area() {
		return width * height;
	}

	public int getwiwidth() {
		return width;
	}

	public int getheight() {
		return width;
	}

	public void setSize(int w, int h) {
		width = w;
		height = h;
	}

	public int getSize() {
		return x*2 + y*2;
	}
}

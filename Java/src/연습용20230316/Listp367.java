package 연습용20230316;

import java.awt.List;
import java.awt.Shape;
import java.util.ArrayList;

public class Listp367 {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(new Cilcle(3.0));
		li.add(new Rectangle(3,4));
		li.add(new Cilcle(5));
		li.add(new Rectangle(5,6));
		System.out.println("전체 도형의 면적의 합 : " + sumArea(li));
		System.out.println("전체 도형의 면적의 합 : " + sumLength(li));
	}
	
	private static double sumLength(List li) {
		double sumLength = 0;
		for (int i = 0; i <li.size(); i++) {
			Shape s = (Shape)li.get(i);
			sumLength += s.lenght();
		}
		
		return sumLength;
	}
}

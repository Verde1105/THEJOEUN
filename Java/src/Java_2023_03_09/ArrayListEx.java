package Java_2023_03_09;

import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+":" + list.get(i));
			
		}
	}
}
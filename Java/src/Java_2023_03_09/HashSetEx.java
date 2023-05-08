package Java_2023_03_09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		int size = set.size();
		System.out.println("총 객체수 :" + size);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			//type type = (type) en.nextElement();
			
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수 :" + size);
		for (String element : set) {
			System.out.println("\t" + element);
			
		}
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}

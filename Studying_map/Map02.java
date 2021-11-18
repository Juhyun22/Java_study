package Studying_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map02 {

	public static void main(String[] args) {
//		Map 활용하기
		// 1) use iterator 
		Map<String, Character> names1 = new HashMap<>();

		names1.put("유재석", 'X');
		names1.put("박나래", 'X');
		names1.put("이지은", 'X');
		names1.put("서장훈", 'X');
		names1.put("이광수", 'X');

		
		Iterator<String> iter = names1.keySet().iterator();
		while (iter.hasNext()) {
			String name = iter.next(); // key
			if (name.startsWith("이")) {
				names1.put(name, 'O');
			}
		}
		System.out.println(names1);

		// 2) by for
		Map<String, Character> names2 = new HashMap<>();

		names2.put("유재석", 'X');
		names2.put("박나래", 'X');
		names2.put("이지은", 'X');
		names2.put("서장훈", 'X');
		names2.put("이광수", 'X');
		
		Set<String> keySet = names2.keySet();
		List<String> nameList = new ArrayList<>(keySet);
		for (int i = 0; i < names2.size(); i++) {
			String name = nameList.get(i);
			if (name.startsWith("이")) {
				names2.put(name, 'O');
			}
		}
		System.out.println(names2);

	}

}

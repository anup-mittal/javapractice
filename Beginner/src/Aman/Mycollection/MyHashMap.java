package Aman.Mycollection;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m = new HashMap<>();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		System.out.println(m);
		m.put("one", 11);
		m.putIfAbsent("six", 6);
		System.out.println(m);

	}

}

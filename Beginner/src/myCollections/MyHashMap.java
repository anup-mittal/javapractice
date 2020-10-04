package myCollections;

import java.util.*;
import java.util.Map.Entry;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<>();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		
		System.out.println(m);
		
		m.putIfAbsent("six", 6);
		
		System.out.println(m.values());
		
//		Set<Map.Entry<String, Integer>> mSet = m.entrySet();
//		Iterator<Map.Entry<String, Integer>> i = mSet.iterator();
//		while(i.hasNext())
//		{
//			Map.Entry<String, Integer> e = i.next();
//			System.out.println(e.getKey() + "=" + e.getValue());
//		}
		
		for(Map.Entry<String, Integer> e : m.entrySet())
		{
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		m.remove("one", 1);
	}

}

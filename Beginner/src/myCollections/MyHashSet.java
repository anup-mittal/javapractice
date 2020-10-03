package myCollections;

import java.util.*;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> daysOfWeek = new HashSet<>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		System.out.println(daysOfWeek);
//		Iterator<String> myIterator = daysOfWeek.iterator();
//		while(myIterator.hasNext())
//		{
//			System.out.println(myIterator.next());
//		}
		for(String s : daysOfWeek)
		{
			System.out.println(s);
		}
	}

}

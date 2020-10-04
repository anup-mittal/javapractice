package Aman.Mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> daysofweak=new HashSet<>();
		daysofweak.add("monday");
		daysofweak.add("tuesday");
		daysofweak.add("wednesday");
		daysofweak.add("thursday");
		System.out.println(daysofweak);
//		Iterator<String> myiterator = daysofweak.iterator();
//		while(myiterator.hasNext())
//		{
//			System.out.println(myiterator.next());	
//		}
		for(String s: daysofweak)
		{
			System.out.println(s);
		}
		

	}

}

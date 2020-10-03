package myCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class CreateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<>();
		animals.add("tiger");
		animals.add("cat");
		animals.add("lion");
		animals.add("dog");
		System.out.println(animals);
		animals.add(2,"elephant");
		System.out.println(animals);
		System.out.println(animals.get(2));
		System.out.println(animals.indexOf("elephant"));
		Iterator<String> myIterator = animals.iterator();
		while(myIterator.hasNext())
		{
			System.out.println(myIterator.next());
		}
//		animals.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//			
//		});
		
//		sorting using lambda
//		animals.sort((o1,o2) -> o1.compareTo(o2));		
		
//      sorting using comparator in more concise manner
		animals.sort(Comparator.naturalOrder());
		System.out.println(animals);
	}

}

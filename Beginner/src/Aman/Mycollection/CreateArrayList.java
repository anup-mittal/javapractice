package Aman.Mycollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class CreateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals=new ArrayList<>();
		animals.add("cat");
		animals.add("lion");
		animals.add("tiger");
		animals.add("dog");
		System.out.println(animals);
		animals.add(2,"elephant");
		System.out.println(animals);
		System.out.println(animals.get(2));
		System.out.println("--------");
		Iterator<String> myiterator=animals.iterator();
		while (myiterator.hasNext())
		{
			System.out.println(myiterator.next());
		}
//      // using comparator as parameter with inplace implementation
//		animals.sort(new Comparator<String>(){
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});

		// using lambda expression
//		animals.sort((o1,o2) -> o1.compareTo(o2));
		//
//		animals.sort(Comparator.naturalOrder());
		System.out.println("----------");
		System.out.println(animals);
		

	}

}

package thirdHalf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListConcept {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Karthick");
		list.add("Ravics");
		list.add("Surya");
		list.add("Azar");
		list.add("Regi");
		list.add("Regi");
		System.out.println("List Names : ");

		for (String names : list) {
			System.out.println(names);

		}
		System.out.println("---------------------");
		//  list.remove("Regi");
		//for (String names : list) {
		//	System.out.println(names);

		//list.clear();
		//		int size = list.size();
		//		System.out.println("size :"+size);

		System.out.println("size " +list.size());

		boolean empty = list.isEmpty();
		System.out.println("empty :"+empty);

		boolean contains = list.contains("Surya");
		System.out.println("contains surya : "+contains);

		Collections.sort(list);
		System.out.println(" After collections sort : ");
		for (String string : list) {
			System.out.println(string);
		}
		String string = list.get(0);
		System.out.println(string);

	}
}

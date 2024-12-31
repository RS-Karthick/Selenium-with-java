package thirdHalf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
public static void main(String[] args) {
	Set<String> set = new TreeSet<String>();
	
	set.add("Karthick");
	set.add("surya");
	set.add("Azar");
	set.add("Regi");
	set.add("Regi");  // nnot allow duplicate
	
	System.out.println("TreeSet order");
	for (String setNames : set) {
		System.out.println(setNames);
	}
//	set.clear();
//	for (String setNames : set) {
//		System.out.println(setNames);
//	}
//	boolean remove = set.remove("Karthick");
//	System.out.println(remove);
	int size = set.size();
	System.out.println("size : "+size);
	
	List<String> set2 = new ArrayList<String>(set);
	String string = set2.get(0);
	System.out.println("0 " + string);
	
}
}

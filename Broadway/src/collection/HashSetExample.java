package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String args[]) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);

		// Create a HashSet
		HashSet<String> haset = new HashSet<String>();

		// add elements to HashSet
		haset.add("Element1");
		haset.add("Element2");
		haset.add("Element3");
		haset.add("Element4");
		haset.add("Element5");

		// Display HashSet elements
		System.out.println("Before: HashSet contains: " + haset);

		Iterator<String> it = haset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * public void clear(): It removes all the elements from HashSet. The set
		 * becomes empty after this method gets called.
		 */
		haset.clear();

		// Display HashSet content again
		System.out.println("After: HashSet contains: " + haset);
	}
}
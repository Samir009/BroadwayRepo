package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaExample {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Java");

		Collections.sort(fruits);

		// create an ArrayList object
		ArrayList<String> arrayList = new ArrayList<String>();

		// Add elements to ArrayList
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Java");
		arrayList.add("DotNet");
		arrayList.add("Perl");

		System.out.println("Contains python: " + arrayList.contains("C"));

		ArrayList<String> aList = new ArrayList<String>();

		for (String string : fruits) {
			aList.add(arrayList.contains(string) ? "Yes" : "No");
//			System.out.println(aList);
		}

		System.out.println(aList);

		/* Array Declaration and initialization */
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("New City2");
		citylist.add("New City3");

		/* Final ArrayList content display using for */
		for (String str : citylist) {
			System.out.println(str);
		}

	}
}
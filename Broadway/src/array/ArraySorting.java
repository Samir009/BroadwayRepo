package array;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int data[] = { 12, 32, 45, 45, 34, 34, 23, 45, 65, 33, 33, 9 };

		Arrays.sort(data);

		for (int x : data) {
			System.out.println(x);
		}

		System.out.println("............reverse order..............");
		for (int i = data.length - 1; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}
}

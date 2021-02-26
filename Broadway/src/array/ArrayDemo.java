package array;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] subjects = { "english", "math", "nepali", "science", "social", "computer", "health" };
		float[] marks = new float[7];
		float total = 0;
		float avg = 0;

		Scanner in = new Scanner(System.in);

		// write
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter marks of: " + subjects[i]);
			marks[i] = in.nextFloat();
		}

		// read
		for (float x : marks) {
			System.out.println(x);
			total += x;
		}

		System.out.println("Total marks: " + total);

		avg = (total / 7);
		System.out.println("average marks is: " + avg);
	}
}

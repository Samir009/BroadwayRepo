package oop;

import java.util.Scanner;

public class ScannerDemo {

	// Scanner is a class, located inside java.util package

	// Scanner is used to take input from user in console

	public static void main(String[] args) {

		int t;
		double p, r;

		double si;

		Scanner in = new Scanner(System.in);
		System.out.println("Principle amount:");
		p = in.nextDouble();
		System.out.println("Enter rate:");
		r = in.nextDouble();
		System.out.println("Enter time:");
		t = in.nextInt();

		si = (p * t * r) / 100;

		System.out.println("Simple interest: " + si);

	}
}

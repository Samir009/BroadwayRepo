package select_condition;

import java.util.Scanner;

public class VoteDemo {
	public static void main(String[] args) {
		String citizen;
		int age;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your nationality:");

		citizen = in.next();

		if (citizen.equalsIgnoreCase("Nepali")) {

			System.out.println("Enter your age");
			age = in.nextInt();

			if (age >= 18) {
				System.out.println("Eligible for vote");
			} else {
				System.out.println("Not eligible for vote");
			}
		} else {
			System.out.println("You are not authorize to vote");
		}

	}
}

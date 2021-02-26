package oop;

public class VotingSystem {
	public static void main(String[] args) {
		int age = 19; // lets assume age = 19
		boolean isCitizen = true; // lets assume he/she has citizenship
		boolean hasVotingCard = true; // lets assume he/she has voting card.

		boolean hasFather = true; // lets assume he/she has father
		boolean hasMother = true; // lets assume he/she has mother

		if (!(age > 18)) {
			System.out.println("You are not eligible for voting");
		}

		if (hasMother || hasFather) {
			System.out.println("you can apply for voting card type: Descendant");
		}

		if (age > 18 && isCitizen && hasVotingCard) {
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voting");
		}
	}
}

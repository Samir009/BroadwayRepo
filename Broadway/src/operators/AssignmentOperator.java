package operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a = 11;
		System.out.println("vaule of a:" + a);

//		a = a + 2;
		a += 2;
		System.out.println("vaule of a:" + a);

		a -= 2;
		System.out.println("vaule of a:" + a);

		a *= 2;
		System.out.println("vaule of a:" + a);

		a /= 2;
		System.out.println("vaule of a:" + a);

		a %= 2;
		System.out.println("vaule of a:" + a);

	}
}

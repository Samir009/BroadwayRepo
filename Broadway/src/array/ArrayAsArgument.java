package array;

public class ArrayAsArgument {
	public static void main(String[] args) {

		int num[] = { 2, 4, 5, 6, 7, 1 };

//		ArrayAsArgument a = new ArrayAsArgument();
//		a.findSmallestValue(num);

		findSmallestValue(num);
	}

	static void findSmallestValue(int nums[]) {
		int sv = nums[0];

		for (int x : nums) {
			if (sv > x) {
				sv = x;
			}
		}

		System.out.println("Smallest value: " + sv);
	}
}

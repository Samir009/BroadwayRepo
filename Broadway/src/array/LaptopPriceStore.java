package array;

import java.util.Scanner;

public class LaptopPriceStore {
	public static void main(String[] args) {
		String laptopName[] = { "HP", "Dell", "Apple", "Lenovo", "Samsung", "CG", "Acer" };
		float price[] = new float[7];
		float total = 0;
		float avg = 0;
		float highestPrice = 0;

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < laptopName.length; i++) {
			System.out.println("Enter price of " + laptopName[i]);
			price[i] = in.nextFloat();
		}

//		int index = 0;
		for (float p : price) {
			total += p;
			if (p > highestPrice) {
				highestPrice = p;
			}

//			if (index >= price.length) {
//				break;
//			}
//			index++;

		}

		System.out.println("Total cost of all laptops: " + total);

		avg = total / 7;

		System.out.println("Average cost of laptop is: " + avg);

		System.out.println("Highest price is: " + highestPrice + " of ");

	}
}

package string;

import java.io.UnsupportedEncodingException;

public class StringDemo {
	public static void main(String[] args) {
/////////////////////// converts string to ASCII
/////////////////////// value/////////////////////////////////

		char a = 'n';
		int i = a; // converts character into ASCII
		System.out.println(a);
		System.out.println(i);

		String name = "name"; // we can convert strings into bytes
		try {
			byte[] bytes = name.getBytes("US-ASCII");
			for (byte b : bytes) {
				System.out.print(b);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		for (char c : name.toCharArray()) { // we can easily convert strings to char
			System.out.print(c);
		}
	}
}

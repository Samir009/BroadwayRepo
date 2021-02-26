package java_IO_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CharRead {
	public static void main(String args[]) throws IOException {
		String text;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		text = br.readLine(); // Reading String
		System.out.println(text);
	}
}

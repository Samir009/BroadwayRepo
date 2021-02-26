package fIieHandling;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws IOException {
		java.io.FileReader reader = new java.io.FileReader("e://employee.txt");

		BufferedReader br = new BufferedReader(reader);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}

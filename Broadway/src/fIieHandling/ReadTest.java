package fIieHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("e://hello.txt");
		int data;
		while ((data = input.read()) != -1) {
			System.out.print((char) data);
		}
	}
}

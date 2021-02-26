package fIieHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileTest {

	/*
	 * ==== general file read/write========= a) FileOutputStream : write = b)
	 * FileInputStream: read =
	 */

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("e://hello.txt");
		file.write("Good morning all ".getBytes());
		file.close();
	}
}

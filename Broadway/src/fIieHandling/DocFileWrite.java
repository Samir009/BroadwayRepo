package fIieHandling;

import java.io.FileWriter;
import java.io.IOException;

public class DocFileWrite {
	/*
	 * a) FileWriter :write b) FileReader : read
	 */
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("e://employee.txt", true);
		file.write("Id = 2 ");
		file.write(System.lineSeparator());
		file.write("Name = sumitra ");
		file.write(System.lineSeparator());
		file.write("Address = Janakpur ");
		file.write(System.lineSeparator());
		file.write("Contact = 98772809 ");
		file.write(System.lineSeparator());

		file.close();
		System.out.println("File created");
	}
}

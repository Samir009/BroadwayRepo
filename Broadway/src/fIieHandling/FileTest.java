package fIieHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("e://employee.txt");

		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		File dir = new File("e://files9am");
		dir.mkdir();

		// list file name from folders
		String[] fileNameList = dir.list();
		for (String fn : fileNameList) {
			System.out.println(fn);
		}

		// get all files from folder
		File[] fileList = dir.listFiles();
		for (File f : fileList) {
			System.out.println(f.getAbsolutePath());
			// read individual files
			java.io.FileReader reader = new java.io.FileReader(f.getAbsolutePath());

			BufferedReader br = new BufferedReader(reader);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			System.out.println("==================== read file end ===================");
		}

	}
}

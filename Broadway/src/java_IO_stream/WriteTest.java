package java_IO_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriteTest {
	public static void main(String[] args) {
		try {
			File fl = new File("d:/myfile.txt");
			String str = "Write this string to my file";
			FileWriter fw = new FileWriter(fl);
			fw.write(str);
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
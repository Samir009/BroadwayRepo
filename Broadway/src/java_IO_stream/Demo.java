package java_IO_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Demo {
	public static void main(String[] args) {

		// Serialization

//		try {
//			Studentinfo si = new Studentinfo("Abhi", 104, "110044");
//			FileOutputStream fos = new FileOutputStream("d:/student.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(si);
//			oos.flush();
//			oos.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		// Deserialization
		Studentinfo si = null;
		try {
			FileInputStream fis = new FileInputStream("d:/student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (Studentinfo) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(si.contact);
	}
}
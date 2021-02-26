package java_IO_stream;

import java.io.Serializable;

class Studentinfo implements Serializable {
	String name;
	int rid;
	static String contact; // static field does not get serialized

	Studentinfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
}
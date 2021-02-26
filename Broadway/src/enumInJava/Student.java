package enumInJava;

public enum Student {
	John(11), Bella(10), Sam(13), Viraaj(9);

	private int age; // variable defined in enum Student

	int getage() { // method defined in enum Student
		return age;
	}

	private Student(int age) // constructor defined in enum Student
	{
		this.age = age;
	}
}

package inheritance;

public class Programmer extends Employee {
	String programmingLang;
	String project;
	int bonus;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.id = 1;
		p.name = "John";
		p.company = "F1 Soft";
		p.salary = 120000;
		p.phone = "9877877767";
		p.programmingLang = "Java";
		p.project = "E-commerce";
		p.bonus = 20000;

		System.out.println("Id : " + p.id);
		System.out.println("Name : " + p.name);
		System.out.println("Company : " + p.company);
		System.out.println("Salary : " + p.salary);
		System.out.println("Phone : " + p.phone);
		System.out.println("Programming Language : " + p.programmingLang);
		System.out.println("Project : " + p.project);
		System.out.println("Bonus : " + p.bonus);
	}
}

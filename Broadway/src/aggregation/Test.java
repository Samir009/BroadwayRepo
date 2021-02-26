package aggregation;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		car.setCc(500);
		car.setColor("black");
		car.setCompany("Ford");
		car.setModel("mustang");
		car.setPrice(500000);

		Employee employee = new Employee();
		employee.setId(1);
		employee.setCompany("Apple");
		employee.setJob("Software engineer");
		employee.setName("Samir shrestha");
		employee.setSalary(500000);
		employee.setCar(car);

		System.out.println(employee);
	}
}

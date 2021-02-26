package inheritance;

public class Car extends Vehicle {
	private int cc;
	private int gears;

	public void attributeCar() {
		System.out.println("Speed of car : " + super.speed);

		System.out.println("Size of car : " + size);

		System.out.println("CC of car : " + cc);

		System.out.println("No of gears of car : " + gears);

		super.attributes(); // we can use Super in any non static method.

	}

	public static void main(String[] args) {
		Car c1 = new Car();

		// c1.colors = "Blue"; // Error : private field : color

		c1.speed = 200;
		c1.size = 22;
		c1.cc = 1000;
		c1.gears = 5;

		c1.attributes();

//		super.attributes(); // Error: cannot use super in a static content

		c1.attributeCar();
	}
}

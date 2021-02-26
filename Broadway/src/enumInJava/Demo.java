package enumInJava;

public class Demo {
	public static void main(String[] args) {
		WeekDays w = WeekDays.MONDAY;
		System.out.println("Today is : " + w);

		// we can use it in if else condition

		if (w == WeekDays.SUNDAY || w == WeekDays.SATURDAY) {
			System.out.println("This is Weekend");
		} else {
			System.out.println("This is weekday: " + w);
		}

		System.out.println();

		// Restaurants
		// we can use it in switch case

		Restaurants r;
		r = Restaurants.pizzahut;

		switch (r) {
		case dominos:
			System.out.println("I am " + Restaurants.dominos);
			break;
		case pizzahut:
			System.out.println("I am " + Restaurants.pizzahut);
			break;
		case kfc:
			System.out.println("I am " + Restaurants.kfc);
			break;
		case burgerking:
			System.out.println("I am " + Restaurants.burgerking);
			break;
		case paninos:
			System.out.println("I am " + Restaurants.paninos);
			break;
		default:
			System.out.println("Please choose right option");
		}

		System.out.println();

		// traversing enumeration element
		System.out.println("Traversing weekdays ");
		WeekDays[] weekDays = WeekDays.values();
		for (WeekDays weekDay : weekDays) {
			System.out.println(weekDay);
		}

		System.out.println();

		System.out.println("Constructor, instance and variable in enum");

		System.out.println("Age of john is : " + Student.John.getage() + " years");

	}
}

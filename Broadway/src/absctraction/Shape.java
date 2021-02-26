package absctraction;

public abstract class Shape { // abstract method should have one abstract method and non-abstract method,
								// we can use only abstract method but it is conceptually wrong.
								// child class must implement the abstract class if methods are defined
	String color;

	// these are abstract method
	abstract double area();

	@Override
	public abstract String toString();

	// abstract class can have constructor;
	public Shape(String color) {
		System.out.println("Constructor shape called");
		this.color = color;
	}

	// this is concrete method
	public String getColor() {
		return color;
	}
}

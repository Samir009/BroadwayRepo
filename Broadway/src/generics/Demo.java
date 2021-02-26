package generics;

public class Demo {
	public static void main(String[] args) {
		Gen<Integer> gen = new Gen<>(100);

		int x = gen.getObj();
		System.out.println("Value of x: " + x);

		Gen<String> gen1 = new Gen<>("Hello, I am generic class");
		System.out.println(gen1.getObj());

	}
}

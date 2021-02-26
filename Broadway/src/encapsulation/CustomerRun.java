package encapsulation;

public class CustomerRun {
	public static void main(String[] args) {
		Customer c = new Customer();

		c.setId(12);
		c.setAddress("Kuleswar");
		c.setAge(12);
		c.setPhone("985554335");
		c.setName("Samir");

		System.out.println(c.toString());

	}
}

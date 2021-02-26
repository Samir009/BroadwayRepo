package constructor;

public class User {
	String userName;
	String password;

	User() {
		userName = "hello i am username";
		password = "Hello I am password";
	}

	void printUserInfo() {
		System.out.println("userName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void main(String[] args) {
		User user = new User();
		user.password = "I am password";
		user.userName = "I am userName";

		user.printUserInfo();
	}
}

package thread;

public class SynchronizationTest {
	public static void main(String[] args) {
		FacebookLike riverPage = new FacebookLike(800);

		Thread user1 = new Thread() {
			@Override
			public void run() {
				riverPage.doLike();
			}
		};

		Thread user2 = new Thread() {
			@Override
			public void run() {
				riverPage.doLike();
			}
		};

		Thread user3 = new Thread() {
			@Override
			public void run() {
				riverPage.doLike();
			}
		};

		Thread user4 = new Thread() {
			@Override
			public void run() {
				riverPage.doLike();
			}
		};

		Thread user5 = new Thread() {
			@Override
			public void run() {
				riverPage.doLike();
			}
		};

		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();

	}
}

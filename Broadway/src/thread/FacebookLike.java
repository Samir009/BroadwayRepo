package thread;

public class FacebookLike {
	private int like;

	public FacebookLike(int like) {
		this.like = like;
	}

	public synchronized void doLike() {
		like++;
		System.out.println("Total like : " + like);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

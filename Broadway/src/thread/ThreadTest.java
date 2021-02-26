package thread;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println("hello from new thread");
	}

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();

		System.out.println("From main thread");
	}
}

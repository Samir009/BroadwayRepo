package thread;

public class ThreadSleepTest extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadSleepTest t = new ThreadSleepTest();
		ThreadSleepTest t1 = new ThreadSleepTest();
		ThreadSleepTest t2 = new ThreadSleepTest();

		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();
	}

}

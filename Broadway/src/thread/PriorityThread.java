package thread;

public class PriorityThread extends Thread {
	@Override
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println("Main thread");

		PriorityThread p3 = new PriorityThread();
		PriorityThread p1 = new PriorityThread();
		PriorityThread p2 = new PriorityThread();

		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(MAX_PRIORITY);
		p3.setPriority(NORM_PRIORITY);

		p1.start();
		p2.start();
		p3.start();
	}
}

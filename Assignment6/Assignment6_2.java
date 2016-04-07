package Assignment6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Assignment6_2 {

	private static char currentThread = 'A';
	private final Object t = new Object();

	public static void main(String[] args) {

		Assignment6_2 test = new Assignment6_2();
		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(test.new RunnableA());
		service.execute(test.new RunnableB());

		service.shutdown();
	}

	private class RunnableA implements Runnable {
		public void run() {
			for (int i = 1; i <= 52; i++) {
				synchronized (t) {
					if (currentThread != 'A') {
						try {
							t.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.print(i);
					if (i % 2 == 0) {
						currentThread = 'B';
						t.notifyAll();
					}
				}
			}
		}
	}

	private class RunnableB implements Runnable {
		public void run() {
			for (char c = 'A'; c <= 'Z'; c++) {
				synchronized (t) {
					if (currentThread != 'B') {
						try {
							t.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.print(c);
					currentThread = 'A';
					t.notifyAll();
				}
			}
		}
	}

}

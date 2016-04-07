package Assignment6;

public class Assignment6_1 {

	private Object lock = new Object();

	public void printAlphabets() {

		synchronized (lock) {
			Thread at = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.print("A");
				}
			});
			at.start();
		}

		synchronized (lock) {
			Thread bt = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.print("B");
				}
			});
			bt.start();
		}

		synchronized (lock) {
			Thread ct = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.print("C");
				}

			});
			ct.start();
		}

		synchronized (lock) {
			Thread dt = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.print("D");
				}

			});
			dt.start();
		}
		synchronized (lock) {
			Thread et = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.print("E");
				}
			});
			et.start();
		}

	}
}

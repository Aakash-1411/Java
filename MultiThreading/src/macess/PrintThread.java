package macess;

public class PrintThread {
	synchronized void thread1() throws Exception {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Thread(1) : " + i);
			Thread.sleep(1000);
		}
	}

	synchronized void thread2() throws Exception {
		for (int i = 1; i <= 10; i++) {

			System.out.println("Thread(2) : " + i);
			Thread.sleep(1000);
		}

	}
}

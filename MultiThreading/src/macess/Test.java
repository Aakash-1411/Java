package macess;

public class Test {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			try {
				
				new PrintThread().thread1();
			} catch (Exception e) {
			e.printStackTrace();
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {

			try {
				new PrintThread().thread2();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		Thread t2 = new Thread(r2);
		t2.start();
	}

}

package java8.runn;

public class TestThreads {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello");

			}
		};

		Runnable r1 = () -> System.out.println("Hello World From Lambdas");

		Thread t = new Thread(r);
		t.start();
		Thread t1 = new Thread(r1);
		t1.start();

	}

}

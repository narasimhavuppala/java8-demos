import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.sleep(10000);
		return 1;
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<Integer> f = exec.submit(new CallableDemo());

		System.out.println(f.isDone()); // False

		System.out.println(f.get()); // Waits until the task is done, then
										// prints 1
	}
}
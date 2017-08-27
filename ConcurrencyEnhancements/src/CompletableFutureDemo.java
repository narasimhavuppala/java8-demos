import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureDemo implements Supplier<Integer> {
	//Spring 4.x
	//Hibermate 5.x
	//Spring Boot
	//Spring data JPA
	//Spring Rest
	//Pivotal Cloud Foundry :(AWS/Azure/Google Cloud)
    //NOSql DB
	@Override
	public Integer get() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		return 1;
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new CompletableFutureDemo(), exec);
		
		
		if (!f.isDone()) {
			f.complete(0);
		}
	//	CompletableFuture<Integer> test = f.supplyAsync(() -> Integer.MAX_VALUE);
		
		System.out.println(f.get());
		exec.shutdown();
	}
}

class PlusOne implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer x) {
		return x + 1;
	}

}
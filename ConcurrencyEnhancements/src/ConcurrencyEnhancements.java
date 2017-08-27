import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyEnhancements {

	public static void main(String[] args) throws InterruptedException {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newWorkStealingPool(availableProcessors);

		List<Callable<String>> tasks = Arrays.asList(() -> "My Task1", () -> "My Task2", () -> "My Task3",
				() -> "My Task4");

		executorService.invokeAll(tasks).stream().map(future -> {
			try {
				return future.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
		calculateAsync();
	}

	public static Future<String> calculateAsync() throws InterruptedException {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();

		Executors.newCachedThreadPool().submit(() -> {
			Thread.sleep(500);
			completableFuture.complete("Hello");
			return null;
		});

		return completableFuture;
	}

}

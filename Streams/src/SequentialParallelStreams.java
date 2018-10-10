import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class SequentialParallelStreams {

	public static void main(String[] args) {

		Collection<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			numbers.add(i);
		}
		Stream<Integer> numberStreaam = numbers.stream();
		System.out.println(numberStreaam.isParallel());
		
		Stream<Integer> parallelStream = numbers.parallelStream();
		System.out.println(parallelStream.isParallel());

		parallelStream.sequential().parallel().sequential();
		System.out.println(parallelStream.isParallel());

		parallelStream.sequential().parallel().sequential().parallel();
		System.out.println(parallelStream.isParallel());
		
		//Takeaway-1 : parallel is a flag....last write wins.
		//Takeaway-2: A Stream is Parallel or sequwntial but can not be both
	}

}

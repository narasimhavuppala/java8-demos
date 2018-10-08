package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Testing the order of execution.
 */
public class Streams5OrderOfExecution {

	public static void main(String[] args) {
		List<String> stringCollection = Arrays.asList("d2", "a2","a3", "b1", "b3", "c");

		//Consumer<String> c = System.out::println;
		stringCollection.stream()
		.filter(s -> s.toLowerCase().startsWith("a"))
		.peek(System.out::println)
		.sorted((s1, s2) -> s1.compareTo(s2))
		.map(s->s.toUpperCase())
		.peek(System.out::println)
		.forEach(s -> System.out.println("forEach: " + s));

	}
}
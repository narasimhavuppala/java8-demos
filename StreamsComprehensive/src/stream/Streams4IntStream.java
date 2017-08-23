package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Streams4IntStream {

	public static void main(String[] args) {

		// IntStream.range(0, 10).filter(i -> i % 2 ==
		// 0).forEach(System.out::println);

		OptionalInt reduced1 = IntStream.range(0, 8).reduce((a, b) -> a + b);
		System.out.println(reduced1.getAsInt());

		int reduced2 = IntStream.range(0, 8).reduce(6, (a, b) -> a + b);
		System.out.println(reduced2);

		
	}
}

package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {

		OptionalInt reduced1 = IntStream
				.range(0, 8)
				.peek(System.out::println)
				.reduce((a, b) -> a + b);
		System.out.println("sum=" + reduced1.getAsInt());

		int reduced2 = IntStream
				.range(0, 8)
				.peek(System.out::println)
				.reduce(6, (a, b) -> a + b);
		System.out.println(reduced2);

	}
}

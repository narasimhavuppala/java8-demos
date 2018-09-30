package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams7FlatMap {

	public static void main(String[] args) {
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		// Stream<String>, GOOD!
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

		//Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

		stringStream.forEach(System.out::println);
	}

}
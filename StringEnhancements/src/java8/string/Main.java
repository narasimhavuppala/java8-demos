package java8.string;

import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// Streams Support
		String s = "Test Java8";
		IntStream intStream = s.chars();
		// intStream.forEach(System.out::println);

		// String Joiners
		String.join(":", "foobar", "foo", "bar");

		// String Joiner
		// StringJoiner sj=new StringJoiner("");
		StringJoiner sj = new StringJoiner(",", "{", "}");
		String finalString = sj.add("one").add("two").add("Three").toString();
		System.out.println(finalString);

	}

}

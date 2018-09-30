import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {

		Stream<String> alphabetStream = Stream.of("a", "b", "b");

		Collection<String> objCollection = new ArrayList<>();
		Stream<String> objCollectionStream = objCollection.stream();

		int[] ids = { 1, 2, 3 };
		IntStream idStream = Arrays.stream(ids);

		String str = "a,b,c,d,e,f";
		IntStream stream = str.chars();
		String[] chars = str.split(",");
		Stream<String> charsStream = Stream.of(chars);

	}

}

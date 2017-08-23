package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams1 {

	public static void main(String[] args) {

		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		Stream<String> strStrings = stringCollection.stream();
		Stream<String> mapStr = strStrings.map((x) -> {
			return x.substring(2);
		}).skip(2).limit(2);
		
		mapStr.forEach(System.out::println);
		
		
	//	mapStr.forEach(System.out::println);
		System.out.println("*********End**************8");

		// filtering

	

	}

}

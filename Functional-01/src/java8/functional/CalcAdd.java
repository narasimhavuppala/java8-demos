package java8.functional;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.DoubleFunction;

public class CalcAdd {

	public static void main(String[] args) {
		// Defining add methods
		Function<Integer, Integer> add = (x) -> x + 1;
		System.out.println(add.apply(2));

		Function<String, String> concat = (x) -> x + 1;
		System.out.println(concat.apply("Test-"));

		// Calculator
		Function<Integer, Function<Integer, Integer>> calcAdd = x -> y -> x + y;

		// Bi Function Usage
		BiFunction<Integer, Integer, Integer> Biadd = (x, y) -> {
			Integer u = x + y;
			return u;
		};
		System.out.println(Biadd.apply(1, 2));

		// Double Function
		DoubleFunction<String> df = (x) -> x + " Conerting double to String";
		System.out.println(df.apply(5));

	}

}

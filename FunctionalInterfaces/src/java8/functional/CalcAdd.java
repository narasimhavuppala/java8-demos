package java8.functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CalcAdd {

	public static void main(String[] args) {

		// SOLID : I stands for Interface Segregation
		// Defining add methods
		// Why Should we learn functional interfaces
		// Any relation with Lambdas
		Function<Integer, String> add = (x) -> x + "one";
		System.out.println(add.apply(2));
		add = (x) -> {
			return x + "one";
		};

		/****************** Sepcial Funtions ****************************/
		// Supplier: Fetch config details
		Supplier<Integer> numberGenerator = () -> 5;
		System.out.println(numberGenerator.get());

		// Consumer: Logging ,Sending to database
		Consumer<String> printToConsole = x -> System.out.println(x);

		printToConsole.accept("hello");

		// Test the boolean condition
		Predicate<Boolean> isValid = (x) -> !x;
		System.out.println(isValid.test(false));
		// isValid.and(isValid).and(isValid).and(isValid)

		// Bi Function Usage
		BiFunction<Integer, String, Double> Biadd = (x, y) -> {
			System.out.println(String.format("x=%s and y=%s", x, y));
			return 0.5;
		};

		Biadd.apply(4, "test");

		// Unary Operator

		UnaryOperator<String> upperCase = x -> x.toUpperCase();
		System.out.println(upperCase.apply("test"));

		BinaryOperator<Integer> biadd = (x, y) -> (x + y);
		System.out.println(biadd.apply(2, 5));

		// Double Function
		
		DoubleFunction<String> df = (x) -> x + " Converting double to String";
		System.out.println(df.apply(5));
		
		
		Calculator<Float> calclate= (x,y)-> 0.5f;
		System.out.println(calclate.calculate(2f, 3f));

	}

}

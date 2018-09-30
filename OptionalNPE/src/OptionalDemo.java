
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> name = getName();

		Optional<String> legacyName = Optional.ofNullable(getlegacyName());

		String ln = Optional.ofNullable(getlegacyName()).orElse("test");

		System.out.println(ln);
		if (legacyName.isPresent()) {
			System.out.println(legacyName.get());
		}
	}

	static Optional<String> getName() {
		int x = 5;
		if (x % 2 == 0) {
			return Optional.of("hello");
		}
		return Optional.empty();

	}

	static String getlegacyName() {
		int x = 4;
		if (x % 2 == 0) {
			return "hello";
		}
		return null;
	}
}

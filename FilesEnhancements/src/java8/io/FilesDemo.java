package java8.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilesDemo {

	static String file = "F:\\Training by Course\\Java 8\\practise code demos\\java8-demos\\FilesEnhancements\\src\\java8\\io\\test.txt";
	static String directory = "F:\\Training by Course\\Java 8\\practise code demos\\java8-demos\\FilesEnhancements\\src\\java8\\io";

	public static void main(String[] args) throws IOException {
		// File Operations
		Path filepath = Paths.get(file);

		try (Stream<String> fileStream = Files.lines(filepath)) {
			System.out.println(fileStream
					.filter(line -> line.length() > 5)
					.count()
					);

		}
		List<String> lines = new ArrayList<>();// Files.readAllLines(filepath);
		lines.add("Test It");
		Files.write(Paths.get(
				"F:\\Training by Course\\Java 8\\practise code demos\\java8-demos\\FilesEnhancements\\src\\java8\\io\\test2.txt"),
				lines);
		// Lab Assignments
		// Files.delete(filepath);
		// Files.deleteIfExists(arg)
		// Files.move

		// Directory Operations
		Path directoryPath = Paths.get(directory);

		Stream<Path> directorysStream = Files.walk(directoryPath, 3);
		directorysStream.map(s -> String.valueOf(s)).filter(s -> s.endsWith(".java")).forEach(System.out::println);
		int maxDepth = 3;

		System.out.println("******Started Finding**************");
		Stream findStream = Files.find(directoryPath, maxDepth, (s, y) -> y.isDirectory());
		findStream.forEach(System.out::println);

	}

}

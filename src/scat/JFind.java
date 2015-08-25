package scat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JFind {
    public static void main(String[] args) throws IOException {
        find(args[0]);
    }

    public static String find(String name) throws IOException {
        Path here = Paths.get("");
        int maxDepth = 5;

        System.out.println("search for: " + name);
        System.out.println("here: " + here.toAbsolutePath());

        try (Stream<Path> stream = Files.find(here, maxDepth,
                (path, attr) -> String.valueOf(path).contains(name))) {
            String joined = stream
                    .sorted()
                    .map(String::valueOf)
                    .collect(Collectors.joining("; "));

            System.out.println("Found: " + joined);

            return joined;
        }
    }
}

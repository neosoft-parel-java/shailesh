package java8Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IterateDirectory {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("=============Files.list()===============");
            Files.list(Paths.get(".")).forEach(System.out::println);

            System.out.println("=============newDirectoryStream=================");
            Files.newDirectoryStream(Paths.get("."))
                    .forEach(System.out::println);

            System.out.println("===============endsWith method===================");
            Files.newDirectoryStream(Paths.get("."),
                    path -> path.toString().endsWith(".xml"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

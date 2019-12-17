package java8Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


/*
* using stream api we can iterate through lines and filter the file content based on some conditions.
*/
public class FileOperations {
    public static void main(String[] args) {
        Path filePath = Paths.get(".", "Java8features");
        try (Stream<String> lines = Files.lines( filePath ))
        {
            //Read File
            lines.forEach(System.out::println);

            //write to file
            String content = "Hello World !!";
            Files.write(Paths.get("./output.txt"), content.getBytes());

            //WatchService
            /*
              It is used to watch a directory along with all sub-directories and files inside it.
              Any Changes in the given file are noted.
             */
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class FileWorks {

    public static void main(String[] args) {

        readFile("testFile.txt");
        System.out.println("*********");
        loadFile("test2.txt");

    }


//  static void readFile(String willRead) throws IOException {
    static void readFile(String willRead) {
        Path aFile = FileSystems.getDefault().getPath("", willRead);
        try {
            List<String> lines = Files.readAllLines(aFile);
            //ALTERNATIVE 1 TO READ
            lines.forEach(str -> System.out.println(str));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

// ALTERNATIVE 2 TO READ
//        for (int i = 0; i < lines.size(); i++) {
//            var content = lines.get(i);
//            System.out.println("testFile.txt content : "+content);
//        }

//ALTERNATIVE 3 TO READ
//  works in java 11????
//        lines.forEach(str-> System.out::println);

    }


    static void loadFile(String fileName) {

        var file = new File(fileName);
        System.out.println("file exists: " + file.exists());

        try (var reader = new FileReader(file); var buffer = new BufferedReader(reader)) {
            var oneLine = buffer.readLine();
            var allLines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());

            System.out.println("buffer reads oneLine: " + oneLine);
            System.out.println("ListString reads all: " + allLines);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

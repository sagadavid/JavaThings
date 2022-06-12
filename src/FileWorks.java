import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class FileWorks {
    public static void main(String[] args) throws IOException {
        Path aFile = FileSystems.getDefault().getPath("", "testFile.txt");
        List<String> lines = Files.readAllLines(aFile);
        for (int i = 0; i < lines.size(); i++) {
            var content = lines.get(i);
            System.out.println("testFile.txt content : "+content);
        }


//if try-cath is not used, throws ioexception is added to capsulating mehtod!!!
//        try {List<String> lines = Files.readAllLines(file);}
//        catch (IOException e) {throw new RuntimeException(e);}

        // EXAMPLE 4
// - read a line vs
//        - read all lines

        var pathname = "testFile.txt";
        var file = new File(pathname);
        System.out.println("file exists: " + file.exists());

//invoke in try () will make you sure file is
// closed after reading. no memory leaks.
//or else finally and closing needed.
        try (var reader = new FileReader(file); var buffer = new BufferedReader(reader)) {
            var oneLine = buffer.readLine();
            var allLines = Files.readAllLines(Paths.get("fromJShell.java"), Charset.defaultCharset());

            System.out.println("buffer reads oneLine: " + oneLine);
            System.out.println("ListString reads all: " + allLines);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
    }
}

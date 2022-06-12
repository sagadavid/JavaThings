import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionMultipleCatch
{

    public static void main(String[] args)
    {
        /*
//EXAMPLE 1 - MULTI CATCH INVOKE IN A LINE

// there is a hierarchy of exceptions in the catch block,
// We know that all the exception classes are subclasses of the Exception class.
// So, instead of catching multiple specialized exceptions,
// we can simply catch the Exception class.

        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e)
//                      //Alternative java.lang.ArithmeticException
//                          is a subclass of alternative java.lang.Exception
//            {
            System.out.println(e.getMessage());
        }
//EXAMPLE 2 - MONO CATCH
        String sN = null;
        try {
            var sub = sN.substring(0, 3);
        }
        catch (Exception e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();//print all you know about it
            System.out.println(e.getMessage());
        }
        System.out.println("app didnt crash" +
                           " you are on the next line" +
                           " just after exception message");

// EXAMPLE 3 - MULTIPLE CATCH
//        FROM DAVID GASSNER
        String s = "";
        try {
            var sub = s.substring(1);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer: " + e.getMessage());
        }
        catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out of bounds: " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("I don't know what happened: " + e.getMessage());
        }
        System.out.println("I'm not dead yet!");

         */

// EXAMPLE 4
// - read a line
//        - read all lines

        var pathname = "testFile.txt";
        var file = new File(pathname);
        System.out.println("file exists: "+file.exists());

//invoke in try () will make you sure file is
// closed after reading. no memory leaks.
//or else finally and closing needed.
        try (var reader = new FileReader(file);
             var buffer = new BufferedReader(reader))
        {
            var oneLine = buffer.readLine();
            var allLines = Files.readAllLines(
                    Paths.get( "fromJShell.java"), Charset.defaultCharset());

            System.out.println("buffer reads oneLine: "+oneLine);
            System.out.println("ListString reads all: "+allLines);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }


    }
}

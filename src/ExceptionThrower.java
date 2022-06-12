import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * throws keyword Vs. try...catch...finally There might be several methods that can cause exceptions. Writing
 * try...catch for each method will be tedious and code becomes long and less-readable. throws is also useful when you
 * have checked exception (an exception that must be handled) that you don't want to catch in your current method.
 * <p>
 * The throw keyword is used to explicitly throw a single exception. When an exception is thrown, the flow of program
 * execution transfers from the try block to the catch block. We use the throw keyword within a method.
 */
public class ExceptionThrower
{

    //USAGE 1 - explicit throwing
    private static void aloneThrower()
    {
        // ArithmeticException is an unchecked exception.
        // It's usually not necessary to handle unchecked exceptions.
        // method throws a message we passed to its constructor.
        throw new ArithmeticException("false \n" + "try to \n" + " divide by zero");
    }

    //USAGE 2 - explicit throwing
    public static void riskyDivision() throws ArithmeticException
    {
        int risky = 9 / 0;
    }

    //throws, in-method usage
    private static void methodicThrows() throws IOException
    {
        //    since it is (IOException) a checked exception (compile-time exception),
        //    we must specify it in the throws clause.
        File newFile = new File("itShouldShow\n aFilePath\n NotaName.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args)
    {

        //INVOKE 1 - explicit throwing
        riskyDivision();
        aloneThrower();
        //INVOKE 2 - explicit throwing
        try {
            methodicThrows();
        }
        catch (IOException e) {
            System.out.println(e);
        }


    }
}

public class ExceptionMultipleCatch {

    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
//If a catch block handles multiple exceptions,
// the catch parameter is implicitly final.
// This means we cannot assign any values to catch parameters.

//                When catching multiple exceptions in a single catch block,
//                the rule is generalized to specialized.
//                  This means that if there is a hierarchy of exceptions in the catch block,
//                  we can catch the base exception only instead of catching
//                  multiple specialized exceptions.
//                We know that all the exception classes are subclasses of the Exception class.
//                So, instead of catching multiple specialized exceptions,
//                we can simply catch the Exception class.

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            } catch (ArithmeticException e) {
//                If the base exception class has already been specified in the catch block,
//                do not use child exception classes in the same catch block.
//                Otherwise, we will get a compilation error.
//                ArithmeticException and ArrayIndexOutOfBoundsException
//                are both subclasses of the Exception class.
//                So, we get a compilation error.
//            } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}

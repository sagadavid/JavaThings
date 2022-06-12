import java.util.Scanner;

public class ExceptionExpected {
    Scanner scanner;

    private static int riskyDivision(int givenNumber) {
        System.out.print("enter a number:");
        Scanner inputRead = new Scanner(System.in);
        givenNumber = inputRead.nextInt();

        int result = 0;
        if (givenNumber>0 && givenNumber<9){
            result = givenNumber/0;
//            throw new ArithmeticException("numbers 0-9 divided by 0\n" +
//                    "which means infinity and an exception error");
        }
        else {
            result = givenNumber/3;
        }
        System.out.println("downrolled resutl is "+result);
        return result;
    }


    public static void main(String[] args) {

//        riskyDivision(34);
        try {
            riskyDivision(34);
        } catch (ArithmeticException aex) {
            System.out.println("please read this:\n" +
                    "numbers 0-9 is divided by 0\n" +
                    "   and it causes error!");
            System.out.println("system excptn message: "+aex.getMessage());
        } finally {
            System.out.println( "feedback:\ntry catch exception handling is\n successfully implemented");
        }
    }

}
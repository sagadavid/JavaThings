import java.util.Scanner;

public class MethodTips
{
    /**
     * CODE REUSABILITY !!!!! FROM DAVID GASSNER GITHUB A CUSTOM METHOD IS SET, PROMT IS SET AS A PARAMETER SO IT CAN BE
     * CHANGED IN EVERY OCCURENCE OF METHOD !!ONE OF TWO SAME METHODS ARE SELECTED AND MENU/REFACTOR/EXTRACT/METHOD-->
     * CUSTOM METHOD PRODUCED!!
     * @param sc
     * @param prompt
     * @return
     */
//    private static double getInput(Scanner sc, String prompt) {
//        System.out.print(prompt);
//        return sc.nextDouble();
//    }
    private static double getInput(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        return sc.nextDouble();
    }

    private static int sumValue(int... values)//can add as much as you want
    {
        int result = 0;
        for (var value : values) {
            result += value;
        }
        System.out.println("sum is " + result);
        return result;
    }

    public static void main(String[] args)
    {

        var sc = new Scanner(System.in);
        double d1 = getInput(sc, "Enter numeric value 1: ");
        double d2 = getInput(sc, "Enter numeric value 2: ");
        double d3 = getInput(sc, "Enter numeric value 3: ");
        double d4 = getInput(sc, "Enter numeric value 4: ");
        double d5 = getInput(sc, "Enter numeric value 5: ");

        var toplam = sumValue((int) d1, (int) d2, (int) d3, (int) d4, (int) d5);
//
//        double result = d1 / d2;
//        System.out.println("The answer is " + result);
    }

}

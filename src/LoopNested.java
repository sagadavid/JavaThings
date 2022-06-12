import java.util.Scanner;

class LoopNested
{
    /**
     * CODE REUSABILITY !!!
     *
     * @param userCom // RECURSIVE BIR METODDA EKRANA VERILEN MESAJIN // FARKLI OLMASI ICIN METODU 2 YE BOLDUM INTRO VE
     *                QUEST DIYE //    ANCAK DAHA SONRA MESAJI PARAMETRE OLARAK EKLEDIM(USERCOM), //    RECURSING
     *                METHOD-DA MESAJI DEGISTIRDIM
     */


    //    public static void intro(){
//        String userCom = "please guess a number..and 0 means quit..now,guess: ";
//        System.out.println(userCom);
//    }
    public static String quest(String userCom)
    {
        System.out.println(userCom);//prompt daha asagida verilirse,
        // program calistiginda terminalde gozukmuyor,
        // int+enter girersen prompt geliyro
        Scanner inScan = new Scanner(System.in);
        String forklaring;
        String bye = "bye bye";
        int guess;
        guess = inScan.nextInt();
        if (guess == 0) {
            System.out.println(bye);
        } else {
            if (guess > 1 && guess < 10) {
                forklaring = "this is good not to write negative number.. give another shot..";
                System.out.println(forklaring);
            } else if (guess > 10 && guess < 20) {
                forklaring = "this is good you know numbers over 10.. again please..";
                System.out.println(forklaring);
            } else if (guess > 20) {
                forklaring = "i cant count over 20.. come again..";
                System.out.println(forklaring);
            }
            quest("try again");
        }
        return bye;
    }

    public static void main(String[] args)
    {
//        for (int x = 1; x <= 10; x++) {
//            for (int y = 1; y <= 10; y++) {
//                System.out.printf("%4d", x * y);
//            }
//            System.out.println();
//        }
        var q1 = quest("please guess a number..and 0 means quit..now,guess: ");
//        var q2=quest("helloooooo");


    }
}
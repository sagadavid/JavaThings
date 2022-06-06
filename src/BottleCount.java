public class BottleCount {
    static String word = "bottles";
    static int antall = 20;

    public static void countBottle(int antall){
        while (antall > 0){
            System.out.println(antall+" "+word);
            antall = antall - 1;
            if (antall==1){
                word = "bottle";
            }
            if (antall==0){
                System.out.println(antall+"-no more bootle");
            }
        }
    }

    public static void main(String[] args) {
        countBottle(34);
    }
}

import java.text.NumberFormat;

public class BinaryConRecursive {
    public static int binarian (int given) {
        byte realBi = 0;
        if (given > 0) {
            binarian(given / 2);
//          System.out.print(given%2);
            int bi = given % 2;
            realBi = (byte) bi;
        }
        System.out.print(realBi);
        return realBi;
    }

    public static void main(String[] args) {
        binarian(BottleCount.antall);
    }
}

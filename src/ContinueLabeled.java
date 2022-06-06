public class ContinueLabeled {
    public static void main(String[] args) {

//outer loop is labeled as first
        first:
        for (int i = 1; i < 6; ++i) {

//inner loop
            for (int j = 1; j < 6; ++j) {
                if (i == 4 || j == 4)
//skips the current iteration of outer loop
                    continue first;
//                    System.out.println("i = " + i + "; j = " + j);
                System.out.println(i+""+j);
            }
        }
    }
}

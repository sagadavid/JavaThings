public class IncrementalDesign {
    //    public static void dubliker(int n)
    public static void dubliker(int n, int colons)
    // 2- adding n as a parameter and n*i, is generalizing the method
    //4- adding colons
    {
//        for(int i=1; i<=6;i++){
        for (int i = 1; i <= colons; i++) {
            System.out.printf("%4d", n * i);
        }
        System.out.println();//this is just for breaking the line
    }
    //3-more generalizatioin, rows added as parameter and loop limit
    public static void matriser(int rows) {
//        for (int i = 1; i <=6; i++) {
        for (int i = 1; i <= rows; i++) {
//            dubliker(i);      }
//            dubliker(i, rows); //5- update rows here according to stage 4        }
            dubliker(i,i);
        }
    }
    public static void main(String[] args) {
// 1- code here moved into method as for encapsulation
//dubliker(3);
        matriser(3);
    }
}


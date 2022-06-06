import java.util.ArrayList;

public class Loopso extends MethodSharer{
    public static void main(String[] args) {
        int[] numArr = {34, 45, 67, 34, 23, 11, 123};
// for each
        for (int i : numArr) {
            System.out.println("forEach: " + i);
        }
// for loop
        int roof = 8;
        for (int i = 0; i <= roof; ++i) {
            System.out.println("forLoop: " + i * 3);
        }
// while loop
        int i = 0;
        int max = 7;
        while (i <= max) {
            System.out.println("while: " + i * 2);
            ++i;
        }
// do while loop
        int x = 0;
        int upper = 9;
        do {
            System.out.println(x * 5);
            x++;
        } while (x <= 9);

        System.out.println("***** ****** ******");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
//        for (int z=0; z<2;++z){
//            MethodSharer methodSharer= new MethodSharer();
//            methodSharer.display(arrayList.get());
//            arrayList.get(0);
//            methodSharer.display(arrayList.get());
//            display index 0 to 2???
//        }
    }
}

class MethodSharer{
    public ArrayList display (ArrayList arrayList){
        System.out.println(arrayList);
        return arrayList;
    }
}

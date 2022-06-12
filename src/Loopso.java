import java.util.ArrayList;


class MethodSharer
{
    public void display(ArrayList arrayList)
    {
        System.out.println(arrayList);
    }
}
public class Loopso extends MethodSharer
{
    public static void main(String[] args)
    {
        int[] numArr = {34, 45, 67, 34, 23, 11, 123};
        //  WHILE LOOP
        var whileCounter = 0;
        while (whileCounter < numArr.length) {
            System.out.println("at index: " + whileCounter
                    + " is value: " + numArr[whileCounter]);
            whileCounter++;
        }

//  DO WHILE LOOP
        var doCounter = 0;
        do {
            System.out.println(numArr[doCounter] + " is at index" + doCounter);
            doCounter++;
        }
        while (doCounter < numArr.length);

//FOR EACH
        for (int i : numArr) {
            System.out.println("forEach: " + i);
        }
// for loop
        int roof = 8;
        for (int i = 0; i <= roof; ++i) {
            System.out.println("forLoop: " + i * 3);
        }

//EXTENDED METHOD SHARE
        ArrayList<String> arrlisto = new ArrayList<>();
        arrlisto.add("1");
        arrlisto.add("2");
        arrlisto.add("3");
        arrlisto.add("4");

        for (int z=0; z<5;++z){
            MethodSharer mSH= new MethodSharer();
            System.out.print("loop no: "+z+" for array arrListo= ");
            mSH.display(arrlisto);
        }


    }
}


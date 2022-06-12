import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListo {

    public static void main(String[] args) {
//initialize array list
        java.util.ArrayList<String> nounsArrList = new java.util.ArrayList();
        System.out.println("nounsArrList are null: "+nounsArrList);//nounsArrList are null: []
//add elements(adds to last position
//add element at index (index should not create a null/hull)
        nounsArrList.add("table");
        nounsArrList.add(1,"desk");
        nounsArrList.add("tv");
////get element at index
        System.out.println(nounsArrList.get(1));//desk
        System.out.println(nounsArrList.toString());//[table, desk, tv]
        System.out.println("nounsArrList "+nounsArrList);//nounsArrList [table, desk, tv]
// copy to new Array List
        java.util.ArrayList<String> newNouns = new java.util.ArrayList<>();
        newNouns.addAll(nounsArrList);
        System.out.println("newnouns"+newNouns);//newnouns[table, desk, tv]
//fore loop for list
        for (int i = 0; i < newNouns.size(); i++) {
            System.out.print(newNouns.get(i));//tabledesktvsubstan
        }

        ArrayList<String> substan = new ArrayList<>();
        substan.add("window");
        substan.add("carriage");
        substan.add("logos");
        System.out.println("substan "+substan);//substan [window, carriage, logos]
//addALl to the index !! position
        substan.addAll(1,nounsArrList);
        System.out.println("substan "+substan);//substan [window, table, desk, tv, carriage, logos]
//addAll, adds to end if index not specified
        substan.addAll(substan);
        System.out.println("double substan "+substan);//substan [window, table, desk, tv, carriage, logos]
// possible to add a Set also
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("okaliptus");
        nounsArrList.addAll(hashSet);
        System.out.println("nounsArrList+hashset "+nounsArrList);//nouns+hashset [table, desk, tv, okaliptus]

    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListo {
    public static void main(String[] args) {
//        create array list
        java.util.ArrayList<String> nouns = new java.util.ArrayList();
        System.out.println("nouns:null:  "+nouns);
//        add element to arraylist (adds to last position)
        nouns.add("table");
//        add element at index (index should not create a null/hull)
        nouns.add(1,"desk");
        nouns.add("tv");
//        get element at index
        System.out.println(nouns.get(1));
        System.out.println("nouns "+nouns);
// copy to new
        java.util.ArrayList<String> newNouns = new java.util.ArrayList<>();
//       old list in paranthesis
//    (not)-->    nouns.addAll(newNouns);
        newNouns.addAll(nouns);
        System.out.println("newnouns"+newNouns);
//        addALl to the index !! position
        ArrayList<String> substan = new ArrayList<>();
        substan.add("window");
        substan.add("carriage");
        substan.add("logos");
        System.out.println("substan "+substan);
        substan.addAll(1,nouns);
        System.out.println("substan "+substan);
//        addAll, adds to end if index not specified
        substan.addAll(substan);
        System.out.println("double substan "+substan);
// possible to add a Set also
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("okaliptus");
        nouns.addAll(hashSet);
        System.out.println("nouns+hashset "+nouns);
    }
}

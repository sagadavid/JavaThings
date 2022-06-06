import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapSet {
    public static void main(String[] args) {
//        hashmap: type argument cannot be primitive
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("california", 345);
        hashMap.put("bosnia", 98);
        hashMap.put("bosnia", 76);
        System.out.println("printlnhashMap: "+hashMap);
//        methods--contains value
        System.out.println("containsValue: "+hashMap.containsValue(345));
        System.out.println("containsMap: "+hashMap.containsKey("bosnia"));
//        iterator for hashmap: 2 steps
        Set entrySet = hashMap.entrySet();
        Iterator iter = entrySet.iterator();
        while (iter.hasNext()){
            System.out.println("iteratedhashMap: "+hashMap);
            break;
        }
//      hashset: only one parameter
        HashSet<String> hashSet =new HashSet<String>();
        hashSet.add("okaliptus");
        hashSet.add("triumphus");
        System.out.println("printlnhashSet: "+hashSet);
//        methods--contains
        System.out.println("hashContains: "+hashSet.contains("okaliptus"));
        for(String i : hashSet){
            System.out.println("forLoopHashSet: "+i);
        }
//                    iterator for hashset
        Iterator<String> iteratorSet = hashSet.iterator();
        while (iteratorSet.hasNext())
        {
            System.out.println("iteratedhashSet: "+hashSet);
            break;
        }
    }
}

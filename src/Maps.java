import java.util.*;

/**
 * Map is an interface,
 * it can be used only with a class that implements this interface.
 */
public class Maps {
    private HashMap<String,Integer> hashMap;
    private LinkedHashMap<String,Integer> linkedHashMap;
    private TreeMap<String,Integer> treeMap;

    //    Since SortedMap is an interface,
//    objects cannot be created of the type SortedMap.
//    We always need a class that extends this list in order to create an object.
//    The class which implements the SortedMap interface is TreeMap.
//    TreeMap class which is implemented in the collections framework
//    is an implementation of the SortedMap Interface
//    and SortedMap extends Map Interface.
//    It behaves like a simple map with the exception that
//    it stores keys in a sorted format.
//    TreeMap uses a tree data structure for storage.
//    Objects are stored in sorted, ascending order.
//    But we can also store in descending order by passing a comparator.
    private SortedMap<Integer,String> sortedMap;

    public Maps(){
        hashMap = new HashMap<>();
        linkedHashMap=new LinkedHashMap<>();
        treeMap=new TreeMap<>();
        sortedMap = new TreeMap<Integer, String>();
    }


    public static void main(String[] args) {
        //map-types by class object
        Maps mapType = new Maps();
        mapType.hashMap.put("elefant", 45);
        mapType.treeMap.put("dog",4);
        mapType.linkedHashMap.put("svaleveien",13);
        mapType.linkedHashMap.put("svaleveien", 23);
        mapType.linkedHashMap.put("dallonaveien", 3);
        mapType.linkedHashMap.put("veronaveien",34);
        mapType.linkedHashMap.remove("veronaveien");

        System.out.println("hasMap: "+mapType.hashMap);
        System.out.println("linkedHashMap: "+mapType.linkedHashMap);
        System.out.println("treeMap: "+mapType.treeMap);

        //HashMap provides the basic implementation of the Map interface of Java.
        // It stores the data in (Key, Value) pairs.
        // To access a value one must know its key.
        // the insertion order is not retained in the hashmap.
        // Internally, for every element, a separate hash is generated
        // and the elements are indexed based on this hash
        // to make it more efficient.

        Map<String, Integer> siHMap = new HashMap<>();
        siHMap.put("norway", 47);
        siHMap.put("sweden", 46);
        siHMap.put("nederlands", 30);
        siHMap.put("greece", 31);
        siHMap.put("usa", 1);
        System.out.println("");
        System.out.println("siHMap: "+siHMap);

//linkedHashMap maintains an order of elements inserted into it.
        Map<String, Integer> siLHMap = new LinkedHashMap<>();
        siLHMap.put("volvo", 1931);
        siLHMap.put("mercedes", 1920);
        siLHMap.put("toyota", 1927);
        System.out.println("siLHMap: "+siLHMap);
//TreeMapis sorted according to the natural ordering of its keys,
        // or by a Comparator provided at map creation time,
        // depending on which constructor is used.
        // This proves to be an efficient way of sorting
        // and storing the key-value pairs.
        Map<String,Integer> siTMap = new TreeMap<>();
        siTMap.put("Edibe",6);
        siTMap.put("Leila",15);
        siTMap.put("Kerem",18);
        siTMap.put("Emine",40);
        System.out.println("siTMap: "+siTMap);

//traverse hashmap
        System.out.println("");
        System.out.println("traverse siHMap by foreach loop");
        for (Map.Entry<String, Integer> entryHM : siHMap.entrySet()) {
            System.out.println(entryHM.getKey() + ", code: " + entryHM.getValue());
        }
//traverse linkedhasmap
        System.out.println("");
        System.out.println("traverse siLHMap by foreach loop");
        for (Map.Entry<String, Integer> entryLHM : siLHMap.entrySet()) {
            System.out.println(entryLHM.getKey() + " --> " + entryLHM.getValue());
        }
//traverse TreeMap
        System.out.println("");
        System.out.println("traverse siTMap by foreach loop");
        for (Map.Entry<String, Integer> entryTM : siTMap.entrySet()) {
            System.out.println(entryTM.getKey() + " # " + entryTM.getValue());
        }
    }


}

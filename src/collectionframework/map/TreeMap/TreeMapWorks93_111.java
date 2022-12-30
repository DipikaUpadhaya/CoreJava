package collectionframework.map.TreeMap;

import java.util.TreeMap;

public class TreeMapWorks93_111 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap= new TreeMap<>();
        treeMap.put(21, 50);
        treeMap.put(13, 39);
        treeMap.put(55, 96);
        treeMap.put(40, 96);
        treeMap.put(63, 72);
        treeMap.put(44, 111);

        TreeMap<String, String> stringTreeMap= new TreeMap<>();
        stringTreeMap.put("Ramesh", "Pokhara");
        stringTreeMap.put("Dipika", "Bardhaghat");
        stringTreeMap.put("Manju", "Syanjha");
        stringTreeMap.put("Dipa", "Butwal");
        stringTreeMap.put("Sabina", "Chandigarh");


        //93.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("The tree map is: "+treeMap);
        System.out.println("The least key-value mapping is: "+treeMap.firstEntry());
        System.out.println("The greatest key-value mapping is: "+treeMap.lastEntry());
        System.out.println("The least key-value mapping in string tree map is: "+stringTreeMap.firstEntry());
        System.out.println("The greatest key-value mappingin string tree map  is: "+stringTreeMap.lastEntry());



        //94.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println("The lowest key in treemap is: "+treeMap.firstKey());
        System.out.println("The last or highest key in tree map is: "+treeMap.lastKey());
        System.out.println("The last or lowest key in string  tree map is: "+stringTreeMap.firstKey());
        System.out.println("The last or highest key in  stringtree map is: "+stringTreeMap.lastKey());

        //95.Write a Java program to get a reverse order view of the keys contained in a given map.
        System.out.println("The reverse order view of keys contained in tree map is: "+treeMap.descendingKeySet());
        System.out.println("The reverse order view of keys contained in  string tree map is: "+stringTreeMap.descendingKeySet());

        //reverse order view of key-value map in given map
        System.out.println("The reverse order of given tree map is: " +treeMap.descendingMap());
        System.out.println("The reverse order of given string tree map is: " +stringTreeMap.descendingMap());

        //96.Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        System.out.println("The next lesser key-value of given key, 5 is: "+treeMap.floorEntry(7));
        System.out.println("The next lesser key-value of given key, Ramesh is: "+stringTreeMap.floorEntry(("Dipe")));

        //97.Write a Java program to get the greatest key less than or equal to the given key.
        System.out.println("The greatest key less than or equal to given key is: "+treeMap.floorKey(20));
        System.out.println("The greatest key less than or equal to given key in string tree map is: "+stringTreeMap.floorKey("Rames"));

        //98.Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        System.out.println("The portion of a map whose keys are less than a given key, 40 is: "+treeMap.headMap(40));
       ;

        //99.Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
        System.out.println("The portion of a map whose keys are less than or equal a given key, 40 is: "+treeMap.headMap(40, true));

        //100.Write a Java program to get the least key strictly greater than the given keyReturn null if there is no such key.
        System.out.println("The next greater key than the given key is: "+treeMap.ceilingKey(65));
        System.out.println("The next greater key than the given key is: "+treeMap.ceilingKey(62));

        //101.Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given keyReturn null if there is no such key
        System.out.println("The next greater key -value than the given key is: "+treeMap.ceilingEntry(65));
        System.out.println("The next greater key-value than the given key is: "+treeMap.ceilingEntry(62));

        //103.Write a Java program to get a NavigableSet view of the keys contained in a map.
        System.out.println("The navigable set view of keys contained in map is: "+treeMap.navigableKeySet());
        System.out.println("The navigable set view of keys contained in map is: "+stringTreeMap.navigableKeySet());

        //104.Write a Java program to remove and get a key-value mapping associated with the least key in a map.
        System.out.println("Original treemap is: "+treeMap);
        System.out.println("REmoved key-value entry is: "+treeMap.pollFirstEntry());
        System.out.println("The result map after removing least key in map is: "+treeMap);
        System.out.println("Original string tree map is: "+stringTreeMap);
        System.out.println("Removed key-value entry is: "+stringTreeMap.pollFirstEntry());
        System.out.println("The result map after removing least key in map is: "+stringTreeMap);

        //105.Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
        System.out.println("Removed greatest key-value entry is: "+treeMap.pollLastEntry());
        System.out.println("After removing greatest key-value, the map is: "+treeMap);

        //106.Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
        System.out.println("The portion of map having startkey inclusive & toKey exclusive is: "+
                treeMap.subMap(40, true,50, false));

        //107.Write a Java program to get the portion of a map whose keys range from a given key to another key.
        System.out.println("The portion of map in range : "+treeMap.subMap(20, 40));

        //108.Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
        System.out.println("Original: "+treeMap);
        System.out.println("The portion of a map whose keys are greater than or equal a given key, 40: "+treeMap.tailMap(40,true));

        //109.Write a Java program to get a portion of a map whose keys are greater than to a given key.
        System.out.println("the portion of a map whose keys are greater than to a given key: "+treeMap.tailMap(40));

        //110.Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
        System.out.println("key-value mapping associated with least key greater than or equal to given key: "+treeMap.ceilingEntry(41));

        //111.Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println("Least key greater than or equal to given key: "+treeMap.ceilingKey(41));
    }

}

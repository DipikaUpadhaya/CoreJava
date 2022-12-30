package collectionframework.map.TreeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapManipulation86_92 {
    public static void main(String[] args) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 56);
        treeMap.put(4, 16);
        treeMap.put(3, 256);
        treeMap.put(2, 561);

        System.out.println(treeMap);
        treeMap.forEach((key, value) -> System.out.println(key + "=" + value));

        //87.Write a Java program to copy a Tree Map content to another Tree Map.
        Map<Integer, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put(1, 563);
        treeMap1.put(5, 16);
        treeMap1.put(6, 1161);
        treeMap.putAll(treeMap1);
        System.out.println("After copying treeMap1 to treeMap: " + treeMap);

        //88.Write a Java program to search a key in a Tree Map.
        System.out.println("Does key 5 is present in tree map? " + treeMap.containsKey(5));

        //89.Write a Java program to search a value in a Tree Map.
        System.out.println("Does value 161 is present in treemap? " + treeMap.containsValue(161));
        System.out.println("Does value 16 is present in treemap? " + treeMap.containsValue(16));

        //90.Write a Java program to get all keys from a given Tree Map.
        System.out.println("All keys from tree map are: " + treeMap.keySet());

        //91.Write a Java program to delete all elements from a given Tree Map.
        treeMap1.clear();
        System.out.println("After deleting all elements from tree map: " + treeMap1);

        //92.Write a Java program to sort keys in Treemap by using comparator
        TreeMap<String, String> treeMap2 = new TreeMap<String, String>();
        treeMap2.put("S3", "Dipika");
        treeMap2.put("S1", "Ramesh");
        treeMap2.put("S4", "Dipa");
        treeMap2.put("S2", "Deepesh");
        System.out.println(treeMap2);


    }

}

package collectionframework.map.hashMap;

import java.util.*;

public class HashMapManipulation74_85 {
    public static void main(String[] args) {
       HashMap<Integer, String> hashMap= new HashMap<>();
        hashMap.put(1, "Dipika");
        hashMap.put(4, "Dipesh");
        hashMap.put(2, "Ramesh");
        hashMap.put(5, "Dipa");
        hashMap.put(3, "Hridika");

        System.out.println(hashMap);
        System.out.println("Return only key set: "+hashMap.keySet());
        System.out.println("Return only value set: "+hashMap.values());

        //75.Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("The count of number of key  value in map: "+hashMap.size());

        //Iterating hashmap values using for loop
        System.out.println("Iterating elements in map using for loop");
        for(Map.Entry<Integer, String> newMap: hashMap.entrySet()){
            System.out.println(newMap.getKey()+" = "+newMap.getValue());
        }

        //Iterating elements using Iterator interface
        System.out.println("Iterating hash map elements using iterator ");
        Iterator<Map.Entry<Integer, String>> newItr= hashMap.entrySet().iterator();
        while(newItr.hasNext()){
            Map.Entry<Integer, String> newMap=(Map.Entry<Integer, String>)newItr.next();
            System.out.println(newMap.getKey()+" -> "+newMap.getValue());
        }

        //Iterating through forEach
        System.out.println("Iterating through foreach and lamda expressiion");
        hashMap.forEach((key, value)-> System.out.println(key +"<--->"+value));

        //76.Write a Java program to copy all of the mappings from the specified map to another map

        HashMap<Integer, String> newHashMap= new HashMap<>();
        newHashMap.put(6, "texas");
        newHashMap.put(8, "toronto");
        newHashMap.put(7, "oklahama");
        newHashMap.put(9, "seatle");

        System.out.println("The new hash map, newHashMap is: ");
        //for displaying key value
        for(Map.Entry<Integer, String> nwMap:newHashMap.entrySet()){
            System.out.println(nwMap.getKey()+"=="+nwMap.getValue());
        }
        hashMap.putAll(newHashMap);
        System.out.println("After copying new hashMap to hashMap: ");
        hashMap.forEach((key,value)-> System.out.println(key+"--*"+value));

        //77.Write a Java program to remove all of the mappings from a map
        hashMap.clear();
        System.out.println("After removing all of mappings from map: "+hashMap);

        //78.Write a Java program to check whether a map contains key-value mappings (empty) or not.d
        System.out.println("Does hashMap is empty? "+hashMap.isEmpty());
        System.out.println("Does newHashMap is empty? "+newHashMap.isEmpty());

        //79.Write a Java program to get a shallow copy of a HashMap instance.
        System.out.println("newHashMap: "+newHashMap);
        hashMap=(HashMap)newHashMap.clone();
        System.out.println("Shallow copy of newHashMap to hashMap: "+hashMap);

        //80.Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("Does hashmap contain key 8? "+ hashMap.containsKey(8));
        System.out.println("Does hashmap contain key 10? "+ hashMap.containsKey(10));

        //81.Write a Java program to test if a map contains a mapping for the specified value
        System.out.println("Does hashMap contain value texas ? "+hashMap.containsValue("texas"));
        System.out.println("Does hashMap contain value newYork ? "+hashMap.containsValue("newYork"));

        //82.Write a Java program to create a set view of the mappings contained in a map.
        Set set= hashMap.entrySet();
        System.out.println("Set view of mapping contained in a map: "+set);

        //83.Write a Java program to get the value of a specified key in a map.
        System.out.println( "The value at specified key, 7 is: "+hashMap.get(7));

        //84.Write a Java program to get a set view of the keys contained in this map.
        Set setKey= hashMap.keySet();
        System.out.println("The set view of keys contained in map is: "+setKey);

        //85. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("HashMap collection views of values: "+hashMap.values());




    }

}

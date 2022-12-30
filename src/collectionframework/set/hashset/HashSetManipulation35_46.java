package collectionframework.set.hashset;

import java.util.*;

public class HashSetManipulation35_46 {
    public static void main(String[] args) {
       HashSet<String> stringSet= new HashSet<>();
        stringSet.add("apple");
        stringSet.add("orange");
        stringSet.add("mango");
        stringSet.add("banana");
        stringSet.add("pulm");
        stringSet.add("mango");
        System.out.println("original set is: "+stringSet);

        //35.Write a Java program to append the specified element to the end of a hash set.
        stringSet.add("peach");
        System.out.println("After adding peach element, the set is: "+stringSet);

        //36.Write a Java program to iterate through all elements in a hash set
        System.out.println("iterating element of hashset:");
        for (String str:stringSet) {
            System.out.print(str+" , ");
        }
        System.out.println();
        System.out.println("ieterating using stream: ");
        stringSet.stream().forEach(x-> System.out.print(x+" , "));

        //37.Write a Java program to get the number of elements in a hash set.
        System.out.println();
        System.out.println("The number of elements in hashset is: "+stringSet.size());

        //38.Write a Java program to empty a hash set
        /* stringSet.clear();
        System.out.println("After empty the hash set: "+stringSet);*/

        //39.Write a Java program to test if a hash set is empty or not.
        System.out.println("Does the hash set is empty? "+ stringSet.isEmpty());

        //40.Write a Java program to clone a hash set to another hash set.
        HashSet<String> newHashSet= new HashSet<>();
        newHashSet= (HashSet<String>) stringSet.clone();
        System.out.println("After cloning stringset to new hashset, the new hashset is: "+newHashSet);

        //41.Write a Java program to convert a hash set to an array.
        String[] stringArray= new String[stringSet.size()];
        stringSet.toArray(stringArray);
        System.out.println("After converting hash set to array: "+Arrays.toString(stringArray));

        //42.Write a Java program to convert a hash set to a tree set
        TreeSet<String> treeSet= new TreeSet<>(stringSet);
        System.out.println("After converting hashset(stringset) to treeset, treeset is: "+treeSet);

        //43.Write a Java program to convert a hash set to a List/ArrayList.
        List<String> list= new ArrayList<>(stringSet);
        System.out.println("After converting hashset to array list: "+list);

        //44.Write a Java program to compare two hash set.
        System.out.println("Does two set are same? "+ stringSet.equals(newHashSet));

        //45.Write a Java program to compare two sets and retain elements which are the same on both sets.
        HashSet<String> newStringSet= new HashSet<>();
        newStringSet.add("banana");
        newStringSet.add("strawberry");
        newStringSet.add("mango");
        newStringSet.add("peach");
        newStringSet.add("pineapple");
        System.out.println("The elements which are same on both hash set, stringSet and newStringset are: ");
        stringSet.retainAll(newStringSet);
        System.out.println(stringSet);

        //46.Write a Java program to remove all of the elements from a hash set.
        newStringSet.removeAll(newStringSet);
        System.out.println("After removing all elements from new String hash set: "+newStringSet);
    }
}

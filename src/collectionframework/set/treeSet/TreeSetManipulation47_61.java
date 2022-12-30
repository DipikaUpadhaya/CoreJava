package collectionframework.set.treeSet;

import java.util.*;
import java.util.stream.Collectors;

public class TreeSetManipulation47_61 {
    public static void main(String[] args) {
        TreeSet<String> treeSet= new TreeSet<>();
        treeSet.add("texas");
        treeSet.add("ohio");
        treeSet.add("arkansas");
        treeSet.add("minisota");
        treeSet.add("colorado");
        treeSet.add("hawai");

        //47. rite a Java program to create a new tree set, add some colors (string) and print out the tree set.
        System.out.println("Elements in treeset are: "+treeSet);

        //48.Write a Java program to iterate through all elements in a tree set.
        System.out.println("Iterating elements using stream: ");
        treeSet.stream().forEach(x-> System.out.print(x+" , "));

        //49.Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> newTreeSet= new TreeSet<>();
        newTreeSet.add("canada");
        newTreeSet.add("australia");
        newTreeSet.add("singapore");
        treeSet.addAll(newTreeSet);
        System.out.println();
        System.out.println("after adding another treeset in first tree set: "+treeSet);

        //50.Write a Java program to create a reverse order view of the elements contained in a given tree set.
        NavigableSet ns=treeSet.descendingSet();
        System.out.println(ns);

        //51.Write a Java program to get the first and last elements in a tree set.
        System.out.println("First element is: "+treeSet.first());
        System.out.println("Last element in treeset is: "+treeSet.last());

        //52.Write a Java program to get the number of elements in a tree set.
        System.out.println("the number of elements in a tree set is: "+treeSet.size());

        //53.Write a Java program to compare two tree sets.
        System.out.println("Does two tree set are same? "+treeSet.equals(newTreeSet));

        //54.Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> integerTreeSet= new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(7);
        integerTreeSet.add(2);
        integerTreeSet.add(5);
        integerTreeSet.add(9);
        integerTreeSet.add(18);
        System.out.println("The numbers less than 7 are: ");
        integerTreeSet.stream().filter(x->x<7).forEach(x-> System.out.print(x+","));

        //55Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println();
        System.out.println("The set of elements in treeset which is greater than or equal to 5: ");
        integerTreeSet.stream().filter(x-> x>=5).forEach(x-> System.out.print(x+","));
        System.out.println();
        Set<Integer> filteredSet=integerTreeSet.stream().filter(x-> x>=5).collect(Collectors.toSet());
        System.out.println("The filtered set are: "+filteredSet);

        //56.Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("The filtered set which is less than or equal to 5: ");
        integerTreeSet.stream().filter(x-> x<=5).forEach(x-> System.out.print(x+", "));

        //57.Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
        System.out.println("Strictly greater than 5: "+integerTreeSet.higher(5));
        System.out.println("Strictly less than 5: "+integerTreeSet.lower(5));

        //59.Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("Original set: "+treeSet);
        System.out.println("To retrieve and remove first element of a tree set: "+ treeSet.pollFirst());
        System.out.println("After removing first element: "+treeSet);

        //60
        System.out.println("To retrieve and remove last element of a tree set: "+treeSet.pollLast());
        System.out.println("After removing last element, the tree set is: "+treeSet);

        //61.Write a Java program to remove a given element from a tree set.
        treeSet.remove("canada");
        System.out.println("remove a element canada from treeSet: "+treeSet);

    }
}

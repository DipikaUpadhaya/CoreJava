package collectionframework.list.ArrayList;

import java.util.*;

public class ListMaipulation6_13 {
    public static void main(String[] args) {
        List<Integer> integerList= new ArrayList<>();
        integerList.add(34);
        integerList.add(348);
        integerList.add(134);
        integerList.add(334);
        integerList.add(234);
        integerList.add(374);
        integerList.add(5374);
        integerList.add(1374);
        integerList.add(137);

        System.out.println("The original list is: "+integerList);
        integerList.add(1,400);
        System.out.println("After inserting 400 at position 1: "+integerList);
        //6.Write a Java program to remove the third element from an array list.
        integerList.remove(2);
        System.out.println("After removing 3rd element from list: "+integerList);

        //7.Write a Java program to search an element in an array list.
        System.out.println("Does integer list contain 34? "+integerList.contains(34));

        //8.Write a Java program to sort a given array list.
        Collections.sort(integerList);
        System.out.println("After sorting using collections.sort: "+integerList);

        //9.Write a Java program to extract a portion of an array list.
        System.out.println("A certain portion of an array list: "+integerList.subList(3,6));
        //10.Write a Java program to compare two array lists.
        List<Integer> integerList1= new ArrayList<>();
        integerList1.add(34);
        integerList1.add(348);
        integerList1.add(134);
        integerList1.add(334);
        integerList1.add(234);
        integerList1.add(374);
        integerList1.add(5374);
        integerList1.add(1374);
        integerList1.add(137);

        System.out.println("Second list is: "+integerList1);

        System.out.println("Does two list, integerlist and integerlist1 are same? "+integerList.equals(integerList1));

        //11.Write a Java program to join two array lists.
        System.out.println("After joining two array list: ");
        integerList.addAll(integerList1);
        System.out.println(integerList);

        //13.Write a Java program to trim the capacity of an array list the current list size.
        System.out.println("BEfore triming: "+integerList);
        ((ArrayList<Integer>) integerList).trimToSize();
        System.out.println("After: "+integerList);
        System.out.println("After triming the capacity of an original array size to size  10 is: ");
        integerList.stream().limit(10).forEach(x-> System.out.print(x+" "));

        // converting to set
        /*Set<Integer> integerSet= new HashSet<>();
        integerSet.addAll(integerList);
        System.out.println("Converting list to set: ");
        System.out.println(integerSet);*/

        //12.Write a Java program to empty an array list.
        System.out.println("Removing second added list from first list");
       integerList.clear();
        //System.out.println(integerList.removeAll(integerList));
        System.out.println(integerList);
    }
}

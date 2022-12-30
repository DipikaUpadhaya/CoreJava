package collectionframework.list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(4);
        integerArrayList.add(6);
        integerArrayList.add(9);
        System.out.println("The elements in array list are: "+integerArrayList);
        System.out.println("After converting arrayist to array: ");

        //arraylist to array( by using toArray)
        Integer [] integerArray= new Integer[integerArrayList.size()];
        integerArrayList.toArray(integerArray);
        System.out.println(Arrays.toString(integerArray));

        //Array to arraylist (by using asList)
        String[] stringArray= {"Ram","Ramesh", "Ramchandra", "Ramakant"};
        System.out.println("The string array is: "+Arrays.toString(stringArray));
        System.out.println("After converting this string array to arraylist: ");

        List<String> stringArrayList= new ArrayList<>();
        System.out.println(Arrays.asList(stringArray));

    }
}

package collectionframework.list.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IterateThroughAllelement4 {
    public static void main(String[] args) {
        List<Integer> integerList= new ArrayList<>();
        integerList.add(81);
        integerList.add(815);
        integerList.add(681);
        integerList.add(781);
        integerList.add(871);

        //enhanced foreach loop
        System.out.println("Iterating through all elemnets using enhanced for each loop");
        for(Integer integer:integerList){
            System.out.println(integer);
        }
        //using for loop
        System.out.println("Iterating through all elements using for loop");
        for (int i=0; i<integerList.size(); i++){
            System.out.println(integerList.get(i));
        }
        //using stream
        System.out.println("Iterating through all elements using stream");
        integerList.stream().forEach(x-> System.out.println(x));

        System.out.println("Elements greater than 600");
        integerList.stream().filter(x-> (x>600)).forEach(x-> System.out.println(x));

        System.out.println("sorted");
        integerList.stream().sorted().forEach(x-> System.out.println(x));

        System.out.println("Sorted in list");
       List<Integer> list= integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

    }
}

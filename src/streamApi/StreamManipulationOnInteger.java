package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamManipulationOnInteger {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>
                (Arrays.asList(new Integer[]{23,43, 56,1, 24, 89, 34535, 1324,
                        7467,43, 78, 79,32, 56, 75, 77, 90, 120, 34535,7467,347,9738}));

        List<Integer> evenNumber= numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
        System.out.println("Even numbers after filter are: ");
        System.out.println(evenNumber);
        List<Integer> oddNumber= numbers.stream().filter(num->num%2!=0).collect(Collectors.toList());
        System.out.println("Odd numbers after filter are: ");
        System.out.println(oddNumber);

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> startWith1= numbers.stream().filter(number-> number.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println(" the numbers starting with 1 using Stream functions: "+ startWith1);

        //Find distinct elements in a given integers list in java using Stream functions.
        List<Integer> unique= numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("Distinct elements: ");
        System.out.println(unique);

        Set<Integer> uniqueElements= numbers.stream().collect(Collectors.toSet());
        System.out.println(uniqueElements);

        //Find duplicate elements in a given integers list in java using Stream functions.
        Set<Integer> duplicate= numbers.stream()
                .filter(x-> Collections.frequency(numbers, x)>1).collect(Collectors.toSet());
        System.out.println("Duplicate elements are: "+duplicate);

        //Given the list of integers, find the first element of the list using Stream functions?
        System.out.println("First element of list: ");
        System.out.println(numbers.stream().findFirst());

        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println("total numbrs of count: ");
        System.out.println(numbers.stream().count());

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        Integer max= numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum value in list is: "+max);
        Integer min= numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The minimum value is: "+min);

        //Given a list of integers, sort all the values present in it using Stream function
     List<Integer> sortedList=   numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list is: "+sortedList);

        //Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> descendingSorted=numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending sorted order is: "+descendingSorted);



    }
}

package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class OperationsINStream {
    public static void main(String[] args) {
        List<String> countryList= new ArrayList<>
                (Arrays.asList("Nepal","India", "USA", "Nepal", "Canada", "Japan","Australia", "Portugal"
                        ,"France","Brazil", "Argentina","Japan", "China","France","Switzerland"));
        List<String> filteredList= countryList.stream()
                .filter(country-> country.length()>5)
                .collect(Collectors.toList());
        System.out.println("List of country whose length>5: ");
        System.out.println(filteredList);
        System.out.println();

        List<String> mapList= countryList.stream().map(str-> str+"s").collect(Collectors.toList());
        System.out.println("Append s in each string: ");
        System.out.println(mapList);
        System.out.println();

        List<String> distinctList= countryList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements in list are: ");
        System.out.println(distinctList);
        System.out.println();

        List<String> sortedList= countryList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted elements in list are: ");
        System.out.println(sortedList);
        System.out.println();

        boolean consistContry = countryList.stream().anyMatch(country->country.substring(0,3).matches("Can"));
        System.out.println("Matches example: " + consistContry);
        List<String> sortedDescList= countryList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending order sorted list is: ");
        System.out.println(sortedDescList);
        System.out.println();


        System.out.println("The total count of countryList : "+countryList.stream().count());

        System.out.println("The first element is: "+countryList.stream().findFirst());

        List<Integer> numberlist=new ArrayList<>(Arrays.asList(1,4,5,6,8,12,45,67,89,123));

        int min= numberlist.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The minimum number in list is: "+min);

        //int max= numberlist.stream().max(Comparator.comparing(Integer::valueOf)).get();
        //System.out.println("The maximum number in list is: "+max);

        IntSummaryStatistics stats= numberlist.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("The sum of all elements in list is: "+stats.getSum());
        System.out.println("The maximum number in list is: "+stats.getMax());
        System.out.println("The minimum number in list is: "+stats.getMin());
        System.out.println("The average of number list is: "+stats.getAverage());

        double avg= numberlist.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("The average of number list is: "+avg);


    }
}

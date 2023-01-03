package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamManipulation {
    public static void main(String[] args) {
        List<String> city= new ArrayList<>();
        city.add("Texas");
        city.add("Oklahma");
        city.add("Ohio");
        city.add("Arkansas");
        city.add("Illionse");
        city.add("nirajkc");
        city.add("piyakjko");
        city.add("biaj kc");
        city.add("Jhahaj");
        city.add("Arizona");
        city.add("New Mexico");
        city.add("Hawaii");
        city.add("Ann");
        city.add("dhiraj magar");
        city.add("Atlanta");

        city.stream().forEach(x -> System.out.println(x));

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        //Filter the list of String starting with “A” and length between 4 and 8.
       List<String> cityName=city.stream().filter(x-> x.startsWith("A") && x.length()>4 && x.length()<8).collect(Collectors.toList());
        System.out.println(cityName);

        //Filter the list of String containing “aj” and not containing white space.
        System.out.println("*****************");
        city.stream().filter(x->x.contains("aj")&& !x.contains(" ")).forEach(x-> System.out.println(x));

        //Create a list of Integers and filter the numbers greater than 50 and less than 100
        List<Integer> number=new ArrayList<>();
        number.add(9);
        number.add(76);
        number.add(54);
        number.add(46);
        number.add(-10);
        number.add(-299);
        number.add(99);
        number.add(87);
        number.add(-77);
        number.add(50);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Numbers between 50 and 100 are:");
       List<Integer> filteredNumber=number.stream().filter(x-> x>50 && x<100).collect(Collectors.toList());
        System.out.println(filteredNumber);

        //Create a list of Integers and filter the even numbers.
        System.out.println("Even numbers are: ");
        List<Integer>evenNumber=number.stream().filter(x-> x%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);

        //Create a list of Integer and filter the odd numbers
        System.out.println("Odd numbers are: ");
        List<Integer> oddNumber= number.stream().filter(x-> x%2!=0).collect(Collectors.toList());
        System.out.println(oddNumber);

        //Create a list of Integers and filter the positive numbers.
        System.out.println("Positive numbers: ");
        List<Integer> positiveNumber= number.stream().filter(x-> x>0).collect(Collectors.toList());
        System.out.println(positiveNumber);

        //Create a list of Integers and filter the negative numbers.
        System.out.println("Negative numbers: ");
        List<Integer> negativeNumber= number.stream().filter(x-> x<0).collect(Collectors.toList());
        System.out.println(negativeNumber);

        //Create a list of Integers and map it to the square of every element and collect it to set.
        Set<Integer> filteredSet= number.stream().map(x-> x*x).collect(Collectors.toSet());
        System.out.println("Square of every elements: ");
        System.out.println(filteredSet);

        //11. Create a list of Integers and sum it using reduce.
        System.out.println("Suming using reduce: ");
        System.out.println(number.stream().reduce(0, (a, b) -> a + b));

        //12.Create a list of String and make a single string separate by delimiter ‘|’ pipe.
        //Output should be  ram|shyam|hari|sita
        String result= city.stream().collect(Collectors.joining("|"));
        System.out.println(result);


    }
}

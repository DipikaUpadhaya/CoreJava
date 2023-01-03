package streamApi;

import collectionframework.list.ArrayList.ArrayListToArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> bookList= new ArrayList<>();
        bookList.add("Advance Java Programming");
        bookList.add("Fundamentals of OOP");
        bookList.add("Data structure and Algorithm");
        bookList.add("Digital Logic");
        bookList.add("Microprocessor");
        bookList.add("Database ");
        bookList.add("Computer Organization");
        bookList.add("Discrete Structure");
        bookList.add("Parallel and Distributed Computing");
        bookList.add("Distributed Computing");

        System.out.println("Iterating elements using for loop");
        for(String book: bookList){
            System.out.println(book);
        }
        List<String> filteredBookList= new ArrayList<>();
        System.out.println("######################");
        System.out.println("Filtered book list: ");
        for(String book: bookList){
            if(book.length()<16)
            filteredBookList.add(book);
        }
        for(String book:filteredBookList)
        System.out.println(book);

        //using stream filter
        System.out.println("USING STREAM FILTER:::::::::");
       List<String> filteredUsingStreamApi= bookList.stream().filter(book -> book.length()<16).collect(Collectors.toList());
        System.out.println(filteredUsingStreamApi);


    }
}

package collectionframework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listworks {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        System.out.println(names.isEmpty());
        names.add("Dipika");
        names.add("Dipi");
        names.add("Dipa");
        names.add("Dipesh");
        System.out.println(names);

        System.out.println(names.size());

        List<String> anotherList= new ArrayList<>();
        anotherList.add("ram");
        anotherList.add("rames");
        anotherList.add("ramesh");
        names.addAll(anotherList);
        System.out.println(names);

        System.out.println("After adding another list, the size of list names is: "+names.size());

        for(int i=0; i< names.size();  i++){
            System.out.println(names.get(i));
        }

        List<Integer> integerList= new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        char choice;
        do{
            System.out.println("Enter the integer in integerList ");
            integerList.add(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Do you wan to add more(y/n): ");
            choice=scanner.nextLine().charAt(0);
        }while (choice=='y');
        int sum=0;

        for(Integer integer:integerList){
            sum=sum+integer;
            System.out.println(integer);
        }
        System.out.println("The sum of given integers are: "+sum);


    }
}

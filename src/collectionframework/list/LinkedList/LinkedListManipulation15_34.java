package collectionframework.list.LinkedList;

import java.util.*;

public class LinkedListManipulation15_34 {
    public static void main(String[] args) {
        LinkedList<String> stringList= new LinkedList<>();
        stringList.add("Dpka");
        stringList.add("Dipika");
        stringList.add("Dipa");
        stringList.add("Deepesh");
        stringList.add("Dipika");
        System.out.println("The original linked list is: "+stringList);

        //15.Write a Java program to append the specified element to the end of a linked list.
        stringList.add("Ramesh");
        System.out.println("After adding specified element to the end of linked list: "+stringList);

        //16.Write a Java program to iterate through all elements in a linked list.
        stringList.stream().forEach(x-> System.out.println(x+" "));

        //17.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("The first occurance of element dipika is at index: "+stringList.indexOf("Dipika"));
        System.out.println("The last occurance of element dipika is at index: "+stringList.lastIndexOf("Dipika"));

        //18.Write a Java program of swap two elements in a linked list
        System.out.println("Original list is: "+stringList);
        Collections.swap(stringList,4,5);
        System.out.println("After swapping elements of index 1 and 2: "+stringList);


        //19.Write a Java program to insert the specified element at the specified position in the linked list.
        stringList.add(3,"texas");
        System.out.println("After adding element at index 3, new linked list is: "+stringList);

        //22. Write a Java program to display the elements and their positions in a linked list.
        System.out.println("The elements and their index positions are: ");
        for(int i=0; i<stringList.size();  i++){
            System.out.println("At index position : "+i+" the element is "+stringList.get(i));
        }

        //23.Write a Java program to remove a specified element from a linked list.
        stringList.remove("Dipika");
        System.out.println("After removing specified element(Dipika) from list: ");
        System.out.println(stringList);

        //24.Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(stringList);
        System.out.println("After shuffline the elements: "+stringList);

        //26. Write a Java program to clone an linked list to another linked list.
       LinkedList<String> newStringList= new LinkedList<>();
        newStringList= (LinkedList<String>) stringList.clone();
        System.out.println("After cloning stringList to new list: "+newStringList);

        //27.Write a Java program to remove and return the first element of a linked list.
        System.out.println("The first element removed and returned is: "+ stringList.removeFirst());

        //28.Write a Java program to retrieve but does not remove, the first element of a linked list.
        System.out.println("The first element retrieved but not removed is: "+stringList.getFirst());

        //29.Write a Java program to retrieve but does not remove, the last element of a linked list.
        System.out.println("The last element retrieve but not remove : "+stringList.getLast());

        //30.Write a Java program to check if a particular element exists in a linked list.
        System.out.println("Does element dipa present in the linked list: "+ stringList.contains("Dipa"));

        //31.Write a Java program to convert a linked list to array list.
        System.out.println("After converting linked list to arraylist: ");
        ArrayList<String> stringArrayList= new ArrayList<>(stringList);
        for(String arrList:stringArrayList){
            System.out.println(arrList);
        }

        //32.Write a Java program to compare two linked lists.
        List<Integer> list1= new LinkedList<>();
        list1.add(54);
        list1.add(454);
        list1.add(154);

        List<Integer> list2= new LinkedList<>();
        System.out.println("Does list2 is empty? "+list2.isEmpty());
        list2.add(54);
        list2.add(454);
        list2.add(154);
        System.out.println("Does two list are same ? "+list1.equals(list2));

        //33.Write a Java program to test an linked list is empty or not.
        System.out.println("Does stringList is empty ? "+ stringList.isEmpty());
        System.out.println("Does stringArrayList is empty ? "+ stringArrayList.isEmpty());

        //34.Write a Java program to replace an element in a linked list
        stringList.set(2,"Hridhya");
        System.out.println("After replacing second element in list :"+ stringList);

    }
}

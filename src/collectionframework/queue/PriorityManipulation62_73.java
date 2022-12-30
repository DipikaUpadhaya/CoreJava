package collectionframework.queue;

import java.util.*;

public class PriorityManipulation62_73 {
    public static void main(String[] args) {
        Queue<String> stringQueue= new PriorityQueue<>();
        stringQueue.add("mango");
        stringQueue.add("apple");
        stringQueue.add("jackfruit");
        stringQueue.add("banana");
        stringQueue.add("blueberry");
        stringQueue.add("mango");
        System.out.println(stringQueue);

        //63. iterate through all elements
        System.out.println("Iterating through elements using iterator interface:");
        Iterator itr= stringQueue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }

        //64.Write a Java program to add all the elements of a priority queue to another priority queue.
        Queue<String> newStringQueue= new PriorityQueue<>();
        newStringQueue.add("avocado");
        newStringQueue.add("watermelon");
        newStringQueue.add("papaya");
        stringQueue.addAll(newStringQueue);
        System.out.println();
        System.out.println("After adding new queue, the original queue is: "+stringQueue);

        //65.Write a Java program to insert a given element into a priority queue.
        stringQueue.add("Orange");
        System.out.println("after adding orange in string queue: "+stringQueue);

        //66.Write a Java program to remove all the elements from a priority queue.
        newStringQueue.removeAll(newStringQueue);
        System.out.println("after removing all elements, newString queue is: "+newStringQueue);

        //67.Write a Java program to count the number of elements in a priority queue
        System.out.println("The count of elements in queue is: "+stringQueue.size());

        //68.Write a Java program to compare two priority queues
        System.out.println("Does two queue are same? "+stringQueue.equals(newStringQueue));

        //69.Write a Java program to retrieve the first element of the priority queue.
        System.out.println("Original queue: "+stringQueue);
        System.out.println("The first element in the queue is: "+stringQueue.peek());

        //70.Write a Java program to retrieve and remove the first element of the priority queue.
        System.out.println("retrieve and remove first element from queue: "+stringQueue.poll());
        System.out.println("After removing first element from queue: "+stringQueue);

        //71.Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
        String[] stringArray= new String[stringQueue.size()];
        stringQueue.toArray(stringArray);
        System.out.println("Converting queue to array: "+ Arrays.toString(stringArray));

        //72.Write a Java program to convert Priority Queue elements to a string representation.
        System.out.println("Converting queue to string representation: "+stringQueue.toString());

        //73. Write a Java program to change priorityQueue to maximum priorityqueue.
        Queue<String> stringQueue1= new PriorityQueue<>(Collections.reverseOrder());
        stringQueue1.add("mango");
        stringQueue1.add("apple");
        stringQueue1.add("jackfruit");
        stringQueue1.add("banana");
        stringQueue1.add("blueberry");
        stringQueue1.add("mango");
        System.out.println(stringQueue1);



    }
}

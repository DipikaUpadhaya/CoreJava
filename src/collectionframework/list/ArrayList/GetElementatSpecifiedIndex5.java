package collectionframework.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetElementatSpecifiedIndex5 {
    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings.add("ADVF");
        strings.add("dhjns");
        strings.add("qwuiuq");
        strings.add("jsacbkajs");
        System.out.println("Elements in list are: "+strings);

        System.out.println("The element at index 2 is: "+strings.get(2));
    }
}

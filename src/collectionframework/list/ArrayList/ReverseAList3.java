package collectionframework.list.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAList3 {
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("TEXAS");
        stringList.add("California");
        stringList.add("NewYork");
        stringList.add("Colorado");
        stringList.add("Oklahama");
        System.out.println("The original list is: "+stringList);

        Collections.reverse(stringList);
        System.out.println("The reversed list is: "+stringList);
    }
}

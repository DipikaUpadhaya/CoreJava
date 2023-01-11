package streamApi.sorting.comparator;

import java.util.Comparator;

public class FeeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getFee()== o2.getFee()){
            return 0;
        }else if(o1.getFee()> o2.getFee()){
            return 1;
        }else
            return -1;
    }
}

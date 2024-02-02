package defaultInterface.exam03.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("hong");

        for(String i : set) {
            System.out.println(i);
        }
    }
}

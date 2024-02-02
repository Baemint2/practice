package defaultInterface.exam03;

import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("kim");
        arrayList.add("lee");
        arrayList.add("hong");

        String str1 = arrayList.get(0);
        String str2 = arrayList.get(1);
        String str3 = arrayList.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }}

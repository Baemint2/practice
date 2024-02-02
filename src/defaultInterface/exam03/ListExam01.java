package defaultInterface.exam03;

import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("kim");
        arrayList.add("lee");
        arrayList.add("hong");

        String str1 = (String) arrayList.get(0);
        String str2 = (String) arrayList.get(1);
        String str3 = (String) arrayList.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }}

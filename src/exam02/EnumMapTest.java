package exam02;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap eMap = new EnumMap(Day.class);
        eMap.put(Day.SUNDAY, "일요일은 잠자는게 최고!");
        eMap.put(Day.FRIDAY, "불금!!!");
        eMap.put(Day.MONDAY, "월요일 개에바...");

        System.out.println(eMap.get(Day.MONDAY));
    }
}

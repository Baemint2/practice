package exam01;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2};

        Arrays.sort(array);
        // 0, 1, 2, 3, 4
        // 1, 2, 3, 4, 5
        int i = Arrays.binarySearch(array, 5);
        System.out.println(i);
    }
}

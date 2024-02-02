package exam01;

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2};

        Arrays.sort(array);

        for(int i : array) {
            System.out.println(i);
        }
    }
}

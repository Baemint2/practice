package exam01;

import java.util.Arrays;

public class Array05 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 6);
        for(char c : copyTo) {
            System.out.println(c);
        }
    }
}

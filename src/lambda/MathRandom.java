package lambda;

import java.util.function.Supplier;

public class MathRandom {
    public static void main(String[] args) {

        method2(() -> (int)(Math.random()*10));
    }

    public static void method2(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }

}

package defaultInterface.exam02;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.add(5);
        Integer intValue = integerGenericBox.get();
        System.out.println(intValue);
    }
}

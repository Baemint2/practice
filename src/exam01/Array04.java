package exam01;

public class Array04 {
    public static void main(String[] args) {
        ItemForArray[] array1;
        ItemForArray[] array2;

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = new ItemForArray("item" + i, 500 * i);
        }

        for (ItemForArray i : array1) {
            System.out.println(i.getItem() + " " + i.getPrice());
        }
    }
}

package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("Python", 5000);
        items[1] = new Item("자바", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        //sort(Object[])
        Arrays.sort(items, Comparator.comparing(Item::getItem)
        );

        for(Item i:items) {
            System.out.println(i);
        }
    }
}

class ItemSorter implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return item1.getItem().compareTo(item2.getItem());
    }
}

class Item implements Comparable{
    private String item;
    private int price;

    public Item(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }


    // parameter 로 들어온 Object 와 내 자신을 비교
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.item.compareTo(d.item);
//    }
    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    }
}
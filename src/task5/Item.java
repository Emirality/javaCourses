package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Item{
    private final int volume;
    private final int value;

    Item(int volume, int value) {
        this.volume = volume;
        this.value = value;
    }

    public double getEfficiency(){
        return (double) value/volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }

    public static List<Item> generateItemList(){
        List<Item> items = new ArrayList<>();

        items.add(new Item(5,6));
        items.add(new Item(3,10));
        items.add(new Item(2,5));
        items.add(new Item(4,3));
        items.add(new Item(2,2));
        items.add(new Item(1,3));

        items.sort(Comparator.comparing(Item::getEfficiency,Comparator.reverseOrder()));

        return items;
    }

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", value=" + value +
                '}';
    }
}
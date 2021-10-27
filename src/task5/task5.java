package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        Box box = new Box(22);
        Item item1 = new Item(3,3);
        Item item2 = new Item(4,5);
        Item item3 = new Item(2,2);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        items.sort(Comparator.comparing(Item::getEfficiency,Comparator.reverseOrder()));

        System.out.println(items);

        fillBox(box,items);
    }

    public static void fillBox(Box box, List<Item> list){
        int fillingVolume = 0;
        loop: for (Item item : list){
            while(fillingVolume+item.getVolume() < box.getVolume()){
                if (fillingVolume+ item.getVolume() > box.getVolume()){
                    continue loop;
                }
                fillingVolume+=item.getVolume();
            }
        }
        System.out.println(fillingVolume);
    }
}


class Item{
    private int volume;
    private int value;

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

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", value=" + value +
                '}';
    }
}

class Box{
    int volume;

    Box(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}

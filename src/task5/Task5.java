package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        Box box = new Box(40);
        List<Item> itemList = generateItemList();

        box.fillBox(itemList);
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
}

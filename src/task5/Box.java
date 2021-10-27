package task5;

import java.util.ArrayList;
import java.util.List;

public class Box{
    private final int volume;
    public List<Item> items = new ArrayList<>();

    Box(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void fillBox(List<Item> list){
        int fillingVolume = 0;
        for (Item item : list){
            while(fillingVolume+item.getVolume() <= this.getVolume()){
                if (fillingVolume+ item.getVolume() > this.getVolume()){
                    break;
                }
                this.items.add(item);
                fillingVolume+=item.getVolume();
            }
        }
        showBoxValue();
    }

    public  void showBoxValue(){
        int boxValue = 0;
        for (Item item : this.items){
            boxValue += item.getValue();
        }
        System.out.println(boxValue);
    }
}
package task5;

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

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", value=" + value +
                '}';
    }
}
package task2;

public class Ram {

    private final String name;

    private final int volume;

    public Ram() {
        this.name = "Samsung";
        this.volume = 8;
    }

    public Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return  "\tRAM:" +  getName() + "\tVOLUME_RAM:" + getVolume() ;
    }
}

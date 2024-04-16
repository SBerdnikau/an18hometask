package task2;

public class Hdd {

    private final String name;

    private final int volume;

    private final boolean isTypeHdd;

    public Hdd() {
        this.name = "Samsung";
        this.volume = 480;
        this.isTypeHdd = true;
    }

    public Hdd(String name, int volume, boolean isTypeHdd) {
        this.name = name;
        this.volume = volume;
        this.isTypeHdd = isTypeHdd;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isTypeHdd() {
        return isTypeHdd;
    }

    @Override
    public String toString() {
        return  "\tHDD:" + getName() + "\tVOLUME_HDD:" + getVolume() + "\tTYPE:" + (isTypeHdd() ? "Internal" : "External") ;
    }
}

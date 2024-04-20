package task2;

public class Computer {
    private final double price;
    private final String model;
    Ram ram;
    Hdd hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public  Computer(double price, String model, Ram ram, Hdd hdd) {
        this(price, model);
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "PRICE:" + getPrice() + "\tMODEL:" + getModel() + ram.toString() + hdd.toString();
    }
}

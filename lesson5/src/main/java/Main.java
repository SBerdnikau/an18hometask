import task1.CreditCard;
import task2.Computer;
import task2.Hdd;
import task2.Ram;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        CreditCard person_01 = new CreditCard(120001,1500.50);
        CreditCard person_02 = new CreditCard(120002,2500.75);
        CreditCard person_03 = new CreditCard(120003,3500.60);

        person_01.addToCreditCard(1000.50);
        person_02.addToCreditCard(1000);
        person_03.getFromCreditCard(3000.55);

        person_01.getInfoCard();
        person_02.getInfoCard();
        person_03.getInfoCard();

        System.out.println("Task 2");
        Computer computer1 = new Computer(1500.60,"Dell", new Ram(),new Hdd());
        Computer computer2 = new Computer(2500.60,"Asus", new Ram("Kingston",16),new Hdd("Seagate",1000,false));
        System.out.println(computer1);
        System.out.println(computer2);
    }
}

package task1;

public class Main {
    public static void main(String[] args) {
        User sergey = new User("Sergey", Profession.WORKER, 4);
        User anna = new User("Anna", Profession.HR, 5);
        User dmitry = new User("Dmitry", Profession.DIRECTOR, 15);

        System.out.println(sergey + "\tAddSalary:" + sergey.getAdditionalSalary(550));
        System.out.println(anna + "\tAddSalary:" + anna.getAdditionalSalary(230));
        System.out.println(dmitry + "\tAddSalary:" + dmitry.getAdditionalSalary(1000));
    }
}

public class Main{
    public static void main(String[] args) throws Exception {
        Person person = new Person("Sergey", 35, 2500, new Cat("Barsik", 5));
        Person personClone = (Person) person.clone();
        personClone.setName("Alexander");

        System.out.println(person);
        System.out.println(personClone);
        System.out.println(person);

        System.out.println(person.equals(personClone));
    }
}

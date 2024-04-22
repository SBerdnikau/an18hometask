public class Person implements  Cloneable{
    private String name;
    private int age;
    private double salary;
    private Cat cat;

    public Person() {
        this("Undefined", 18, 0, new Cat());
    }

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        setAge(age);
        setSalary(salary);
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setAge(int age) {
        if(age > 0 && age < 110) {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0)  {
            this.salary = salary;
        }
    }

    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = result + age;
        result = (int) (result + salary);
        return result;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if ( !(obj instanceof Person) ) {
            return false;
        }
        Person person = (Person) obj;
        if (name.equals(person.name) &&
                age == person.age &&
                salary == person.salary &&
                cat.getNickname().equals(person.name)  &&
                cat.getAge() == person.age) {
            return true;
        }
        return false;
    }

    public String toString() {
        return  "Name:" + name + "\tAge:" + age + "\tSalary:" + salary + cat;
    }
}

package task1;

public class User {
    private  String name;
    private Profession profession;
    private  int experience;

    public User() {
        this.name = "Undefined";
        profession = Profession.WORKER;
        experience = 0;
    }

    public User(String name, Profession profession, int experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary(Profession profession) {
        double coefficientDir = 0.65;
        double coefficientWorker = 0.55;
        double coefficientHr = 0.25;
        double coefficient = 0;
        switch (profession) {
            case DIRECTOR : {
                coefficient = coefficientDir;
                break;
            }
            case WORKER : {
                coefficient = coefficientWorker;
                break;
            }
            case HR: {
                coefficient = coefficientHr;
                break;
            }
        }
        return 1000 * experience * coefficient;
    }

    public double getAdditionalSalary(double additionalSalary) {
        double currentSalary = getSalary(profession);
        return currentSalary + additionalSalary;
    }

    public String toString() {
        return "Name:" + name + "\tProfession:" + profession + "\tStage:" + experience +
                "\tSalary:" + getSalary(profession) ;
     }

}

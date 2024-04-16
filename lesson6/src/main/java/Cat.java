public class Cat {
    private String nickname;
    private int age;

    public Cat() {
        this("Undefined", 1);
    }

    public Cat(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 20) {
            this.age = age;
        }
    }

    public String toString() {
        return "\tNicknamePet:" + nickname + "\tAgePet:" + age;
    }
}

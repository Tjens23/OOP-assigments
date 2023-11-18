package opgaver.opg32;

public class Person {
    String name, cpr;
    int age;

    public Person(String name, String cpr, int age) {
        this.name = name;
        this.cpr = cpr;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", CPR: " + cpr + ", Age: " + age;
    }

    public String getName() {
        return this.name;
    }

    public String getCpr() {
        return this.cpr;
    }

    public int getAge() {
        return this.age;
    }
}

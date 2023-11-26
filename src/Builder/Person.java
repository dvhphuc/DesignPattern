package Builder;

public class Person {
    String name;
    Integer age;
    String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return String.format("Name: %s, Age: %d, Address: %s", name, age, address);
    }
}

package Builder;

public class PersonBuilder {
    String name;
    Integer age;
    String address;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, age, address);
    }
}

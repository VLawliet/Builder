public class Implementor implements PersonBuilder {
    Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setBirth(String birth) {
        person.birth = birth;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}

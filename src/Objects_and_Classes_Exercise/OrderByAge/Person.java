package Objects_and_Classes_Exercise.OrderByAge;

public class Person {
    private String name;
    int ID;
    int age;

    public Person(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.", name, ID, age);
    }
}

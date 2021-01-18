package Objects_and_Classes_Lab.Students;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public Student(String firstName, String lastName, int age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }
}

package level3.exercise1.classData;

public class Person {
    private String name;
    private int lastName;
    private String dni;

    public Person(String name, int lastName, String nif) {
        this.name = name;
        this.lastName = lastName;
        this.dni = nif;
    }

    public String getName() {
        return name;
    }

    public int getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName=" + lastName +
                ", dni='" + dni + '\'' +
                '}';
    }
}

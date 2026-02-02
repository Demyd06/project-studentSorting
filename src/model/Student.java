package model;

public class Student {
    private String name;
    private String surname;
    private String lastname;

    public Student(String surname, String name, String lastname) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + lastname;
    }
}

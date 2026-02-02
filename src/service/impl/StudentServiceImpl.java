package service.impl;

import model.Student;
import service.StudentService;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class StudentServiceImpl implements StudentService {
    private Student[] listOfStudents = new Student[33];
    private int index = 0;

    @Override
    public void addStudent(String inputText) {
        String[] a = inputText.split("\n");
        for (String s : a) {
            String surname = s.split(" ")[0];
            String name = s.split(" ")[1];
            String lastname = s.split(" ")[2];
            listOfStudents[index] = new Student(surname,name,lastname);
            index++;
        }
    }

    @Override
    public void sortStudent() {
        Collator collator = Collator.getInstance(new Locale("uk","UA"));
        Arrays.sort(listOfStudents, (o1, o2) -> collator.compare(o1.toString(), o2.toString()));
    }

    @Override
    public void getAllStudents() {
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}

package controller;

import service.StudentService;
import service.impl.StudentServiceImpl;

public class StudentController {
    private final StudentService service = new StudentServiceImpl();


    public void addStudent(String inputText){
        service.addStudent(inputText);
    }

    public void sort(){
        service.sortStudent();
    }

    public void getAllStudents(){
        service.getAllStudents();
    }

}

package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
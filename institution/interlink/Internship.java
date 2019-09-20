package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private List<Student> students = new ArrayList<Student>();
    private String name;

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public void setStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public String getStudents() {
        return buildStringOfStudentsNamesFromListOfStudents(students);
    }

    private String buildStringOfStudentsNamesFromListOfStudents(List<Student> students){
        StringBuilder builder = new StringBuilder();
        for (Student student : students) {
            builder.append(student.getName()).append("\n");
        }
        return builder.toString();
    }
}

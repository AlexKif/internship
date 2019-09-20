package institution;

import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> students = new ArrayList<Student>();

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void moveHighLevelStudentsToInternship(int requiredLevel, Internship internship) {
        List<Student> highLevelStudents = getHighLevelStudents(requiredLevel);
        internship.setStudents(highLevelStudents);
    }

    private List<Student> getHighLevelStudents(int requiredLevel) {
        List<Student> highLevelStudents = new ArrayList<Student>();

        for (Student student : students) {
            if (student.getKnowledge().getLevel() >= requiredLevel) highLevelStudents.add(student);
        }

        return highLevelStudents;
    }
}

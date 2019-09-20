package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        Student andrewKostenko = new Student("Andrew Kostenko");
        andrewKostenko.setKnowledge(new Knowledge(9));

        Student juliaVeselkina = new Student("Julia Veselkina");
        juliaVeselkina.setKnowledge(new Knowledge(1));

        Student mariaPerechrest = new Student("Maria Perechrest");
        mariaPerechrest.setKnowledge(new Knowledge(6));

        Internship internship = new Internship("Interlink");

        University university = new University("CH.U.I.");
        university.addStudent(andrewKostenko);
        university.addStudent(juliaVeselkina);
        university.addStudent(mariaPerechrest);
        university.moveHighLevelStudentsToInternship(5, internship);


        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
